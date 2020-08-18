package case_study.models;

import java.util.Date;

public abstract class Services {
    protected Services() {
    }

    abstract void ShowInfor();
    String nameOfService;
    int area;
    int price;
    int maxMembers;
    Date rentalType;

    public Services(String nameOfService, int area, int price, int maxMembers, Date rentalType) {
        this.nameOfService = this.nameOfService;
        this.area = this.area;
        this.price = this.price;
        this.maxMembers = this.maxMembers;
        this.rentalType = this.rentalType;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxMembers() {
        return maxMembers;
    }

    public Date getRentalType() {
        return rentalType;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaxMembers(int maxMembers) {
        this.maxMembers = maxMembers;
    }

    public void setRentalType(Date rentalType) {
        this.rentalType = rentalType;
    }
}
