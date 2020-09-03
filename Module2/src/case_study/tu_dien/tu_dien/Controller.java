package case_study.tu_dien.tu_dien;

import java.util.Scanner;

public class Controller {
    static Data controllerData =new Data();
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }
//------------------------------------------------------------------------------
public static void displayMainMenu(){
    System.out.println("1.Xem từ điển."+
            "\n2.Chỉnh sửa từ điển."+
            "\n3.Thoát chương trình.");
    String control =scanner.next();
    switch (control){
        case "1":
            controllerData.displayDataList();
            displayMainMenu();
            break;
        case "2":
            editData();
            break;
        case "3":
            System.exit(0);
            break;
        default:
            System.out.println("Không hợp lệ!");
            displayMainMenu();
    }
}
//---------------------------------------------------------------------------------
    public static void editData(){
        System.out.println("1.Thêm từ mới."+
                "\n2.Xóa từ."+
                "\n3.Tìm từ."+
                "\n4.Về Menu."+
                "\n5.Thoát chương trình.");
        String control =scanner.next();
        switch (control){
            case "1":
                controllerData.addNewData();
                editData();
                break;
            case "2":
                controllerData.delData();
                editData();
                break;
            case "3":
                controllerData.getData();
                editData();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Không hợp lệ!");
                editData();
        }
    }
}
