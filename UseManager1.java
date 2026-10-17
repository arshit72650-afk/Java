package inheritDemo;

public class UseManager1 {
    public static void main(String[] args) {
        manager1 obj1 = new manager1("aryan",200000,"Software Engineer",12000);

        System.out.println("The name of the person is "+obj1.getname());
        System.out.println("the  salary is "+obj1.getSal());
        System.out.println("the  dept is "+obj1.getDept());
        System.out.println("The total salary is "+obj1.GetIncome());

    }
}
