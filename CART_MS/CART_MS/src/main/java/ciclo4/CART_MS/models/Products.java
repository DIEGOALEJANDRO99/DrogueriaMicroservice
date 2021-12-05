package ciclo4.CART_MS.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Data
@AllArgsConstructor
public class Products {
    @Id
    private String idProduct;
    private String nameProduct;
    private int priceProduct;



}


