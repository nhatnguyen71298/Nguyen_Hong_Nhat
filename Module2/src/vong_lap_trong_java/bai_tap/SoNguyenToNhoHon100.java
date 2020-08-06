package vong_lap_trong_java.bai_tap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args){
        int soBeHonMotTram=2;
        boolean kiemTraSoNguyenTo=true;

       while (soBeHonMotTram<100) {
           for (int i = 2; i < Math.sqrt(soBeHonMotTram); i++) {
               if (soBeHonMotTram % i == 0) {
                   kiemTraSoNguyenTo = false;
                   break;
               }
           }
           if (kiemTraSoNguyenTo) {
               System.out.println(soBeHonMotTram);
           } else {
               kiemTraSoNguyenTo=true;
           }
           soBeHonMotTram++;
       }

    }
}
