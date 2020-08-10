package ke_thua.bai_tap.lop_point_2d_va_lop_point_3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z= (float) 0.0;
    private float[] getXYZ= new float[3];

    public Point3D(){
    }

    public Point3D(float z){
        setXYZ(this.x,this.y,z);
    }

    public Point3D(float x,float y,float z){
       setXYZ(x,y,z);
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return getXYZ;
    }


    public void setXYZ(float x, float y ,float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
        this.getXYZ[0]=this.getX();
        this.getXYZ[1]=this.getY();
        this.getXYZ[2]=this.getZ();
    }


    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + this.x +
                ", y=" + this.y +
                ", z=" + this.z +
                ", positon3D=" + Arrays.toString(getXYZ) +
                '}';
    }
}
