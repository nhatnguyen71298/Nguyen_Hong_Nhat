package furama.model;

public class Service {
    int id,price,rentalTypeID,serviceTypeID;
    String name,area,maxPeople,floos,areaFool,orther,standardRoom;

    public Service(){}

    public Service(int price, int rentalTypeID, int serviceTypeID, String name, String area, String maxPeople, String floos, String areaFool, String orther, String standardRoom) {
        this.price = price;
        this.rentalTypeID = rentalTypeID;
        this.serviceTypeID = serviceTypeID;
        this.name = name;
        this.area = area;
        this.maxPeople = maxPeople;
        this.floos = floos;
        this.areaFool = areaFool;
        this.orther = orther;
        this.standardRoom = standardRoom;
    }

    public Service(int id, int price, int rentalTypeID, int serviceTypeID, String name, String area, String maxPeople, String floos, String areaFool, String orther, String standardRoom) {
        this.id = id;
        this.price = price;
        this.rentalTypeID = rentalTypeID;
        this.serviceTypeID = serviceTypeID;
        this.name = name;
        this.area = area;
        this.maxPeople = maxPeople;
        this.floos = floos;
        this.areaFool = areaFool;
        this.orther = orther;
        this.standardRoom = standardRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRentalTypeID() {
        return rentalTypeID;
    }

    public void setRentalTypeID(int rentalTypeID) {
        this.rentalTypeID = rentalTypeID;
    }

    public int getServiceTypeID() {
        return serviceTypeID;
    }

    public void setServiceTypeID(int serviceTypeID) {
        this.serviceTypeID = serviceTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getFloos() {
        return floos;
    }

    public void setFloos(String floos) {
        this.floos = floos;
    }

    public String getAreaFool() {
        return areaFool;
    }

    public void setAreaFool(String areaFool) {
        this.areaFool = areaFool;
    }

    public String getOrther() {
        return orther;
    }

    public void setOrther(String orther) {
        this.orther = orther;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }
}
