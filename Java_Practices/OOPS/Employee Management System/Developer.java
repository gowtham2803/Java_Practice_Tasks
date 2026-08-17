public class Developer extends Employee implements Workable{

    public Developer(int id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public void calculateBonus(){
        double bonus = getSalary() * 0.10;
        System.out.println("Bonus :"+ bonus);
    }
    @Override
    public void work(){
        System.out.println("Developer is writing Code");
    }
}