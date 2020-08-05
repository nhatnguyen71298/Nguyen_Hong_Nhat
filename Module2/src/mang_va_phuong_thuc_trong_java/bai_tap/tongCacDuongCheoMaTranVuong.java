package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class tongCacDuongCheoMaTranVuong {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int tong=0;
            int tongDuongCheo=0;

            System.out.println("Nhập số hàng, cột của ma trận vuông: ");
            int doRong=scanner.nextInt();
            int[][] maTranVuong= new int[doRong][doRong];

            for (int i=0;i<doRong;i++){
                for (int j=0;j<doRong;j++){
                    System.out.println("Nhập phần tử hàng "+i+" cột "+j);
                    maTranVuong[i][j]=scanner.nextInt();
                }
            }

            System.out.println("Ma trận vuông vừa tạo: ");
            for (int i=0;i<doRong;i++){
            for (int j=0;j<doRong;j++){
                System.out.print(maTranVuong[i][j]+" ");
            }
            System.out.println();
             }


            for (int i=0;i<doRong;i++){
                for (int j=0;j<doRong;j++){
                   tong+= maTranVuong[i][j];
                }
            }
            System.out.println("Tổng các phần tử: "+tong);

            for (int i=0;i<doRong;i++){
                for (int j=0;j<doRong;j++){
                    if (i==j){
                        tongDuongCheo+=maTranVuong[i][j];
                    }
                }
            }
            System.out.println("Tổng đường chéo: "+tongDuongCheo);

    }
}
