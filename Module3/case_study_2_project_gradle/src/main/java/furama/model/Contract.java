package furama.model;

public class Contract {
    int id,totalMoney,employeeID,customerID,serviceID,dePosst;
    String dayStart,dayEnd;

    public Contract(){};

    public Contract(int id, int totalMoney, int employeeID, int customerID, int serviceID, int dePosst, String dayStart, String dayEnd) {
        this.id = id;
        this.totalMoney = totalMoney;
        this.employeeID = employeeID;
        this.customerID = customerID;
        this.serviceID = serviceID;
        this.dePosst = dePosst;
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

    public int getDePosst() {
        return dePosst;
    }

    public void setDePosst(int dePosst) {
        this.dePosst = dePosst;
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
