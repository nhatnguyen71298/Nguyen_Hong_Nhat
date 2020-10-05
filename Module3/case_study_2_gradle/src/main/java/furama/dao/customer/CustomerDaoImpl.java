package furama.dao.customer;

import furama.dao.BaseDao;
import furama.model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    BaseDao baseDao=new BaseDao();
    String addNewCustomer= "insert into khach_hang(id_loai_khach,ho_va_ten,birthday,gioi_tinh,so_cmnd,sdt,email,dia_chi) " +
            "values " +
            " (?,?,?,?,?,?,?,?) ; ";
    String  displayAllCustomer="select * from khach_hang;";
    String  delelteCustomerByID="delete from khach_hang where id_khach_hang = ?;";
    String  getCustomerByID="select * from khach_hang where id_khach_hang = ?;";
    String  editCustomer="update khach_hang " +
            "set id_loai_khach= ?, ho_va_ten= ?, birthday= ? , gioi_tinh= ?, so_cmnd= ?, sdt= ? , email= ? , dia_chi= ? " +
            "where id_khach_hang = ? ;";

    @Override

    public boolean addNewCustomer(Customer customer) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement = baseDao.getConnection().prepareStatement(addNewCustomer);
            preparedStatement.setInt(1, customer.getType_id());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getBirthday());
            preparedStatement.setString(4, customer.getGender());
            preparedStatement.setString(5, customer.getCmnd());
            preparedStatement.setString(6, customer.getPhoneNumber());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            int check= preparedStatement.executeUpdate();
            if (check>0){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Customer> displayAllCustomer() {
        List<Customer> allCustomer = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement(displayAllCustomer);

            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                int idCustomer = Integer.parseInt(resultSet.getString("id_khach_hang"));
                int idService = Integer.parseInt(resultSet.getString("id_loai_khach"));
                String name = resultSet.getString("ho_va_ten");
                String birthday = resultSet.getString("birthday");
                String gender = resultSet.getString("gioi_tinh");
                String cmnd = resultSet.getString("so_cmnd");
                String phoneNumber = resultSet.getString("sdt");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                customer = new Customer(idCustomer, idService, name, birthday, gender, cmnd, phoneNumber, email, address);
                allCustomer.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allCustomer;
    }

    @Override
    public boolean delCustomer(int id) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement(delelteCustomerByID);
            preparedStatement.setInt(1,id);
            if (preparedStatement.executeUpdate()>0){
                flag=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Customer getCustomerByID(int id) {
        Customer customer=new Customer();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement(getCustomerByID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idCustomer = Integer.parseInt(resultSet.getString("id_khach_hang"));
                int idService = Integer.parseInt(resultSet.getString("id_loai_khach"));
                String name = resultSet.getString("ho_va_ten");
                String birthday = resultSet.getString("birthday");
                String gender = resultSet.getString("gioi_tinh");
                String cmnd = resultSet.getString("so_cmnd");
                String phoneNumber = resultSet.getString("sdt");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                customer = new Customer(idCustomer, idService, name, birthday, gender, cmnd, phoneNumber, email, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public boolean editCustomer(Customer customer) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement = baseDao.getConnection().prepareStatement(editCustomer);
            preparedStatement.setInt(1, customer.getType_id());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getBirthday());
            preparedStatement.setString(4, customer.getGender());
            preparedStatement.setString(5, customer.getCmnd());
            preparedStatement.setString(6, customer.getPhoneNumber());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            preparedStatement.setInt(9, customer.getId());
            int check = preparedStatement.executeUpdate();
            if (check>0){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }
}
