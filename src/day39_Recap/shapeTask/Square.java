package day39_Recap.shapeTask;


public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
       setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0)
        {
            System.err.println("Invalid Side:" + side);
        }
        this.side = side;
    }

    public double area()
    {
        return side*side;
    }
    public double perimeter()
    {
        return side*4;
    }

    public String toString() {
        return "Square{" +
                ", side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
