package case_study.models;

import java.util.Date;

public class Villa extends Services {
    String typeRoom;
    String otherAmenities;
    int areaSwim;
    int numberFloors;

    public Villa(){
    }

    public Villa(String typeRoom, String otherAmenities, int areaSwim, int numberFloors){
        this.typeRoom=typeRoom;
        this.otherAmenities=otherAmenities;
        this.areaSwim=areaSwim;
        this.numberFloors=numberFloors;
    }

    public Villa(String nameOfService, int area, int price, int maxMembers, Date rentalType,String typeRoom, String otherAmenities, int areaSwim, int numberFloors){
        super(nameOfService,area,price,maxMembers,rentalType);
        this.typeRoom = typeRoom;
        this.otherAmenities = otherAmenities;
        this.areaSwim = areaSwim;
        this.numberFloors = numberFloors;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public String getOtherAmenities() {
        return otherAmenities;
    }

    public int getAreaSwim() {
        return areaSwim;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public void setOtherAmenities(String otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public void setAreaSwim(int areaSwim) {
        this.areaSwim = areaSwim;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    void ShowInfor() {
        System.out.println("Name of Service: Villa"+
                "\nArea: "+getArea()+
                "\nPrice: "+getPrice()+
                "\nMax Member: "+getMaxMembers()+
                "\nRental type: "+getRentalType()+
                "\nType Room: "+getTypeRoom()+
                "\nOther Amenities: "+getOtherAmenities()+
                "\nArea of Swimming: "+getAreaSwim()+
                "\nNumber of floors: "+getNumberFloors()
    );
    }
}
