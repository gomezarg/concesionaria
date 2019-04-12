import java.text.DecimalFormat;

public class Car extends Vehicle {

    private Integer doors;
    DecimalFormat formato = new DecimalFormat("$#,###.00");

    public Car(String brand, String model , Double price, Integer doors) {
        super(brand, model, price);
        this.doors = doors;
    }

    public Integer getDoors() {
        return doors;
    }
    @Override
    public String toString() {
        return "Marca: " + this.getBrand() + " // Modelo: " + this.getModel() + " // Puertas: " + this.getDoors() + " // Precio: " + formato.format(this.getPrice());
    }
}