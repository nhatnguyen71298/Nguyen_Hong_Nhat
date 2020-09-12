package kiem_tra_module.danhba;

import java.util.Scanner;

public class MainController {
    static Scanner scanner=new Scanner(System.in);
    public static void displayMainMeNu(){
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----"+
                "\nChọn chức năng theo số để tiếp tục: "+
                "\n1.Xem danh sách "+
                "\n2.Thêm mới"+
                "\n3.Cập nhật"+
                "\n4.Xóa"+
                "\n5.Tìm kiếm"+
                "\n6.Đọc từ File"+
                "\n7.Ghi vào File"+
                "\n8. Thoát"
        );
        System.out.print("Chọn chức năng:  ");
        String chonChucNang;
        chonChucNang=scanner.next();
        switch (chonChucNang){
            case "1":
                DuLieuDanhBa.hienThiDanhBa();
                displayMainMeNu();
                break;
            case "2":
                DuLieuDanhBa.themNguoiDung();
                displayMainMeNu();
                break;
            case "3":
                DuLieuDanhBa.capNhatDanhBa();
                displayMainMeNu();
                break;
            case "4":
                System.out.println("Nhập Số Điện Thoại muốn xóa");
                String soXoa=scanner.next();
                DuLieuDanhBa.xoaNguoiDung(soXoa);
                displayMainMeNu();
                break;
            case "5":
                timKiem();
                displayMainMeNu();
                break;
            case "6":
                System.out.println("Đọc từ file CSV: ");
                DuLieuDanhBa.hienThiDanhBa();
                displayMainMeNu();
                break;
            case "7":
// Vì khi nhập vào là đã tự lưu vào file
                displayMainMeNu();
                break;
            case "8":
                break;
            default:
                System.out.println("Không hợp lệ");
        }
    }
//---------------------------------------------------------------------
    public static void timKiem(){
        System.out.println("Chọn cách tìm kiếm:"+
                "\n1.Tìm theo số điện thoại."+
                "\n2.Tìm theo tên."
        );
        String timKiem= scanner.next();
        if (timKiem.equals("1")){
            DuLieuDanhBa.timSoDienThoaiTheoSo();
        } else if ((timKiem.equals("2"))){
            DuLieuDanhBa.timSoDienThoaiTheoTen();
        } else {
            System.out.println("Không hợp lệ!");
            timKiem();
        }
    }
    public static void main(String[] args) {
        displayMainMeNu();
    }
}
