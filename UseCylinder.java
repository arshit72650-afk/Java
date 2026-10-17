package overriding;

public class UseCylinder {
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder(7,34);

        System.out.println("The area of the Cylinder : "+obj1.Area());
        System.out.println("The Volume of the Cylinder : "+obj1.Volume());
        System.out.println("The area of the Circle: " + obj1.CircleArea());

    }
}
