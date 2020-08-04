package vong_lap_trong_java.bai_tap;

public class hienThi20SoNguyenToDauTien {
    public static void main(String[] args){
        int numbers=20,count=0;
        int N=2;
        boolean check = true;
        while (count<numbers) {
            if (N!=2){
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    }
                }
            }

            if (check) {
                System.out.println(N);
                count+=1;
                N++;
            } else {
                N++;
                check=true;
            }
        }

    }
}
