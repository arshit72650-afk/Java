package overriding;

public class Parent {
    public void show(int i){
        System.out.println("In show of parent "+i);
    }
    public void show(String i){
        System.out.println("In show of parent "+i);
    }
}
