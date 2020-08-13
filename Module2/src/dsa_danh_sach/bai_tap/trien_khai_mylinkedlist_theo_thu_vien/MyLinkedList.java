package dsa_danh_sach.bai_tap.trien_khai_mylinkedlist_theo_thu_vien;

import com.sun.source.tree.WhileLoopTree;
import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(){

    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head=new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element){
        Node holder=new Node(element);
        head.next=holder;
        numNodes++;
    }

    public void remove(int index){
        Node previous = head;

        for (int i = 1; i < index; i++) {
            previous = previous.next;
        }

        Node current = previous.next;
        previous.next = current.next;
        head=previous;
        numNodes--;
    }

    public boolean remove(E element){
        Node temp=head;
        do {
            if (element.equals(temp)){
                return true;
            } else {
                temp=temp.next;
            }
        } while (temp.next!=null);

        return false;
    }

    public int size(){
        return numNodes;
    }

    public E cloneMyLinkedList(){
        Node clone= head;
        return (E) clone;
    }

    public boolean constains(E element){
        Node temp=head;
        do {
            if (element==temp.data){
                return true;
            } else {
                temp=temp.next;
            }
        } while (temp.next!=null);

        return false;
    }

    public int indexOf(E element){
        int index=-1;
        Node temp=head;
        for (int i=0;i<numNodes;i++){
            if (element.equals(temp)){
                index=i;
                temp=temp.next;
            } else {
                temp=temp.next;
            }
        }
        return index;
    }

    public void ensureCapacity(int minCapacity){
        numNodes=minCapacity;
    }

    public E get(int index){
        Node getElement=head;
        for (int i = 0; i<index;i++){
            getElement=getElement.next;
        }
        return (E) getElement.data;
    }

    public E getfirst(){
        E getFist=get(0);
        return getFist;
    }

    public E getLast(){
        E getLast= get(numNodes-1);

        return getLast;
    }
}
