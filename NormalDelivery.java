package Abstract;

public class NormalDelivery extends FoodDelivery{
    private double deliveryCharges ;

    public NormalDelivery(  String itemName ,double price) {
        super(itemName,price );

    }
    public void calculateBill(){
        deliveryCharges =50.0;

    }
    public void showOrderdetails(){
        super.showOrderdetails();
        System.out.println("Delivery Charges is: "+deliveryCharges);
        System.out.println("The total bill is: "+super.getPrice()+deliveryCharges);
    }
}
