package Class;

public class Company {
    private int age ;
    private String name ;
    private Double salary;
    private static int count=0;

    public Company (int a ,String b,Double s){
        age = a;
        name = b;
        salary = s;
        count++;
    }

    public void getValue(){
        System.out.println("The info about empolyee ");
        System.out.println("The name is "+name +"\n The age is "+age +"\nThe salary is "+ salary);
    }
    public static void Count()
    {
        System.out.println("The number of employees :" + count);
    }


    protected void finalize() {
        --count;
    }
}
