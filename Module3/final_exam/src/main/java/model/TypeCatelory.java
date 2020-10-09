package model;

public class TypeCatelory {
    String cateloryID, nameCatelory;
    public TypeCatelory(){};

    public TypeCatelory(String cateloryID, String nameCatelory) {
        this.cateloryID = cateloryID;
        this.nameCatelory = nameCatelory;
    }

    public String getCateloryID() {
        return cateloryID;
    }

    public void setCateloryID(String cateloryID) {
        this.cateloryID = cateloryID;
    }

    public String getNameCatelory() {
        return nameCatelory;
    }

    public void setNameCatelory(String nameCatelory) {
        this.nameCatelory = nameCatelory;
    }
}
