package io_binary_file_Serialization.bai_tap.quan_ly_san_pham_luu_sang_file_nhi_phan;


public class Product {
        String code,name,manufacturer,price,orther;
        Product(){

        }
        Product(String code,String name, String manufacturer,String price,String orther){
            this.code=code;
            this.name=name;
            this.manufacturer=manufacturer;
            this.price=price;
            this.orther=orther;
        }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrther() {
        return orther;
    }

    public void setOrther(String orther) {
        this.orther = orther;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price='" + price + '\'' +
                ", orther='" + orther + '\'' +
                '}';
    }
}

