package abstract_class_and_interface.bai_tap.colorable;

public class TestColorable {
    public static void main(String[] args) {
        Square test=new Square();
        if (test instanceof Colorable){
            test.howToColor();
        }
    }
}
