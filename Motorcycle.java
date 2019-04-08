public class Motorcycle extends Vehicle {

    private String displacement;

    public Motorcycle(String brand, String model , Float price, String displacement) {
        super(brand, model, price);
        this.displacement = displacement;
    }

    public String getDisplacement() {
        return displacement;
    }
}