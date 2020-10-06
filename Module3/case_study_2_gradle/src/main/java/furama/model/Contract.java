package furama.model;

public class Contract {
    int id,totalMoney,employeeID,customerID,serviceID, deposit;
    String dayStart,dayEnd;

    public Contract(){};

    public Contract(int id, int totalMoney, int employeeID, int customerID, int serviceID, int deposit, String dayStart, String dayEnd) {
        this.id = id;
        this.totalMoney = totalMoney;
        this.employeeID = employeeID;
        this.customerID = customerID;
        this.serviceID = serviceID;
        this.deposit = deposit;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public Contract(int totalMoney, int employeeID, int customerID, int serviceID, int deposit, String dayStart, String dayEnd) {
        this.totalMoney = totalMoney;
        this.employeeID = employeeID;
        this.customerID = customerID;
        this.serviceID = serviceID;
        this.deposit = deposit;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }
}
