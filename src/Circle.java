public class Circle extends Shape{
    private double radius;


    public Circle(){
        this.radius=1.0;

    }public Circle(double radius){
        this.radius = radius;
    }public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double area){

        return area= 3.14*radius*radius;
    }
    public double getPerimeter(double perimeter){

        return perimeter=3.14*(radius*2);
    }

    @Override
    public String toString() {
        return "a circle with radius=" + radius+" which is subclass "+super.toString();
    }
}
