package xu_li_ngoai_le_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {

    public static void message(){
        System.out.println("This is not a triangle");
    }

    public static void perimeter(int a,int b,int c){
        System.out.println("Perimeter: "+(a+b+c));
    }

    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner= new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter 3 triangle edges! ");
        System.out.println("A: ");
        a=scanner.nextInt();
        System.out.println("B: ");
        b=scanner.nextInt();;
        System.out.println("C: ");
        c=scanner.nextInt();

        try {
            if ((a+b+c<0)||(a+b<c)||(a+c<b)||(c+b<a)){
                throw new Exception();
            }
            perimeter(a,b,c);
        } catch (Exception e){
            message();
        }
    }

}
