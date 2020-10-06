package furama.dao.contract;

import furama.dao.BaseDao;
import furama.model.Contract;
import furama.model.Employee;
import furama.model.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDaoImpl implements ContractDao {
    BaseDao baseDao =new BaseDao();
    String addNewContract="insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien)"+
            " values(?,?,?,?,?,?,?);";
    String displayAllContract="select * from hop_dong;";

    @Override
    public boolean addNewContract(Contract contract) {
        boolean flag =false;
        try {
            PreparedStatement preparedStatement = baseDao.getConnection().prepareStatement(addNewContract);
            preparedStatement.setInt(1, contract.getEmployeeID());
            preparedStatement.setInt(2, contract.getCustomerID());
            preparedStatement.setInt(3, contract.getServiceID());
            preparedStatement.setString(4, contract.getDayStart());
            preparedStatement.setString(5, contract.getDayEnd());
            preparedStatement.setInt(6, contract.getDeposit());
            preparedStatement.setInt(7, contract.getTotalMoney());
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
    public List<Contract> displayAllContract() {
        List<Contract> allContract = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDao.getConnection().prepareStatement(displayAllContract);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id=Integer.parseInt(resultSet.getString("id_hop_dong"));
                int idEmployee=Integer.parseInt(resultSet.getString("id_nhan_vien"));
                int idCustomer=Integer.parseInt(resultSet.getString("id_khach_hang"));
                int idService=Integer.parseInt(resultSet.getString("id_dich_vu"));
                String dayStart=resultSet.getString("ngay_lam_hop_dong");
                String dayEnd=resultSet.getString("ngay_lam_hop_dong");
                int deposit=Integer.parseInt(resultSet.getString("tien_dat_coc"));
                int total=Integer.parseInt(resultSet.getString("tong_tien"));
                Contract newContract =new Contract(id, total, idEmployee, idCustomer, idService, deposit, dayStart,dayEnd);
                allContract.add(newContract);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allContract;
    }
}
