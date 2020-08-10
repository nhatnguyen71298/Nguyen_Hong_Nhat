package abstract_Class_and_Interface.bai_tap.lop_shape_va_rectangle;

public class Rectangle extends Shape{
    private double a=1.0,b=1.0,c=1.0;

    public Rectangle(){
    }

    public Rectangle(double a,double b,double c){
        setA(a);setB(b);setC(c);
        getA();getB();getC();
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getPerimeter(){
        return this.a+this.b+this.c;
    }

    public double getArea(){
        double p=getPerimeter()/2;
        return Math.sqrt(Math.abs((p*(p-this.a)*(p-this.b)*(p-this.c))));
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nRectangle{" +
                "a=" + this.a +
                ", b=" + this.b +
                ", c=" + this.c +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
