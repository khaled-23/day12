public class Rectangle extends Shape{
    private double width;
    private double length;


    public Rectangle(){
        this.length=1.0;
        this.width=1.0;
    }public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(double area){
        return area=width*length;
    }

    public double getPerimeter(double perimeter){
        return perimeter=2*(width+length);
    }


    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+length+" which is a subclass of " + super.toString();
    }
}
