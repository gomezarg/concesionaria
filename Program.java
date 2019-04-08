import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Program {
    public static void main(String args[]) {
		String valor = "20.0000,00";
			int v = 2000000;
			DecimalFormat formatea = new DecimalFormat("###,###.##");
			System.out.println(formatea.format(v));
			//Nos devuelve 1.000.000
		
		
		/*//Autos Add
		Car car1 = new Car("Peugeot", "206", 200000.00, 4);
		Car car2= new Car("Peugeot", "208", 250000.00, 5);
		//Motos Add
		Motorcycle moto1 = new Motorcycle("Honda", "Titan", 60000.00f, "125c");
		Motorcycle moto2 = new Motorcycle("Yamaha", "YBR", 80500.50f, "160c");
		
		System.out.println("Marca: " + car1.getBrand() + " // Modelo: " + car1.getModel() + " // Puertas: " + car1.getDoors() + " // Precio: $" + car1.getPrice());
		System.out.println("Marca: " + moto1.getBrand() + " // Modelo: " + moto1.getModel() + " // Cilindrada: " + moto1.getDisplacement() + " // Precio: $" + moto1.getPrice());
		System.out.println("Marca: " + car2.getBrand() + " // Modelo: " + car2.getModel() + " // Puertas: " + car2.getDoors() + " // Precio: $" + car2.getPrice());
		System.out.println("Marca: " + moto2.getBrand() + " // Modelo: " + moto2.getModel() + " // Cilindrada: " + moto2.getDisplacement() + " // Precio: $" + moto2.getPrice());

		System.out.println("=============================");
		*/
		
		
    }
}