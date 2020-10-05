package furama.model;

public class Employee {
    int id,postion_id,education_id,division_id;
    String name,birthday,cmnd, salary, phoneNumber,email,address;
    public Employee(){

    }

    public Employee(int id, int postion_id, int education_id, int division_id, String name, String birthday, String cmnd, String salary, String phoneNumber, String email, String address) {
        this.id = id;
        this.postion_id = postion_id;
        this.education_id = education_id;
        this.division_id = division_id;
        this.name = name;
        this.birthday = birthday;
        this.cmnd = cmnd;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostion_id() {
        return postion_id;
    }

    public void setPostion_id(int postion_id) {
        this.postion_id = postion_id;
    }

    public int getEducation_id() {
        return education_id;
    }

    public void setEducation_id(int education_id) {
        this.education_id = education_id;
    }

    public int getDivision_id() {
        return division_id;
    }

    public void setDivision_id(int division_id) {
        this.division_id = division_id;
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

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(int postion_id, int education_id, int division_id, String name, String birthday, String cmnd, String salary, String phoneNumber, String email, String address) {
        this.postion_id = postion_id;
        this.education_id = education_id;
        this.division_id = division_id;
        this.name = name;
        this.birthday = birthday;
        this.cmnd = cmnd;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}
