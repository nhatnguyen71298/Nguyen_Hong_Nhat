package dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Expression want to check: ");
        String str = scanner.next();

        checkBracketByStack(str);

    }

    private static void checkBracketByStack(String stringToCheck) {
        Stack<Character> numbersOfBracketLeft = new Stack<>();
        Stack<Character> numbersOfBracketRight = new Stack<>();
        boolean checkBraket = false;

//      Thuật toán theo hướng dẫn bài tập xét biểu thức từ trái sang phải.
        for (int i=0;i<stringToCheck.length();i++) {
            if (stringToCheck.charAt(i) == '(') {
                numbersOfBracketLeft.push(stringToCheck.charAt(i));
            } else if (stringToCheck.charAt(i) == ')') {
                if (numbersOfBracketLeft.isEmpty()) {
                    break;
//      Đảm bảo ')' ít hơn'(' nếu ')' nhiều hơn tại đây tức là biểu thức đã sai.
                } else if (numbersOfBracketLeft.size()>numbersOfBracketRight.size()){
                    numbersOfBracketRight.push(stringToCheck.charAt(i));
                } else {
                    numbersOfBracketRight.push(stringToCheck.charAt(i));
                    break;
                }
            }
        }
//      Sau vòng lặp sẽ có 2 trường hợp.Nếu '(' nhiều hơn ')' thì sẽ false vì ở trên cho push bao nhiều '(' cũng được.
        if (numbersOfBracketLeft.size()==numbersOfBracketRight.size()){
            checkBraket=true;
        }

        System.out.println("Expression is : "+ checkBraket);
    }
}
