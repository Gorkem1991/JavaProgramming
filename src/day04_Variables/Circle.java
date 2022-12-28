package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius=25;
        double diameter = 2*radius;
        double perimeter = diameter*pi;
        double area = radius*radius*pi;

        area = radius*radius*pi;
        perimeter= 2*radius*pi;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);
        System.out.println("radius = " + radius);

    }
}
