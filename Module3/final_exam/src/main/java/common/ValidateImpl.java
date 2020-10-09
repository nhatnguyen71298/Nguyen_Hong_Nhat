package common;

import model.Product;

public class ValidateImpl {
    public String validateProduct(Product product) {
        String messenger="";
//        if (!(product.getName().equals(null)){
//            messenger="Please input name!";
//        }
        if ((Integer.parseInt(product.getPrice())<10000000)){
            messenger="Input price>10000000";
        }
        if ((Integer.parseInt(product.getQuantity())<0)){
            messenger+="Input quantity> 0";
        }
        return messenger;
    }
}
