package dao.product;

import model.Product;

import java.util.List;

public interface ProductDao {
    boolean addNewProduct(Product product);
    List<Product> allProduct();
    boolean deleteBySTT(String stt);
}
