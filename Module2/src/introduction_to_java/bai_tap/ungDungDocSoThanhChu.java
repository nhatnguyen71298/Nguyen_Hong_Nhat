package introduction_to_java.bai_tap;

import java.util.Scanner;

public class ungDungDocSoThanhChu {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập số:");
        int number=scanner.nextInt();

        switch (number){
            case 0:
                System.out.print("Không");
                break;
            case 1:
                System.out.print("Một");
                break;
            case 2:
                System.out.print("Hai");
                break;
            case 3:
                System.out.print("Ba");
                break;
            case 4:
                System.out.print("Bốn");
                break;
            case 5:
                System.out.print("Năm");
                break;
            case 6:
                System.out.print("Sáu");
                break;
            case 7:
                System.out.print("Bảy");
                break;
            case 8:
                System.out.print("Tám");
                break;
            case 9:
                System.out.print("Chín");
                break;
            case 10:
                System.out.print("Mười");
                break;
            default:
                System.out.print("out of ability");
        }
    }
}
