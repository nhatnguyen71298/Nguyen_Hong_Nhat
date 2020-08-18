package case_study.models;

public class TestShowInfor {
    public static void main(String[] args) {
        Services myVilla= new Villa("Vip","Food",250,4);
        myVilla.ShowInfor();
        Services myHouse= new House("Vip","Food",4);
        myHouse.ShowInfor();
        Services myRoom= new Room("Buffet");
        myRoom.ShowInfor();
    }
}
