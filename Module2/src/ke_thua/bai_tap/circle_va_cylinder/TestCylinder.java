package ke_thua.bai_tap.circle_va_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1= new Cylinder();
        System.out.println("Cylinder1:\n"+cylinder1.toString()+"\n");
        Cylinder cylinder2= new Cylinder(3.5);
        System.out.println("Cylinder2:\n"+cylinder2.toString()+"\n");
        Cylinder cylinder3= new Cylinder(3,"Yellow",4.5);
        System.out.println("Cylinder3:\n"+cylinder3.toString());
    }
}
