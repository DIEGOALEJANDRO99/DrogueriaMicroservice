package ciclo4.CART_MS.controller;

import ciclo4.CART_MS.models.Cart;
import ciclo4.CART_MS.services.CartService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/firstPage")
@AllArgsConstructor
public class CartController {
    private final CartService cartService;

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/cart/{cartId}")
    public Cart getCart(@PathVariable String cartId) {
        return cartService.findCartById(cartId);
    }

    @PostMapping("/createCart")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cart createCart(@RequestBody Cart cart) {

        return cartService.createCart(cart);

    }
    @DeleteMapping("/deleteCart/{cartId}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void deleteCart(@PathVariable String cartId){

            cartService.deleteCart(cartId);
    }
}