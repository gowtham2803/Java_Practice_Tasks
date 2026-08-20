class Employee {

    String name;
    int employeeId;
    double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class Main {

    public static void main(String[] args) {

        Employee e = new Employee("Gowtham", 385, 35000.00);

        Manager m = new Manager(
                "Stark",
                300,
                75800.00,
                "Information Technologies"
        );

        e.displayDetails();

        System.out.println();

        m.displayDetails();
    }
}