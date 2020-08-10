package abstract_Class_and_Interface.bai_tap.circle_va_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1= new Circle();
        System.out.println(circle1.toString());
        Circle circle2= new Circle(3,"Blue");
        System.out.println(circle2.toString());
    }
}
