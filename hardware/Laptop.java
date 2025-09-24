package hardware;

public class Laptop extends Computer {

    protected double batteryLife;
    public int screenSize;
    
    // Constructor
    public Laptop(String serialNumber, String brand, String model, String processor, String os, int screenSize) {
        super(serialNumber, brand, model, processor, os);
        this.screenSize = screenSize;
        this.batteryLife = 8.0; // jam
    }
    
    // Method akses ke parent
    public void demonstrateAccess() {
        System.out.println("\n=== Demonstrasi Access Modifier dalam Subclass Laptop ===");
        
        // BISA
        System.out.println("PUBLIC - Model: " + model);
        System.out.println("PUBLIC - OS: " + operatingSystem);
        
        // BISA
        System.out.println("PROTECTED - Processor: " + processor);
        System.out.println("PROTECTED - Power status: " + isOn);
        
        // BISA
        System.out.println("DEFAULT - Brand: " + brand);
        System.out.println("DEFAULT - RAM: " + ramSize + "GB");
        
        // TIDAK BISA
        // System.out.println(serialNumber); // private attribute
        // System.out.println(price); // private attribute
        System.out.println("PRIVATE - Serial number: Tidak bisa diakses langsung");
        System.out.println("PRIVATE - Serial number via getter: " + getSerialNumber());
    }
    
    public void demonstrateMethodAccess() {
        System.out.println("\n=== Demonstrasi Method Access dalam Subclass ===");
        
        // BISA
        displayPublicInfo(); // public method
        
        // BISA
        powerOn(); // protected method
        
        // BISA
        displayBasicInfo(); // default method
        
        // TIDAK BISA
        // validateSerialNumber(); // private method
        System.out.println("Private method tidak bisa dipanggil dari subclass");
    }
}