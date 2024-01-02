/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author ASUS
 */
class Employee {
    private String name;  // Encapsulated attribute

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        throw new UnsupportedOperationException("Subclasses must implement the 'work()' method.");
    }
}

// Kelas Manager yang mewarisi Employee
class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

   
    @Override
 public void work() {
        System.out.println(getName() + " is managing tasks.");
    }
}

//Kelas Developer yang mewarisi Employee
class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }
    
    @Override
 public void work() {
        System.out.println(getName() + "is developer tasks.");
 }   
}

//Kelas Designer yang mewalkili Employee
class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }
    
    @Override
 public void work() {
        System.out.println(getName() + "is designer tasks");
 }   
}
// Kelas utama untuk melakukan pengujian
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Manager
        Manager manager = new Manager("aziz");
        Developer developer = new Developer("Wahyu");
        Designer designer = new Designer("Verstapen");
        // Memanggil metode work() pada objek Manager
        manager.work();
        developer.work();
        designer.work();
    }
}
