package software;

import hardware.Computer;
import hardware.Laptop;

public class ITSupport {
    private String supporterName;
    public String department;
    
    public ITSupport(String supporterName, String department) {
        this.supporterName = supporterName;
        this.department = department;
    }
    
    public void testAccessToHardware() {
        System.out.println("\n=== Demonstrasi Access dari Package Software ke Package Hardware ===");
        System.out.println("IT Support: " + supporterName + " dari " + department);
        
        // Object dari class Computer
        Computer computer = new Computer("C001", "Lenovo", "Legion", "Intel i7", "Windows 11");
        
        System.out.println("\n--- Akses ke Computer dari Package Software ---");
        
        // BISA
        System.out.println("PUBLIC - Model: " + computer.model);
        System.out.println("PUBLIC - OS: " + computer.operatingSystem);
        
        // TIDAK BISA
        // System.out.println(computer.processor); // ERROR
        // System.out.println(computer.isOn); // ERROR
        System.out.println("PROTECTED - Processor: Tidak bisa diakses karena beda package");
        
        // TIDAK BISA
        // System.out.println(computer.brand); // ERROR
        // System.out.println(computer.ramSize); // ERROR
        System.out.println("DEFAULT - Brand: Tidak bisa diakses karena beda package");
        
        // TIDAK BISA
        // System.out.println(computer.serialNumber); // ERROR
        System.out.println("PRIVATE - Serial: Tidak bisa diakses langsung");
        System.out.println("PRIVATE - Serial via getter: " + computer.getSerialNumber());
        
        System.out.println("\n--- Method Access dari Package Software ---");
        
        // BISA
        computer.displayPublicInfo();
        
        // TIDAK BISA
        // computer.powerOn(); // ERROR
        System.out.println("PROTECTED method tidak bisa dipanggil dari package lain");
        
        // TIDAK BISA
        // computer.displayBasicInfo(); // ERROR
        System.out.println("DEFAULT method tidak bisa dipanggil dari package lain");
    }
    
    public void testAccessToLaptop() {
        System.out.println("\n--- Akses ke Laptop dari Package Software ---");
        
        Laptop laptop = new Laptop("L001", "Asus", "ZenBook", "Intel i7", "Windows 11", 14);
        
        System.out.println("PUBLIC - Model: " + laptop.model);
        System.out.println("PUBLIC - Screen Size: " + laptop.screenSize + "\"");
        
        laptop.displayPublicInfo();
        
        // Yang lain tidak bisa diakses karena beda package
        System.out.println("PROTECTED dan DEFAULT tidak bisa diakses dari package lain");
    }
}