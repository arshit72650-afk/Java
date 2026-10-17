package overriding;

public class UseChild
{
    public static void main(String[] args) {
        Child obj1= new Child();
        obj1.show(12);
        obj1.show("Aryan");

        obj1.show(3.5);
    }
}
