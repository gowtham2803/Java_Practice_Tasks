public class Main {
    public static void main(String[] args) {
        System.out.println(" Company Name : "+Employee.COMPANY_NAME);

        System.out.println("--Developer--");
        Developer developer = new Developer(01,"Gowtham",25000.00);
        developer.displayDetails();
        developer.calculateBonus();
        developer.work();
        System.out.println( "Total Employees: "+ Employee.getTotalEmployees());

        System.out.println("--Manager--");
        Manager manager = new Manager(02,"Stark",35000.00);
        manager.displayDetails();
        manager.calculateBonus();
        manager.work();
        System.out.println("Total Employees : "+Employee.getTotalEmployees());

        System.out.println("--Runtime Polymorphism--");
        Employee employee;
        employee = new Developer(03,"Steve",45000.00);
        employee.calculateBonus();
        employee = new Manager(04,"Rogous",5500.00);
        employee.calculateBonus();
    }

}
