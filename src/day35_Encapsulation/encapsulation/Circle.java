package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public double pi;

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        if(radius<=0)
        {
            return;
        }
        this.radius=radius;
    }

    public Circle(double pi) {
        this.pi = pi;
    }

    public void calcArea()
    {
        System.out.println(pi*radius);
    }
    public void calcPerimeter()
    {
        System.out.println();
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
