package case_study.models;

public class Room extends Services {
    String freeService;

    public Room(){
    }

    public Room(String freeService){
        this.freeService=freeService;
    }

    public Room(String nameOfService, float area, int price, int maxMembers, String rentalType,String freeService){
        super(nameOfService,area,price,maxMembers,rentalType);
        this.freeService=freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public void showInfor() {
        System.out.println("Name of Service: Room"+
                "\nArea: "+getArea()+
                "\nPrice: "+getPrice()+
                "\nMax Member: "+getMaxMembers()+
                "\nRental type: "+getRentalType()+
                "\nFree Service: "+getFreeService()
        );
    }
}
