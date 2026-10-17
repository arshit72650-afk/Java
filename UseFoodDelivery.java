package Abstract;

public class UseFoodDelivery {
    public static void main(String[] args) {
      FoodDelivery obj1;
      obj1 = new NormalDelivery("Biriyani",1399.0 );
      obj1.calculateBill();
        obj1.showOrderdetails();

        
        obj1 = new FastDelivery("Biriyani",1399.0 );
        obj1.calculateBill();
        obj1.showOrderdetails();
    }
}
