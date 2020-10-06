package furama.bo.contract;

import furama.model.ContractDetail;

public interface ContractDetailService {
    boolean addNewContractDetail(ContractDetail contractDetail);
    String validateContractDetail(ContractDetail contractDetail);
}
