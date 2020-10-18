package customer.services;

import customer.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductServiceImp implements ProductService{
    private static Map<String, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put("1", new Product("1", "Coca", "1$", "Hanoi"));
        productMap.put("2", new Product("2", "Pepsi", "1$", "Danang"));
        productMap.put("3", new Product("3", "7up", "1$", "Saigon"));
        productMap.put("4", new Product("4", "Monster", "3$", "Beijin"));
        productMap.put("5", new Product("5", "Mirinda", "1$", "Miami"));
        productMap.put("6", new Product("6", "Revive", "1$", "Newyork"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(String id) {
        return productMap.get(id);
    }

    @Override
    public void update(String id, Product product) {
         productMap.put(id,product);
    }

    @Override
    public void remove(String id) {
        productMap.remove(id);
    }
}
