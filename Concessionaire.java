
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Concessionaire {
    DecimalFormat formato = new DecimalFormat("$#,###.00");

    private List<Vehicle> vehicles;

    public Concessionaire() {
        this.vehicles = new ArrayList<>();
    }
    public void showVehicles(){

        for(int x=0 ; x < vehicles.size() ; x++) {
            System.out.println(vehicles.get(x));
        
        }
    }
        
    public void addVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public void highPrice() {
        Collections.sort(vehicles);
        System.out.println("Vehiculo mas caro: " + this.vehicles.get(0).getBrand() + " " + this.vehicles.get(0).getModel());
    }
    public void downPrice() {
        System.out.println("Vehiculo mas barato: " + this.vehicles.get(vehicles.size()-1).getBrand() + " " + this.vehicles.get(vehicles.size()-1).getModel());
    }
    public void orderVehicles(){
        System.out.println("Vehiculos ordenados por precio de mayor a menor:");
        vehicles.forEach(automotive -> System.out.println(automotive.getBrand() + " " + automotive.getModel()));
    }
    public void containerY(String letter){
        System.out.print("Vehiculo que contiene en el modelo la letra '"+ letter +"' : ");
        for(int i = 0; i< this.vehicles.size(); i++){
            String model = this.vehicles.get(i).getModel();
            if(model.contains(letter)){
                System.out.println(this.vehicles.get(i).getBrand() + " " + this.vehicles.get(i).getModel() + " " + formato.format(this.vehicles.get(i).getPrice()));
            }
        }
    }
}
