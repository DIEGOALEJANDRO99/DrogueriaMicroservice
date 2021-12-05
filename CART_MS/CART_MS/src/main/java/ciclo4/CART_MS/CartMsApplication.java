package ciclo4.CART_MS;

import ciclo4.CART_MS.models.Cart;
import ciclo4.CART_MS.models.Products;
import ciclo4.CART_MS.repository.CartRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class CartMsApplication {

	public static void main(String[] args) {SpringApplication.run(CartMsApplication.class, args);}
@Bean
	CommandLineRunner runner(CartRepository repository){
		return args -> {
			Products isodine = new Products("1","isodine", 3500);
			Products alcohol = new Products("2","alcohol",3000);
			Products algodon = new Products("3","algodon", 1500);
			Products[] listProduct = new Products[]{isodine,alcohol,algodon};

			Cart cart =  new Cart("3", List.of(listProduct));
			repository.insert(cart);
		};

	}

}
