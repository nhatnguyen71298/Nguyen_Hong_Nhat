package dsa_stack_queue.bai_tap.dao_nguoc_stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<String> myStack=new Stack<>();
        Stack<String> reverseMyStack= new Stack<>();
        myStack.push("nhat1");
        myStack.push("nhat2");
        myStack.push("nhat3");
        myStack.push("nhat4");

//        System.out.println(myStack.toString());
        for (int i=myStack.size()-1;i>=0;i--) {
            reverseMyStack.push(myStack.elementAt(i));
        }

        System.out.println(reverseMyStack.toString());
    }
}
