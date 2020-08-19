package thuat_toan_tim_kiem.bai_tap.thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.Scanner;

public class FindElement {
    static int index=-1;

    public static boolean findElement(int[] list, int number){
        index++;
       while (index<list.length){
           if (list[index]!=number){
               findElement(list,number);
           } else {
               return true;
           }
       }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input size:");
        int size=scanner.nextInt();
        int[] list=new int[size];

        for (int i=0;i<size;i++){
            System.out.println("Input element at "+i);
            list[i]=scanner.nextInt();
        }

        System.out.println("Find element:");
        int findNumber=scanner.nextInt();

        if (findElement(list,findNumber)){
            System.out.println("Number is in array at index: "+index);
        } else {
            System.out.println("Number is not in array ");

        }
    }


}
