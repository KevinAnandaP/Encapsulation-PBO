package hardware;

public class Computer {
    // PRIVATE
    private String serialNumber;
    private double price;
    
    // DEFAULT
    String brand;
    int ramSize;
    
    // PROTECTED
    protected String processor;
    protected boolean isOn;
    
    // PUBLIC
    public String model;
    public String operatingSystem;
    
    // Constructor
    public Computer(String serialNumber, String brand, String model, String processor, String os) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.operatingSystem = os;
        this.ramSize = 32;
        this.price = 12000;
        this.isOn = false;
    }
    
    // PRIVATE method
    private void validateSerialNumber() {
        if (serialNumber == null || serialNumber.length() < 5) {
            System.out.println("Serial number tidak valid!");
        }
    }
    
    // DEFAULT method
    void displayBasicInfo() {
        validateSerialNumber(); // PRIVATE method
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
    
    // PROTECTED method
    protected void powerOn() {
        System.out.println("Computer " + model + " is turning on...");
        isOn = true;
    }
    
    // PUBLIC method
    public void displayPublicInfo() {
        System.out.println("Model: " + model + ", OS: " + operatingSystem);
    }
    
    // PUBLIC getter
    public String getSerialNumber() {
        return serialNumber;
    }
    
    // PUBLIC setter
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga harus lebih dari 0");
        }
    }
    
    public double getPrice() {
        return price;
    }
}