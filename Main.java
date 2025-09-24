import hardware.Computer;
import hardware.Laptop;
import software.ITSupport;
import software.Server;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("DEMONSTRASI ACCESS MODIFIER DAN ENKAPSULASI JAVA");
        System.out.println("======================================================");
        
        // Demonstrasi package sama
        System.out.println("\n1. AKSES DALAM PACKAGE YANG SAMA (hardware)");
        System.out.println("-----------------------------------------------------");
        
        Computer computer = new Computer("C002", "HP", "Pavilion", "AMD Ryzen 5", "Ubuntu 22.04");
        Laptop laptop = new Laptop("L002", "Lenovo", "ThinkPad", "Intel i7", "Windows 11", 15);
        
        System.out.println("Computer model (public): " + computer.model);
        computer.displayPublicInfo(); // public method
        
        System.out.println("\nLaptop demonstration:");
        laptop.demonstrateAccess();
        laptop.demonstrateMethodAccess();
        
        // Demonstrasi package berbeda
        System.out.println("\n\n2. AKSES DARI PACKAGE BERBEDA (software ke hardware)");
        System.out.println("-----------------------------------------------------");
        
        ITSupport itSupport = new ITSupport("Peter Parker", "IT Support");
        itSupport.testAccessToHardware();
        itSupport.testAccessToLaptop();
        
        // Demonstrasi inheritance lintas package
        System.out.println("\n\n3. INHERITANCE ACROSS PACKAGES");
        System.out.println("-----------------------------------------------------");
        
        Server server = new Server("S001", "Dell", "PowerEdge", "Intel Xeon", "Linux", "Web Server");
        server.demonstrateInheritanceAcrossPackages();
        server.demonstrateMethodInheritance();
        server.startServer();
        
        // Demonstrasi enkapsulasi getter/setter
        System.out.println("\n\n4. DEMONSTRASI ENKAPSULASI (GETTER/SETTER)");
        System.out.println("-----------------------------------------------------");
        
        System.out.println("Harga awal computer: Rp " + computer.getPrice());
        computer.setPrice(20000); // valid price
        System.out.println("Harga setelah diubah: Rp " + computer.getPrice());
        
        computer.setPrice(-50000); // invalid price - akan ditolak
        System.out.println("Harga setelah input invalid: Rp " + computer.getPrice());
    }
}