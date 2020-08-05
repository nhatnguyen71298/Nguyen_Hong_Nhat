package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class demSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int count=0;
        String inputChuoi, kyTu;

        System.out.println("Nhập chuỗi:");
        inputChuoi= scanner.nextLine();
        System.out.println("Nhập ký tự muốn kiểm tra:");
        kyTu= scanner.nextLine();
// so sánh String với char ko thực hiện được nên phải đổi về cùng kiểu dữ liệu. vì String là kiểu dữ liệu đối tượng.
        for (int i=0; i< inputChuoi.length(); i++){
            if (inputChuoi.charAt(i)==kyTu.charAt(0)){
                count++;
            }
        }

        if (count==0){
            System.out.println("Ký tự không có trong chuỗi!");
        } else {
            System.out.println("Số lần xuất hiện ký tự "+kyTu+" trong chuỗi: "+ count);
        }
    }
}
