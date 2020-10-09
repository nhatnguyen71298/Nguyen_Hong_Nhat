package model;

public class Product {
    String stt,name,price,quantity,colorID,cateloryID;

    public Product(){};

    public Product(String stt, String name, String price, String quantity, String colorID, String cateloryID) {
        this.stt = stt;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.colorID = colorID;
        this.cateloryID = cateloryID;
    }

    public Product(String name, String price, String quantity, String colorID, String cateloryID) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.colorID = colorID;
        this.cateloryID = cateloryID;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getColorID() {
        return colorID;
    }

    public void setColorID(String colorID) {
        this.colorID = colorID;
    }

    public String getCateloryID() {
        return cateloryID;
    }

    public void setCateloryID(String cateloryID) {
        this.cateloryID = cateloryID;
    }
}
