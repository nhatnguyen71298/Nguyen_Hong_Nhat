package dsa_danh_sach.bai_tap.trien_khai_mylinkedlist_theo_thu_vien;

import org.w3c.dom.Node;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> testMyLinkedList=new MyLinkedList<>();
        testMyLinkedList.addFirst("nhat");
        testMyLinkedList.addLast("cuong");
        System.out.println(testMyLinkedList.size());
        System.out.println(testMyLinkedList.getfirst());
        System.out.println(testMyLinkedList.getLast());
        System.out.println(testMyLinkedList.constains("nhat"));
        System.out.println(testMyLinkedList.constains("false"));



    }
}
