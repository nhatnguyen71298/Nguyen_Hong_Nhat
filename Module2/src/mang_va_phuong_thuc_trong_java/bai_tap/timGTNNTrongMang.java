package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class timGTNNTrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min;

        System.out.println("Nhập độ dài mảng:");
        int size= scanner.nextInt();
        int[] arr= new int[size];
        for (int i=0; i<arr.length; i++){
            System.out.println("Nhập phần tử thứ "+i+" của mảng");
            arr[i]=scanner.nextInt();
        }

        min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: "+min);
    }
}
