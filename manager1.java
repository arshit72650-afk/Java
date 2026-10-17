package inheritDemo;

public class manager1 extends Emp1 {
   private String dept;
   private double bonus;
   public manager1(String name ,double sal,String dept,double bonus){
   super(name,sal);
   this.dept = dept;
   this.bonus=bonus;
   }

   public double GetIncome(){
      double total= getSal() + bonus;
       return total;
   }
   public String getDept(){
       return dept;
   }
}