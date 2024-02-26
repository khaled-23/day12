public class Square extends Rectangle{


    public Square(){

    }public Square(double side){
        side=5;

    }public Square(double side,double width,double length, String color, boolean filled){
        super(width,length,color,filled);
        side = length;
    }
    public double getSide(){
        return super.getLength();
    }

    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public double getPerimeter(double perimeter) {
        return getSide()*4;
    }
}
