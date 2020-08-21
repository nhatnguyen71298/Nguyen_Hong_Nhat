package thuat_toan_sap_xep.bai_tap.thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        insertSort(list);
    }

    public static void insertSort(int[] list) {
        System.out.println("Creat new list have length same old list!");
        System.out.println("Each time an element is added, List will rearrange.");
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
}