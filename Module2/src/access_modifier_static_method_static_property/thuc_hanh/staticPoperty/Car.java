package access_modifier_static_method_static_property.thuc_hanh.staticPoperty;

class Car {
    private String name;

    private String engine;


    static int numberOfCars;


    Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }
}
