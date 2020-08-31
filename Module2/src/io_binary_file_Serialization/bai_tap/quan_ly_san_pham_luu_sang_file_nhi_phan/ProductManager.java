package io_binary_file_Serialization.bai_tap.quan_ly_san_pham_luu_sang_file_nhi_phan;

import java.io.*;

public class ProductManager {
    public static void main(String[] args) {
        Product product1= new Product("C0620G1","Hồng Nhật","Code Gym","6 triệu","Đóng hàng tháng");
        try{
            FileWriter outputStream = new FileWriter("F:\\4. Nguyen_Hong_Nhat\\Module2\\src\\io_binary_file_Serialization\\bai_tap\\quan_ly_san_pham_luu_sang_file_nhi_phan\\StreamProduct.txt",true);
            BufferedWriter listProductStream= new BufferedWriter(outputStream);
            listProductStream.write(product1+"\n");
            System.out.println("Đã thêm!");
            listProductStream.close();
        } catch (IOException e){
            System.out.println("Xảy ra lỗi.");
            e.printStackTrace();
        }
    }
}
