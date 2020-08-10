package ke_thua.bai_tap.lop_point_2d_va_lop_point_3d;

import java.util.Arrays;

public class Point2D {
    float x= (float) 0.0;
    float y= (float) 0.0;
    float[] position2D=new float[2];

    public Point2D(){
    }
    public Point2D(float x, float y){
       setXY(x,y);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY(){
        return this.position2D;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
        this.position2D[0]=x;
        this.position2D[1]=y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + this.x +
                ", y=" + this.y +
                ", position=" + Arrays.toString(position2D) +
                '}';
    }
}
