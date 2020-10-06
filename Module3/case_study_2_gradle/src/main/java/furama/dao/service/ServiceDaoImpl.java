package furama.dao.service;

import furama.dao.BaseDao;
import furama.model.Employee;
import furama.model.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDaoImpl implements ServiceDao {
    BaseDao baseDao =new BaseDao();
    String addNewService="insert into dich_vu(chi_phi_thue, id_kieu_thue,id_loai_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,so_tang,dien_tich_ho_boi,trang_thai,tieu_chuan_phong)"+
            " values"+
            " (?,?,?,?,?,?,?,?,?,?);";
    String displayAllService="select * from dich_vu;";
    //                name,area,maxPeople,floos,areaFool,orther,standardRoom
    @Override
    public boolean addNewService(Service service) {
        boolean flag =false;
        try {
            PreparedStatement preparedStatement = baseDao.getConnection().prepareStatement(addNewService);
            preparedStatement.setInt(1, service.getPrice());
            preparedStatement.setInt(2, service.getRentalTypeID());
            preparedStatement.setInt(3, service.getServiceTypeID());
            preparedStatement.setString(4, service.getName());
            preparedStatement.setString(5, service.getArea());
            preparedStatement.setString(6, service.getMaxPeople());
            preparedStatement.setString(7, service.getFloos());
            preparedStatement.setString(8, service.getAreaFool());
            preparedStatement.setString(9, service.getOrther());
            preparedStatement.setString(10, service.getStandardRoom());
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
    public List<Service> displayAllService() {
        List<Service> allService = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement(displayAllService);
            ResultSet resultSet = preparedStatement.executeQuery();
            //    id,postion_id,education_id,division_id;
//    name,birthday,cmnd, salary, phoneNumber,email,address;
            while (resultSet.next()) {
                int id=Integer.parseInt(resultSet.getString("id_dich_vu"));
                int price=Integer.parseInt(resultSet.getString("chi_phi_thue"));
                int rentalTypeID=Integer.parseInt(resultSet.getString("id_kieu_thue"));
                int serviceTypeID=Integer.parseInt(resultSet.getString("id_loai_dich_vu"));
                String name=resultSet.getString("ten_dich_vu");
                String area=resultSet.getString("dien_tich");
                String maxPeople=resultSet.getString("so_nguoi_toi_da");
                String floos=resultSet.getString("so_tang");
                String areaFool=resultSet.getString("dien_tich_ho_boi");
                String orther=resultSet.getString("trang_thai");
                String standardRoom=resultSet.getString("tieu_chuan_phong");
                Service newService =new Service(id,price,rentalTypeID,serviceTypeID,name,area,maxPeople,floos,areaFool,orther,standardRoom);
                allService.add(newService);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allService;
    }
}
