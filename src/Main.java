public class Main {
    public static void main(String[] args) {

        System.out.println("before:-");
        Shape s1 = new Shape();
        System.out.println("shape ex1 : "+s1.toString());

        Shape s2 = new Shape("red", false);
        System.out.println("shape ex2 : "+s2.toString());


        s1.setFilled(false);
        s1.setColor("cyan");
        s2.setColor("purple");
        s2.setFilled(true);

        System.out.println("after:-");
        System.out.println("shape ex1 : "+s1.toString());
        System.out.println("shape ex2 : "+s2.toString());

        System.out.println("-----------------------------------------------------------");

        System.out.println("circle before:-");

        Circle c1 = new Circle();
        System.out.println("circle ex1: "+c1.toString());
        c1.setRadius(5);
        c1.setColor("darkBlue");

        Circle c2 = new Circle(15);
        System.out.println("circle ex2: "+c2.toString());
        c2.setRadius(3);
        c2.setColor("brightRed");

        Circle c3 = new Circle(12,"red",true);
        System.out.println("circle ex3: "+c3.toString());
        c3.setColor("pink");
        c3.setFilled(false);

        System.out.println("after:-");
        System.out.println("circle ex1: "+c1.toString());
        System.out.println("circle ex2: "+c2.toString());
        System.out.println("circle ex3: "+c3.toString());


        System.out.println("-----------------------------------------------------------");

        System.out.println("Rectangle before:-");
        Rectangle r1 = new Rectangle();
        System.out.println("rectangle ex1: "+ r1.toString());
        r1.setLength(5); r1.setColor("blue");

        Rectangle r2 = new Rectangle(15,4);
        System.out.println("rectangle ex2:"+ r2.toString());
        r2.setColor("red"); r2.setWidth(5); r2.setLength(2);

        Rectangle r3 = new Rectangle(15,10,"darkPink",true);
        System.out.println("rectangle ex3: "+r3.toString());
        r3.setFilled(false); r3.setLength(12); r3.setWidth(11);

        System.out.println("rectangle after:-");
        System.out.println("rectangle ex1: "+ r1.toString());
        System.out.println("rectangle ex2: "+ r2.toString());
        System.out.println("rectangle ex3: "+r3.toString());

        System.out.println("-----------------------------------------------------------");
        System.out.println("square before:-");
        Square sq1 = new Square();
        System.out.println("square ex1: "+ sq1.toString());
        sq1.setColor("cyan"); sq1.setWidth(5); sq1.setLength(14);

        Square sq2 = new Square(16);
        System.out.println("square ex2: "+sq2.toString());
        sq2.setLength(19);sq2.setColor("darkRed");sq2.setWidth(18);

        Square sq3 = new Square(10,12,17,"purple",false);
        System.out.println("square ex3: "+sq3.toString());
        sq3.setFilled(true);sq3.setColor("darkGreen");sq3.setLength(13);


        System.out.println("after:-");

        System.out.println("square ex1: "+ sq1.toString());

        System.out.println("square ex2: "+sq2.toString());

        System.out.println("square ex3: "+sq3.toString());
    }
}