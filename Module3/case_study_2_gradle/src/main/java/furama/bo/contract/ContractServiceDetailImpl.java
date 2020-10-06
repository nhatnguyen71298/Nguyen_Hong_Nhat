package furama.bo.contract;

import furama.common.Validate;
import furama.common.ValidateImpl;
import furama.dao.contract.ContractDetailDao;
import furama.dao.contract.ContractDetailDaoImpl;
import furama.model.ContractDetail;

public class ContractServiceDetailImpl implements ContractDetailService {

    ContractDetailDaoImpl contractDetailDao=new ContractDetailDaoImpl();
    Validate validate=new ValidateImpl();

    @Override
    public boolean addNewContractDetail(ContractDetail contractDetail) {
        return this.contractDetailDao.addNewContractDetail(contractDetail);
    }

    @Override
    public String validateContractDetail(ContractDetail contractDetail) {
        String messeger="";
        if (!this.validate.validateNumber(contractDetail.getQuantity())){
            messeger = "Input quantity > 0!\n";
        }
        return messeger;
    }
}
