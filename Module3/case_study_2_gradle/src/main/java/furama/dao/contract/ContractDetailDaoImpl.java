package furama.dao.contract;

import furama.dao.BaseDao;
import furama.model.ContractDetail;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContractDetailDaoImpl implements ContractDetailDao {
    BaseDao baseDao=new BaseDao();
    String addNewContractDetail="insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)"+
            " values (?,?,?);";
    @Override
    public boolean addNewContractDetail(ContractDetail contractDetail) {
        boolean flag=false;
        try {
            PreparedStatement preparedStatement=this.baseDao.getConnection().prepareStatement(addNewContractDetail);
            preparedStatement.setInt(1,contractDetail.getContractID());
            preparedStatement.setInt(2,contractDetail.getAttachService());
            preparedStatement.setInt(3,contractDetail.getQuantity());
            if (preparedStatement.executeUpdate()>0){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }
}
