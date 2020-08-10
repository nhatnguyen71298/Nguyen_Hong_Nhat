package ke_thua.bai_tap.point_movablepoint;

import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed=(float) 0.0;
    private float ySpeed=(float) 0.0;

    public MovablePoint(){
    }

    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        setSpeed(xSpeed,ySpeed);
        getSpeed();
    }
    public MovablePoint(float xSpeed,float ySpeed){
       setSpeed(xSpeed,ySpeed);
       getSpeed();
    }

    public float getxSpeed() {
        return this.xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] getSpeed= new float[2];
        getSpeed[0]=this.xSpeed;
        getSpeed[1]=this.ySpeed;
        return getSpeed;
    }

    public float[] move(){
        float[] movePoint= new float[2];
        this.x+=this.xSpeed;
        this.y+=this.ySpeed;
        movePoint[0]=this.getX();
        movePoint[1]=this.getY();
        return movePoint;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nMovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ",Speed: "+ Arrays.toString(getSpeed()) +
                " MoveablePoint: "+Arrays.toString(move())+
                '}';
    }

}
