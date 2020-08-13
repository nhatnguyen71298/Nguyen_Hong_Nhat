package dsa_danh_sach.bai_tap.trien_khai_arraylist_theo_thu_vien;

import java.util.Arrays;

public class MyList<E> {
    public final int DEFAULT_CAPACITY=10;
    int size;
    Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
        this.size=elements.length;
    }

    public MyList(int capacity){
        elements=new Object[capacity];
        this.size=elements.length;
    }

    void setElements(int index,E element){
        elements[index]=element;
    }

    void add(int index, E element){
        ensureCapacity(elements.length+1);

        for (int i=elements.length-1;i>index;i--){
            elements[i]=elements[i-1];
        }
        elements[index]=element;
    }

    E remove(int index){

        E elementRemove=(E) elements[index];
        for (int i=index;i<elements.length-1;i++){
            elements[i]=elements[i+1];
        }
        ensureCapacity(elements.length-1);
        return elementRemove;

    }

    int size(){
        return size;
    }

    E cloneMyList(){
        return (E) elements;
    }

    boolean cotains(E checkElement){
        for (int i=0;i<elements.length;++i){
            if (elements[i]==checkElement){
                return true;
            }
        }
        return false;
    }

    int indexOf(E element){
        for (int i=0;i<elements.length;++i){
            if (elements[i]==element){
                return i;
            }
        }
        return -1;
    }

    void ensureCapacity(int minCapacity){
        elements= Arrays.copyOf(elements, minCapacity);
    }

    public E getElement(int i) {
        if (i>= size || i <0) {
            throw new  IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    void clear(){
        elements= new Object[DEFAULT_CAPACITY];
    }
}
