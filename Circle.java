package overriding;



public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius=radius;

    }
    public double Area(){
        return Math.PI*radius*radius;
    }
    public int getRadius(){
        return radius;
    }
}
