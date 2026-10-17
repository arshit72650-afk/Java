package inheritDemo;

public class UseEmployee {
    public static void main(String[] args)
    {
        Manager obj1 = new Manager("Aryan",100000,20000.0);
        obj1.getData();

        System.out.println(obj1.getBonus());// this way to called when its a method which returns some value

        System.out.println(obj1.getIncome());// this way to called when its a method which returns some value
        System.out.println(obj1.getname());// this way to called when its a method which returns some value
        System.out.println( obj1.getSalary());// this way to called when its a method which returns some value

    }
}
