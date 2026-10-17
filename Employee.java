package inheritDemo;

public class Employee {

    private String name ;
    private double salary;
    public Employee(String name ,double salary){
     this.name = name;
      this.salary=salary;
    }
    public void getData(){
        System.out.println("The details of the employee are "+
                "\nName : "+name+" and Salary : "+salary);
    }
    public String getname(){
        return name;

    }
    public double getSalary(){
        return salary;

    }

}
