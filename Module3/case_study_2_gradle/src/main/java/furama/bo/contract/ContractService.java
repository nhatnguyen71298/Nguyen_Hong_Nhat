package furama.bo.contract;

import furama.model.Contract;

import java.util.List;

public interface ContractService {
    boolean addNewContract(Contract contract);
    List<Contract> displayAllContract();
    String validateContract(Contract contract);
}
