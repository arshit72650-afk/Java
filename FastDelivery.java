package Abstract;

public class FastDelivery extends FoodDelivery{
    private double deliveryCharges ;

    public FastDelivery( String itemName,double price) {
        super( itemName,price);

    }
    public void calculateBill(){
        deliveryCharges = 100.0;

    }
    public void showOrderdetails(){
        super.showOrderdetails();
        System.out.println("Delivery Charges is: "+ deliveryCharges);
        System.out.println("The total bill is: "+(super.getPrice()+deliveryCharges));
    }
}
