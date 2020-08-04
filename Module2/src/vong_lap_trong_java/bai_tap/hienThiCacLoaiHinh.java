package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args){
        int choose = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (choose != 0) {
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i=0;i<3;i++) {
                        System.out.println("* * * * * *");
                    }
                    break;
                case 2:
                    System.out.print("Draw two square triangle");
                    for (int i=0;i<6;i++){
                        for (int j=0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i=5;i>=0;i--){
                        for (int j=0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw isosceles triangle");
                    for(int i=1;i<=5;i++) {
                        for (int j=1;j<=5-i;j++) System.out.print(" ");
                        for (int k=1;k<=i;k++)  System.out.print("* ");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }
        }

    }
}
