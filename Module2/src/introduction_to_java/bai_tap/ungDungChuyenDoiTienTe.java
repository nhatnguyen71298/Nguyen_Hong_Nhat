package introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Input USD:");
        double usd=scanner.nextInt();
        double toVND=usd*23000;

        System.out.print("Changed: "+toVND+" VNĐ");
    }
}
