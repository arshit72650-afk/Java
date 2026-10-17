package overriding;

public class Child extends Parent {
    public void show(int i){
        System.out.println("In show of child "+i);
        super.show(i);
    }
    public void show(double i){
        System.out.println("In show of child "+i);
    }
}
