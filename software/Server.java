package software;

import hardware.Computer;

public class Server extends Computer {
    private String serverType;
    public int maxConnections;
    
    public Server(String serialNumber, String brand, String model, String processor, String os, String serverType) {
        super(serialNumber, brand, model, processor, os);
        this.serverType = serverType;
        this.maxConnections = 1000;
    }
    
    public void demonstrateInheritanceAcrossPackages() {
        System.out.println("\n=== Demonstrasi Inheritance Across Packages (Server extends Computer) ===");
        
        // BISA
        System.out.println("PUBLIC - Model: " + model);
        System.out.println("PUBLIC - OS: " + operatingSystem);
        
        // BISA
        System.out.println("PROTECTED - Processor: " + processor);
        System.out.println("PROTECTED - Power status: " + isOn);
        
        // TIDAK BISA
        // System.out.println(brand); // ERROR default access
        // System.out.println(ramSize); // ERROR default access
        System.out.println("DEFAULT - Brand: Tidak bisa diakses karena beda package, walaupun inheritance");
        
        // TIDAK BISA
        // System.out.println(serialNumber); // ERROR
        System.out.println("PRIVATE - Serial: Tetap tidak bisa diakses");
        System.out.println("PRIVATE - Serial via getter: " + getSerialNumber());
    }
    
    public void demonstrateMethodInheritance() {
        System.out.println("\n--- Method Access dalam Inheritance Across Packages ---");
        
        // BISA
        displayPublicInfo();
        
        // BISA
        powerOn();
        System.out.println("PROTECTED method bisa dipanggil dari subclass di package lain");
        
        // TIDAK BISA
        // displayBasicInfo(); // ERROR
        System.out.println("DEFAULT method tidak bisa dipanggil meski inheritance karena beda package");
    }
    
    public void startServer() {
        System.out.println("Starting " + serverType + " server: " + model);
        powerOn(); // protected method
        System.out.println("Server ready to accept " + maxConnections + " connections");
    }
    
    @Override
    public void displayPublicInfo() {
        super.displayPublicInfo();
        System.out.println("Server Type: " + serverType + ", Max Connections: " + maxConnections);
    }
}