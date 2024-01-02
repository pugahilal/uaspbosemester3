public class Employee {
    private String name;

    // Konstruktor
    public Employee(String name) {
        this.name = name;
    }

    // Metode work() yang akan diimplementasikan oleh kelas turunan
    public void work() {
        System.out.println("Employee " + name + " is working.");
    }

    // Getter untuk mendapatkan nama karyawan
    public String getName() {
        return name;
    }
}
public class Developer extends Employee {
    // Konstruktor
    public Developer(String name) {
        super(name);
    }

    // Implementasi metode work() khusus untuk Developer
    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is coding.");
    }
}
public class Designer extends Employee {
    // Konstruktor
    public Designer(String name) {
        super(name);
    }

    // Implementasi metode work() khusus untuk Designer
    @Override
    public void work() {
        System.out.println("Designer " + getName() + " is designing.");
    }
}
public class Manager extends Employee {
    // Konstruktor
    public Manager(String name) {
        super(name);
    }

    // Implementasi metode work() khusus untuk Manager
    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing tasks.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Membuat objek karyawan dengan tiga jenis pekerjaan
        Employee manager = new Manager("John");
        Employee developer = new Developer("Alice");
        Employee designer = new Designer("Bob");

        // Memanggil metode work() pada masing-masing objek
        manager.work();    // Manager John is managing tasks.
        developer.work();  // Developer Alice is coding.
        designer.work();   // Designer Bob is designing.
    }
}