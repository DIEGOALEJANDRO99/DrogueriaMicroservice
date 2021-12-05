package ciclo4.CART_MS.services;

import ciclo4.CART_MS.models.Cart;
import ciclo4.CART_MS.repository.CartRepository;
import ciclo4.CART_MS.models.Cart;
import ciclo4.CART_MS.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CartService {
    private final CartRepository cartRepository;

    public List<Cart> getAllCarts(){
        return cartRepository.findAll();
    }
    public Cart findCartById(String cartId){

        return cartRepository.findCartByCartId(cartId);
    }
    public Cart createCart(Cart cart){
        return cartRepository.insert(cart);
    }
    public void deleteCart(String cartId){
        cartRepository.deleteCartByCartId(cartId);
    }
}
