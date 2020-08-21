package thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    static int[] list={5,8,2345,78,234,47,9,324,567,133,5,7,3,6};
    public static void insertionSort(int[] list){
        for (int i = 0; i < list.length; i++) {
            int[] listTemp = new int[i + 1];
            System.out.println("Step: " + (i + 1));
            for (int j = 0; j < listTemp.length; j++) {
                listTemp[j] = list[j];
            }
            if (listTemp.length > 1) {
                for (int h = 0; h < listTemp.length - 1; h++) {
                    for (int k = 0; k < listTemp.length - 1; k++) {
                        if (listTemp[k] > listTemp[k + 1]) {
                            int temp = listTemp[k];
                            listTemp[k] = listTemp[k + 1];
                            listTemp[k + 1] = temp;
                        }
                    }
                }
            }
            for (int m = 0; m < listTemp.length; m++) {
                System.out.print(listTemp[m] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Insert Sort List:");
        insertionSort(list);
    }
}
