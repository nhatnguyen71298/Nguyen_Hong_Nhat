package dao.product;

import bo.product.ProductService;
import dao.BaseDao;
import model.Product;
import model.TypeCatelory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao{
    BaseDao baseDao =new BaseDao();

    @Override
    public boolean addNewProduct(Product product) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement= this.baseDao.getConnection().prepareStatement("insert into product values (?,?,?,?,?,?);");
            preparedStatement.setString(1,product.getStt());
            preparedStatement.setString(2,product.getName());
            preparedStatement.setString(3,product.getPrice());
            preparedStatement.setString(4,product.getQuantity());
            preparedStatement.setString(5,product.getColorID());
            preparedStatement.setString(6,product.getCateloryID());
            int check=preparedStatement.executeUpdate();
            if (check>0){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Product> allProduct() {
        List<Product> productList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement("select * from product ;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String stt = resultSet.getString("stt");
                String name = resultSet.getString("name");
                String price = resultSet.getString("price");
                String quantity = resultSet.getString("quantity");
                String colorID = resultSet.getString("id_color");
                String cateloryID = resultSet.getString("id_type_catelory");
                Product product=new Product(stt,name,price,quantity,colorID,cateloryID);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public boolean deleteBySTT(String stt) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement= this.baseDao.getConnection().prepareStatement(
                    "delete from product"+
                            " where stt=?;"
            );
            preparedStatement.setString(1,stt);
            int check=preparedStatement.executeUpdate();
            if (check>0){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }
}
