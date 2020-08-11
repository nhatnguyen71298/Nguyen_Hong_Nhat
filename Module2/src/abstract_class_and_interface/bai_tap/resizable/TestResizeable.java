package abstract_class_and_interface.bai_tap.resizable;

public class TestResizeable {
    public static void main(String[] args) {

        Circle circle=new Circle(3.5);
        System.out.println("Circle before resize: "+circle.toString());
        circle.resize(5);

    }
}
