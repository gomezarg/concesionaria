

import java.util.Arrays;
import java.util.List;


public class Program {
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}
    public static void main(String args[]) {
			
			clearScreen();
		Concessionaire concessionaire = new Concessionaire();

        List<Vehicle> listVehicles = Arrays.asList(
					new Car("Peugeot", "206", 200000.00 , 4),
					new Motorcycle("Honda", "Titan", 60000.00, "125c"),
					new Car("Peugeot", "208", 250000.00 , 5),
					new Motorcycle("Yamaha", "YBR", 80500.50, "160c"));

					
				concessionaire.addVehicles(listVehicles);
				
        concessionaire.showVehicles();
        System.out.println("======================");
        concessionaire.highPrice();
				concessionaire.downPrice();
				concessionaire.containerY("Y");
        System.out.println("======================");
        concessionaire.orderVehicles();
    }
}