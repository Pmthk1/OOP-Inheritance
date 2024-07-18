class Product {
    private String name;
    private String brand;
    private double price;

    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price: " + price + " THB");
    }
}

class Laptop extends Product {
    private String CPU;

    public Laptop(String name, String brand, double price, String CPU) {
        super(name, brand, price);
        this.CPU = CPU;
    }

    public String getCPU() { return CPU; }
    public void setCPU(String CPU) { this.CPU = CPU; }
    public void display() {
        System.out.println("Laptop Details:");
        super.display();
        System.out.println("CPU: " + CPU);
    }
}

class Smartphone extends Product {
    private String OS;

    public Smartphone(String name, String brand, double price, String OS) {
        super(name, brand, price);
        this.OS = OS;
    }

    public String getOS() { return OS; }
    public void setOS(String OS) { this.OS = OS; }
    public void display() {
        System.out.println("Smartphone Details:");
        super.display();
        System.out.println("Operating System: " + OS);
    }
}


public class Main3 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Macbook", "Apple", 30000.0, "M1");
        Smartphone smartphone = new Smartphone("Galaxy", "Samsung", 20000.0, "Android");
        laptop.display();
        smartphone.display();

        laptop.setPrice(29999.0);
        smartphone.setPrice(22000.0);

        laptop.display();
        smartphone.display();
    }
}