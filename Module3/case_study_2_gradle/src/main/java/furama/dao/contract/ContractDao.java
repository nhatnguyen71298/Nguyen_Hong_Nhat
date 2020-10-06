package furama.dao.contract;

import furama.model.Contract;

import java.util.List;

public interface ContractDao {
    boolean addNewContract(Contract contract);
    List<Contract> displayAllContract();
}
