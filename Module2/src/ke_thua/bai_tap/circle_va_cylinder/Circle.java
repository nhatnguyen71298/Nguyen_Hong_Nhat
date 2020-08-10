package ke_thua.bai_tap.circle_va_cylinder;

public class Circle {
    private double radius=1.0;
    private String color="Red";

    public Circle(){
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius* 3.14;
    }
    @Override
    public String toString(){
        return "Radius:"+getRadius()+
                "\nColor: "+getColor()+
                "\nArea: "+ getArea();
    }
}
