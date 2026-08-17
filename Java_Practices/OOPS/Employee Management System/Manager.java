public class Manager extends Employee implements Workable{

    public Manager(int id, String name, double salary){
        super(id,name,salary);
    }
    @Override
    public void calculateBonus(){
        double bonus = getSalary() * 0.20;
        System.out.println("Bonus is :" + bonus);
    }
    @Override
    public void work(){
        System.out.println("Manager is managing the team");
    }
}