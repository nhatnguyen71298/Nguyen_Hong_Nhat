package access_modifier_static_method_static_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1= new Circle();

        System.out.println("Radius1: "+circle1.getRadius()+
                            "\nArea1: "+circle1.getArea());

        Circle circle2= new Circle(5.67);
        System.out.println("Radius2: "+circle2.getRadius()+
                            "\nArea2: "+circle2.getArea());
    }
}
