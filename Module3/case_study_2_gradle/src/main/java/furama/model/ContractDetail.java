package furama.model;

public class ContractDetail {
    int id,contractID,attachService,quantity;

    ContractDetail(){}

    public ContractDetail(int id, int contractID, int attachService, int quantity) {
        this.id = id;
        this.contractID = contractID;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public ContractDetail(int contractID, int attachService, int quantity) {
        this.contractID = contractID;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public int getAttachService() {
        return attachService;
    }

    public void setAttachService(int attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
