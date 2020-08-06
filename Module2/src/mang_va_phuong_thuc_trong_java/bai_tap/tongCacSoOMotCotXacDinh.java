package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tong=0;

        System.out.println("Nhập số hàng: ");
        int hang=scanner.nextInt();
        System.out.println("Nhập số cột trong một hàng:");
        int cot=scanner.nextInt();
        int[][] mangHaiChieu= new int[hang][cot];

        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                System.out.println("Nhập phần tử hàng "+i+" cột "+j);
                mangHaiChieu[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Mảng vừa tạo:");
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                System.out.print(mangHaiChieu[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Nhập hàng muốn tính tổng: ");
        int hangMuonTinh= scanner.nextInt();
        for (int j=0;j<cot;j++){
            tong += mangHaiChieu[hangMuonTinh][j];
        }
        System.out.println("Kết quả: "+tong);
    }
}
