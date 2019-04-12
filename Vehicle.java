
public abstract class Vehicle implements Comparable<Vehicle>{
    private String brand;
    private String model;
    private Double price;

    public Vehicle(String brand, String model , Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        
    }
    //Marca
    public void setBrand(String brand) {
        if(brand.length() <= 0)
            System.out.println("Marca no valida");
        else
            this.brand = brand;
    }
    public String getBrand() { 
        return brand;
    }
    //Modelo
    public void setModel(String model) {
        if(model.length() <= 0)
            System.out.println("Modelo no valido");
        else
            this.model = model;
    }
    public String getModel() {
        return model;
    }
    //Precio
    public Double getPrice() {
        
        return price;
    } 
    @Override
    public int compareTo(Vehicle automotive){
        return automotive.getPrice().compareTo(getPrice());
    }
}