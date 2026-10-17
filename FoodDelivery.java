package Abstract;

public  abstract class FoodDelivery {
    private String itemName;
    private double price;

    public FoodDelivery( String itemName,double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public abstract void calculateBill();



    public void showOrderdetails(){

        System.out.println("The order details are: ");
        System.out.println("Item name is : " + itemName + " and the price : " + price);
    }

    public double getPrice() {
        return price;
    }
}