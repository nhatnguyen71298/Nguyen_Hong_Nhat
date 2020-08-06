package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array= {1,43,1,23,4,35,56};
        int[] arrayNew= new int[8];
        int size=7;
        int index,k;

        System.out.println("Mảng hiện tại: ");
        for (int i=0; i<size;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Nhập phần tử muốn thêm:");
        k=scanner.nextInt();
        System.out.println("Nhập vị trí muốn chèn vào:");
        index=scanner.nextInt();

        if ( index > size-1 || index<0 ){
            System.out.println("Không thêm phần tử được vào mảng!");
        } else {

            for (int i=0; i<=index;i++){
                if (i==index){
                    arrayNew[i]=k;
                }else {
                    arrayNew[i]=array[i];
                }
            }
            for (int j=index;j<array.length;j++){
                arrayNew[j+1]=array[j];
            }

            System.out.println("Mảng sau khi thêm: "+k+" ở phần tử thứ "+index);
            for (int i=0; i<arrayNew.length ; i++){
                System.out.print(arrayNew[i]+" ");
            }
        }

    }
}
