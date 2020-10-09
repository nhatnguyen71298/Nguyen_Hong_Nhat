package bo.product;

import common.ValidateImpl;
import dao.product.ProductDaoImpl;
import model.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDaoImpl productDao=new ProductDaoImpl();
    ValidateImpl validate=new ValidateImpl();
    @Override
    public boolean addNewProduct(Product product) {
        return this.productDao.addNewProduct(product);
    }

    @Override
    public List<Product> allProduct() {
        return this.productDao.allProduct();
    }

    @Override
    public boolean deleteBySTT(String stt) {
        return this.productDao.deleteBySTT(stt);
    }

    public String validateProdutc(Product product){
        return this.validate.validateProduct(product);
    }
}
