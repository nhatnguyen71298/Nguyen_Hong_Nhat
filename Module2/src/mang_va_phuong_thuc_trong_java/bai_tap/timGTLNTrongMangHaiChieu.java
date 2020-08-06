package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGTLNTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
// Nhập vào ma trận là một mảng hai chiều.
        System.out.println("Nhập số hàng: ");
        int hang=scanner.nextInt();
        System.out.println("Nhập số cột trong một hàng:");
        int cot=scanner.nextInt();
        int[][] matrix= new int[hang][cot];

        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                System.out.println("Nhập phần tử hàng "+i+" cột "+j);
                matrix[i][j]=scanner.nextInt();
            }
        }
// in ma trận vừa tạo
        System.out.println("Ma trận vừa tạo:");
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
// tìm GTLN và in ra
        int max= matrix[0][0];
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                if ( max < matrix[i][j] ){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong ma trận vừa nhập: "+max);
    }
}
