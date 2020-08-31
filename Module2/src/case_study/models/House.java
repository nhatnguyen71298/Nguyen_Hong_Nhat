package case_study.models;

public class House extends Services {
    String typeRoom;
    String otherAmenities;
    int numberFloors;

    public House(){
    }

    public House(String nameOfService,String area, int price, int maxMembers, String rentalType, String typeRoom, String otherAmenities,int numberFloors){
        super(nameOfService,area,price,maxMembers,rentalType);
        this.typeRoom = typeRoom;
        this.otherAmenities = otherAmenities;
        this.numberFloors = numberFloors;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public String getOtherAmenities() {
        return otherAmenities;
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

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public void showInfor() {
        System.out.println("Name of Service: "+getNameOfService()+
                "\nArea: "+getArea()+
                "\nPrice: "+getPrice()+
                "\nMax Member: "+getMaxMembers()+
                "\nRental type: "+getRentalType()+
                "\nType Room: "+getTypeRoom()+
                "\nOther Amenities: "+getOtherAmenities()+
                "\nNumber of floors: "+getNumberFloors());
    }
}
