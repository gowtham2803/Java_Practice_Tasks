public abstract class Employee {

    private int id;
    private String name;
    private double salary;
    private static int totalEmployees = 0;
    public static final String COMPANY_NAME = "Stark Technologies";

    public Employee(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public static int getTotalEmployees(){
        return totalEmployees;
    }

    public void displayDetails(){
        System.out.println("The Employee Id :" + id);
        System.out.println("The Employee Name :" + name);
        System.out.println("The Employee Salary :" + salary);
    }

    public void displayDetails(boolean showSalary){
        System.out.println("The Employee Id: " + id);
        System.out.println("The Employee Name: " + name);

        if (showSalary) {
            System.out.println("The Employee Salary: " + salary);
        }
    }

    public abstract void calculateBonus();

}
