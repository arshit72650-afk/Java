package overriding;

public class Cylinder extends Circle{
    private int height;
    public Cylinder(int radius,int height){
           super(radius);
        this.height=height;

    }
    public double Area (){
          return 2*(super.Area()+Math.PI*getRadius()*height);
    }

    public double Volume(){
        return 2*Math.PI*height;
    }
    public double CircleArea(){
        return super.Area();
    }
}
