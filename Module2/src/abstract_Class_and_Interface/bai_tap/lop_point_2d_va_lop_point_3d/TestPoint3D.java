package abstract_Class_and_Interface.bai_tap.lop_point_2d_va_lop_point_3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point1=new Point3D();
        System.out.println("Point1 non setup: "+point1.toString()+"\n");

        Point3D point2=new Point3D((float) 5);
        System.out.println("Point2 z=5,non setup x,y : "+point2.toString()+"\n");

        Point3D point3=new Point3D((float) 3.5,(float)3.7,(float)7.6);
        System.out.println("Point3 setup: x=3,5, y=3,7, z=7,6: "+point3.toString()+"\n");

        point1.setXYZ((float) 3,5,7);
        System.out.println("Point1 setup: x=3, y=5, z=7: "+point1.toString()+"\n");

        point2.setXYZ((float)2,4,6);
        System.out.println("Point2 setup: x=2, y=4, z=6: "+point2.toString());

    }
}
