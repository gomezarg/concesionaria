import java.text.DecimalFormat;

public class Motorcycle extends Vehicle {

    private String displacement;
    DecimalFormat formato = new DecimalFormat("$#,###.00");

    public Motorcycle(String brand, String model , Double price, String displacement) {
        super(brand, model, price);
        this.displacement = displacement;
    }

    public String getDisplacement() {
        return displacement;
    }
    
    @Override
    public String toString() {
        return "Marca: " + this.getBrand() + " // Modelo: " + this.getModel() + " // Cilindrada: " + this.getDisplacement() + " // Precio: " + formato.format(this.getPrice());
    }
}