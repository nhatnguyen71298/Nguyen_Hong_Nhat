package lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopFan {
    public static class Fan {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        int speed;
        boolean onOff;
        double radius;
        String color;
        String infor;

        public Fan() {
            this.speed=SLOW;
        }

        public void setSpeed(int speed) {
            if (speed != SLOW && speed != MEDIUM && speed != FAST) {
                this.speed = SLOW;
            } else {
                this.speed = speed;
            }
        }

        public void setOnOff(boolean onOff) {
            this.onOff = onOff;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getSpeed() {
            return this.speed;
        }

        public boolean getOnOff() {
            return this.onOff;
        }

        public double getRadius() {
            return this.radius;
        }

        public String getColor() {
            return this.color;
        }

        public String toString(){
            if (!this.onOff){
                this.infor="Fan is off";
            } else {
                this.infor= "Speed: "+this.speed+
                         "\nStatus: On."+
                         "\nRadius: "+this.radius+
                         "\nColor: "+this.color;
            }
            return this.infor;
        }

    }
        public static void main(String[] args) {
//      Tạo đối tượng fan 1 và dùng các phương thức để set thuộc tính cho đối tượng. in ra bằng phương thức toString().
            Fan fan1= new Fan();
            fan1.setSpeed(3);
            fan1.setRadius(10);
            fan1.setColor("Yellow");
            fan1.setOnOff(true);
            System.out.println("Fan1: \n"+fan1.toString());
//      Tạo đối tượng fan 2 và dùng các phương thức để set thuộc tính cho đối tượng. in ra bằng phương thức toString().
            Fan fan2= new Fan();
            fan2.setSpeed(2);
            fan2.setRadius(5);
            fan2.setColor("Blue");
            fan2.setOnOff(false);
            System.out.println("Fan2: \n"+fan2.toString());
        }
    }
