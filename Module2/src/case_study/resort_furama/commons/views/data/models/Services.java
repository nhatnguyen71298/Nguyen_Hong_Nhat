package case_study.resort_furama.commons.views.data.models;

public abstract class Services {
    protected Services() {
    }

    abstract void showInfor();
    String nameOfService;
    String area;
    int price;
    int maxMembers;
    String rentalType;

    public Services(String nameOfService, String area, int price, int maxMembers, String rentalType) {
        this.nameOfService = nameOfService;
        this.area = area;
        this.price = price;
        this.maxMembers = maxMembers;
        this.rentalType = rentalType;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public String getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxMembers() {
        return maxMembers;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaxMembers(int maxMembers) {
        this.maxMembers = maxMembers;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
