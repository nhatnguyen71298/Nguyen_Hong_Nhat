package ke_thua.bai_tap.point_movablepoint;

import java.util.Arrays;

public class Point {
    float x=(float) 0.0;
    float y=(float) 0.0;

    public Point(){
    }

    public Point(float x,float y){
        setXY(x,y);
        getXY();
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y ){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] getXY= new float[2];
        getXY[0]=this.x;
        getXY[1]=this.y;
        return getXY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", point= "+ Arrays.toString(getXY()) +
                '}';
    }
}
