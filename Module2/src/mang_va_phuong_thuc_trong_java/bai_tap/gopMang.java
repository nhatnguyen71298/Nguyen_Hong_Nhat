package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size1,size2,size3;
//khai báo mảng 1,mảng 2, cho nhập độ dài, phần tử.
        System.out.println("Nhập độ dài mảng 1: ");
        size1= scanner.nextInt();
        int[] mang1 =new int[size1];
        for (int i=0;i<mang1.length;i++){
            System.out.println("Nhập phần tử thứ "+i+" của mảng 1:");
            mang1[i]=scanner.nextInt();
        }

        System.out.println("Nhập độ dài mảng 2: ");
        size2= scanner.nextInt();
        int[] mang2 =new int[size2];
        for (int i=0;i<mang2.length;i++){
            System.out.println("Nhập phần tử thứ "+i+" của mảng 2:");
            mang2[i]=scanner.nextInt();
        }

// tạo mảng 3 có độ dài = 2 mảng trên và thêm từng phần tử từ 2 mảng trên vào
        int[] mang3= new int[ size1+size2 ];
        for (int i=0; i<size1 ;i++){
            mang3[i]=mang1[i];
        }
        for (int i=0; i<size2 ;i++){
            mang3[size1+i]=mang2[i];
        }
//in kết quả
        System.out.println("Mảng 1:");
        for (int i=0;i<mang1.length;i++){
            System.out.println(mang1[i]+" ");
        }
        System.out.println();

        System.out.println("Mảng 2:");
        for (int i=0;i<mang2.length;i++){
            System.out.println(mang2[i]+" ");
        }
        System.out.println();

        System.out.println("Mảng 3 sau khi gộp 2 mảng trên :");
        for (int i=0;i<mang3.length;i++){
            System.out.println(mang3[i]+" ");
        }
        System.out.println();
    }
}
