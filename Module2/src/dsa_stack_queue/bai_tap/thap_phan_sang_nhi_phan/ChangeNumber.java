package dsa_stack_queue.bai_tap.thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChangeNumber {
    public static void main(String[] args) {
        Stack<String> binaryNumbers= new Stack<>();
        int[] numbers;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of numbers : ");
        int sizeOfnumbers= scanner.nextInt();
        numbers= new int[sizeOfnumbers];

        for (int i=0;i<sizeOfnumbers;i++){
            System.out.println("Enter number "+i+" in Size");
            numbers[i]=scanner.nextInt();
            binaryNumbers.push(Integer.toBinaryString(numbers[i]));
        }

        System.out.println("Numbers have been changed to the binary number: "+ binaryNumbers.toString());


    }
}
