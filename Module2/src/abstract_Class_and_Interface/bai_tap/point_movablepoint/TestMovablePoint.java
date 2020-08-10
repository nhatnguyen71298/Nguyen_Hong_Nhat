package abstract_Class_and_Interface.bai_tap.point_movablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point1= new MovablePoint();
        System.out.println(point1.toString()+"\n");

        MovablePoint point2= new MovablePoint((float)5,7);
        System.out.println(point2.toString()+"\n");

        MovablePoint point3=new MovablePoint((float)1,3,5,7);
        System.out.println(point3.toString()+"\n");

        point1.setXY((float) 1,3);
        point1.setSpeed((float)5,7);
        point1.getXY();
        point1.getSpeed();
        System.out.println(point1.toString()+"\n");

        point2.setXY((float)1,3);
        point2.getXY();
        System.out.println(point2.toString()+"\n");
    }
}
