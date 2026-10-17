package inheritDemo;

public class Car extends Vehicle{
    public Car(int age) {
        super(100);
        System.out.println("const called of a child class" );
        System.out.println("age is " + age);
    }
}

class UseCar{

public static void main(String[] args) {

    Car obj1 = new Car(12);


        }
          }