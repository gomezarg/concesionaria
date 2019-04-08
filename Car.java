public class Car extends Vehicle {

    private Integer doors;

    public Car(String brand, String model , Float price, Integer doors) {
        super(brand, model, price);
        this.doors = doors;
    }

    public Integer getDoors() {
        return doors;
    }
}