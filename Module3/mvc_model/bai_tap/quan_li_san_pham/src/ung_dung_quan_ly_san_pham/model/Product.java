package ung_dung_quan_ly_san_pham.model;

public class Product {
    int id;
    String name, price, manufacture ,comment;

    public Product(){

    }

    public Product(int id, String name, String price, String manufacture, String comment) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
