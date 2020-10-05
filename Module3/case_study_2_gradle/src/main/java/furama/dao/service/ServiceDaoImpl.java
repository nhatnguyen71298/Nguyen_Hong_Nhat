package furama.dao.service;

import furama.dao.BaseDao;
import furama.model.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServiceDaoImpl implements ServiceDao {
    BaseDao baseDao =new BaseDao();
    String addNewService="insert into dich_vu(chi_phi_thue, id_kieu_thue,id_loai_dich_vu,ten_dich_vu,dien_tich,so_nguoi_toi_da,so_tang,dien_tich_ho_boi,trang_thai,tieu_chuan_phong)"+
            " values"+
            " (?,?,?,?,?,?,?,?,?,?);";
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
}
