public abstract class Vehicle {
    private String brand;
    private String model;
    private float price;

    public Vehicle(String brand, String model , float price) {
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
    public float getPrice() {
        return price;
    }
}