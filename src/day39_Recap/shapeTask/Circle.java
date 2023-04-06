package day39_Recap.shapeTask;

public class Circle extends Shape {

    private double r;
    public static double pi = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r)
    {
        if(r<=0)
        {
            System.err.println("Invalid Radius: " + r);
            System.exit(1);
        }
        this.r = r;
    }

    public Circle(double r) {
        super("Circle");
        setR(r);
    }

    public double area()
    {
        return pi*r*r;
    }
    public double perimeter()
    {
        return 2*r*pi;
    }

    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", p=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
