package dsa_stack_queue.bai_tap.map;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input String: ");
        String string= scanner.next().toUpperCase();
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i=0; i< string.length(); i++){
           if (!map.containsKey(string.charAt(i))){
               map.put(string.charAt(i),1);
           } else {
               int valueUpdate= map.get(string.charAt(i))+1;
               map.replace(string.charAt(i),valueUpdate);
           }
        }

        System.out.println(map);
    }
}
