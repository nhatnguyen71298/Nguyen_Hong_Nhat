package dsa_stack_queue.bai_tap.palindrome_queue;

import java.util.*;


public class IsPalindrome {

    public static void main(String[] args) {
//      Đề yêu cầu phải dùng Queue và Stack
        Scanner scanner=new Scanner(System.in);
        Stack<Character> checkStack= new Stack<>();
        Queue<Character> checkQueue = new ArrayDeque<>();
        boolean isPalinhdrome=true;

        System.out.println("Input String: ");
        String palindromeString= scanner.next();

        for (int i=0;i<palindromeString.length();i++){
            checkQueue.add(palindromeString.charAt(i));
            checkStack.add(palindromeString.charAt(i));
        }

        for (int i=0; i<palindromeString.length()/2 + palindromeString.length()%2; i++){
            if (!(checkStack.pop() ==checkQueue.remove())){
                isPalinhdrome=false;
                break;
            }
        }

        if (isPalinhdrome){
            System.out.println("String is Palindrome String");
        } else {
            System.out.println("String is not Palindrome String");

        }
    }
}
