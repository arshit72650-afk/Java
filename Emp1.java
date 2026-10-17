package inheritDemo;

public class Emp1 extends person{
    private double sal;
    public Emp1(String name,double sal){
        super(name);
        this.sal=sal;
    }
   public double getSal(){
        return sal;
   }
}
