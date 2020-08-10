package abstract_Class_and_Interface.bai_tap.point_movablepoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point1= new Point();
        System.out.println(point1.toString());
        Point point2=new Point((float) 1,3);
        System.out.println(point2.toString());
        point1.setXY((float)5,7);
        System.out.println(point1.toString());
    }
}
