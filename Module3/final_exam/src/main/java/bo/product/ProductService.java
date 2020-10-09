package bo.product;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> allProduct();
    boolean addNewProduct(Product product);
    boolean deleteBySTT(String stt);
}
