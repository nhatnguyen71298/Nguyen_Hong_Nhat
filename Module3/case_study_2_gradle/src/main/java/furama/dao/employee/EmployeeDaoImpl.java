package furama.dao.employee;

import furama.dao.BaseDao;
import furama.model.Customer;
import furama.model.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {


    BaseDao baseDao=new BaseDao();
    String addNewEmployee= "insert into nhan_vien(id_vi_tri,id_trinh_do,id_bo_phan,ho_va_ten,birthday,so_cmnd,luong,sdt,email,dia_chi) " +
            "values " +
            " (?,?,?,?,?,?,?,?,?,?) ; ";
    String  displayAllEmployee="select * from nhan_vien;";
    String  delelteEmployeeByID="delete from nhan_vien where id_nhan_vien = ?;";
    String  getEmployeeByID="select * from nhan_vien where id_nhan_vien = ?;";
    String  editEmployee="update nhan_vien " +
            "set id_vi_tri=?,id_trinh_do=?,id_bo_phan=?,ho_va_ten=?,birthday=?,so_cmnd=?,luong=?,sdt=?,email=?,dia_chi=? " +
            "where id_nhan_vien = ? ;";


    @Override
    public boolean addNewEmployee(Employee employee) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement = baseDao.getConnection().prepareStatement(addNewEmployee);
            preparedStatement.setInt(1,employee.getPostion_id());
            preparedStatement.setInt(2,employee.getEducation_id());
            preparedStatement.setInt(3,employee.getDivision_id());
            preparedStatement.setString(4,employee.getName());
            preparedStatement.setString(5,employee.getBirthday());
            preparedStatement.setString(6,employee.getCmnd());
            preparedStatement.setString(7,employee.getSalary());
            preparedStatement.setString(8,employee.getPhoneNumber());
            preparedStatement.setString(9,employee.getEmail());
            preparedStatement.setString(10,employee.getAddress());
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
    public boolean delEmployee(int id) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement(delelteEmployeeByID);
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
    public List<Employee> displayAllEmployee() {
        List<Employee> allEmployee = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement(displayAllEmployee);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee;
            //    id,postion_id,education_id,division_id;
//    name,birthday,cmnd, salary, phoneNumber,email,address;
            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id_nhan_vien"));
                int postion_id = Integer.parseInt(resultSet.getString("id_vi_tri"));
                int education_id = Integer.parseInt(resultSet.getString("id_trinh_do"));
                int division_id = Integer.parseInt(resultSet.getString("id_bo_phan"));
                String name = resultSet.getString("ho_va_ten");
                String birthday = resultSet.getString("birthday");
                String cmnd = resultSet.getString("so_cmnd");
                String salary = resultSet.getString("luong");
                String phoneNumber = resultSet.getString("sdt");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                employee = new Employee(id,postion_id,education_id,division_id,name,birthday,cmnd,salary,phoneNumber,email,address);
                allEmployee.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allEmployee;
    }

    @Override
    public boolean editEmployee(Employee employee) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement = baseDao.getConnection().prepareStatement(editEmployee);
            preparedStatement.setInt(1,employee.getPostion_id());
            preparedStatement.setInt(2,employee.getEducation_id());
            preparedStatement.setInt(3,employee.getDivision_id());
            preparedStatement.setString(4,employee.getName());
            preparedStatement.setString(5,employee.getBirthday());
            preparedStatement.setString(6,employee.getCmnd());
            preparedStatement.setString(7,employee.getSalary());
            preparedStatement.setString(8,employee.getPhoneNumber());
            preparedStatement.setString(9,employee.getEmail());
            preparedStatement.setString(10,employee.getAddress());
            preparedStatement.setInt(11,employee.getId());
            int check = preparedStatement.executeUpdate();
            if (check>0){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Employee getEmployeeByID(int id) {
        Employee employee=new Employee();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement(getEmployeeByID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int postion_id = Integer.parseInt(resultSet.getString("id_vi_tri"));
                int education_id = Integer.parseInt(resultSet.getString("id_trinh_do"));
                int division_id = Integer.parseInt(resultSet.getString("id_bo_phan"));
                String name = resultSet.getString("ho_va_ten");
                String birthday = resultSet.getString("birthday");
                String cmnd = resultSet.getString("so_cmnd");
                String salary = resultSet.getString("luong");
                String phoneNumber = resultSet.getString("sdt");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                employee = new Employee(id,postion_id,education_id,division_id,name,birthday,cmnd,salary,phoneNumber,email,address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
