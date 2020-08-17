package dsa_stack_queue.bai_tap.demerging_use_queue;

import java.util.*;

public class SortByGender {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Queue<String[]> female= new ArrayDeque<>();
        Queue<String[]> male= new ArrayDeque<>();
        Queue<String[]> sortByGender=new ArrayDeque<>();

        System.out.println("Input number Student: ");
        int numberOfStudent= scanner.nextInt();

        do {
            String[] inforOfStudent =InputStudent();

            if (inforOfStudent[1].equals("Female")){
                female.add(inforOfStudent);
                numberOfStudent--;
            } else {
                if (inforOfStudent[1].equals("Male")) {
                    male.add(inforOfStudent);
                    numberOfStudent--;
                } else {
                    System.out.println("Gender illegal!");
                }
            }
        } while (numberOfStudent>0);
//  Add Queue female vào trước thì các học sinh nữ luôn ở đầu hàng đợi.
        sortByGender.addAll(female);
        sortByGender.addAll(male);
        System.out.println("Sorted by gender: ");
        for (String[] element:sortByGender){
            System.out.println(Arrays.toString(element));
        }

    }

    public static String[] InputStudent(){
        String[] infor= new String[3];
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input name: ");
        infor[0]=scanner.next();
        System.out.println("Input gender: ");
        infor[1]=scanner.next();
        System.out.println("Input birthday: ");
        infor[2]=scanner.next();
        return infor;
    }

}
