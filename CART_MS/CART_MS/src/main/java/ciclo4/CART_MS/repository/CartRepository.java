package ciclo4.CART_MS.repository;

import ciclo4.CART_MS.models.Cart;


import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends MongoRepository<Cart,String> {
    Cart findCartByCartId(String cartId);
    @DeleteQuery
    void deleteCartByCartId(String cartId);
}