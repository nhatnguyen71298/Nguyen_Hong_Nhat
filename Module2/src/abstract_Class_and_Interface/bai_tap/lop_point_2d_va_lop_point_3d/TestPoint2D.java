package abstract_Class_and_Interface.bai_tap.lop_point_2d_va_lop_point_3d;

public class TestPoint2D {
    public static void main(String[] args) {

        Point2D point1= new Point2D();
        Point2D point2= new Point2D((float) 3.5,(float) 5.5);
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        point1.setXY((float) 4,3);
        System.out.println("Point1 sao khi setXY: "+point1.toString());
    }
}
