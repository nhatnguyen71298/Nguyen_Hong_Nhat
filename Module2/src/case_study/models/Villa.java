package case_study.models;

public class Villa extends Services {
    String typeRoom;
    String otherAmenities;
    String areaSwim;
    int numberFloors;

    public Villa(){

    }

    public Villa(String typeRoom, String otherAmenities, String areaSwim, int numberFloors){

        this.typeRoom=typeRoom;
        this.otherAmenities=otherAmenities;
        this.areaSwim=areaSwim;
        this.numberFloors=numberFloors;
    }

    public Villa(String nameOfService, String area, int price, int maxMembers, String rentalType,String typeRoom, String otherAmenities, String areaSwim, int numberFloors){
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

    public String getAreaSwim() {
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

    public void setAreaSwim(String areaSwim) {
        this.areaSwim = areaSwim;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public void showInfor() {
        System.out.println("Name of Service:"+getNameOfService()+
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
