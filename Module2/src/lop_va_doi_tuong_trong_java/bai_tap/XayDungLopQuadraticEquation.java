package lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class XayDungLopQuadraticEquation {
   public static class QuadraticEquation{
      double a,b,c;

      public QuadraticEquation(double a,double b,double c){
         this.a=a;
         this.b=b;
         this.c=c;
      }
      public double getDiscriminant(){
         double delta;
         delta = this.b*this.b - 4*this.a*this.c;
         return delta;
      }
      public double getRoot1(){
         double x1,delta;
         delta = this.b*this.b - 4*this.a*this.c;
         x1=(this.b*-1+Math.sqrt(delta))/(2*this.a);
         return x1;
      }
      public double getRoot2(){
         double x2,delta;
         delta = this.b*this.b - 4*this.a*this.c;
         x2=(this.b*-1-Math.sqrt(delta))/(2*this.a);
         return x2;
      }
   }

   public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);

      System.out.println("Input A: ");
      double a= scanner.nextDouble();
      System.out.println("Input B: ");
      double b= scanner.nextDouble();
      System.out.println("Input C: ");
      double c= scanner.nextDouble();

      QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);

      if (quadraticEquation.getDiscriminant()<0){
         System.out.println("The equation has no roots");
      } else {
         System.out.println("Root 1:");
         System.out.println(quadraticEquation.getRoot1());
         System.out.println("Root 2:");
         System.out.println(quadraticEquation.getRoot2());
      }
   }
}
