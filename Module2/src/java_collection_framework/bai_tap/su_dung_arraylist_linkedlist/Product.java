package java_collection_framework.bai_tap.su_dung_arraylist_linkedlist;

public class Product implements Comparable<Product> {
    String name;
    int price;
    Product(){
    }
    Product(String name ,int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.getName());
    }
}
