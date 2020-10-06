package furama.bo.contract;

import furama.common.Validate;
import furama.common.ValidateImpl;
import furama.dao.contract.ContractDaoImpl;
import furama.model.Contract;

import java.util.List;

public class ContractServiceImpl implements ContractService {
    ContractDaoImpl contractDao =new ContractDaoImpl();
    ValidateImpl validate=new ValidateImpl();

    @Override
    public boolean addNewContract(Contract contract) {
        return this.contractDao.addNewContract(contract);
    }

    @Override
    public List<Contract> displayAllContract() {
        return this.contractDao.displayAllContract();
    }

    @Override
    public String validateContract(Contract contract) {
        String messeger="";
        if (!this.validate.validateNumber(contract.getDeposit())){
            messeger = "Input deposit > 0!\n";
        }
        if (!this.validate.validateNumber(contract.getTotalMoney())){
            messeger += "Input total money >0!\n";
        }
        return messeger;
    }
}
