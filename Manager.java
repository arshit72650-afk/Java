package inheritDemo;

public class Manager extends Employee {

    private double bonus;
    public Manager(String name , double salary ,double bonus)
    {
        super(name,salary);
        this.bonus=bonus;
    }

    public double getBonus(){
        return bonus;

    }
    public double getIncome(){
        double total;
        total = getSalary() + bonus;
        return total;
    }
}
