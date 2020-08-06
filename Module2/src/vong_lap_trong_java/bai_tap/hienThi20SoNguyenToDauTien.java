package vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args){
        int numbers=20,count=0;
        int N=2;
        boolean check = true;
        while (count<numbers) {

            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(N);
                count++;
                N++;
            } else {
                N++;
                check=true;
            }
        }

    }
}
