package case_study.resort_furama.commons.views.data.models;

public class Customer {
    String name;
    String birthday;
    int cmnd;
    int phoneNumber;
    String email;
    String typeCustomer;
    String address;
    int yearBirthday;
    Customer(){

    }

    public Customer(String name, String birthday, int cmnd, int phoneNumber, String email, String typeCustomer, String address) {
        this.name = name;
        this.birthday = birthday;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearBirthday() {
        String temp=birthday.substring(7,10);
        yearBirthday= Integer.parseInt(temp);
        return yearBirthday;
    }
    public String services(String service){
        return service;
    }
    public void showInfor(){
        System.out.println("Name of customer: "+getName()+
                "\nBirthday: "+getBirthday()+
                "\nID: "+getCmnd()+
                "\nPhone number: "+getPhoneNumber()+
                "\nEmail: "+getEmail()+
                "\nType: "+getTypeCustomer()+
                "\nAddress: "+getAddress());
    }
}
