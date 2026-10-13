public class Car {
    String id, name;
    double price;

    public Car() {
    }

    public Car(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "(" + id + "," + name + "," + price + ')';
    }
    
}
