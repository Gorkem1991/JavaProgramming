package day39_Recap.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {
        Square square = new Square(10);

        square.setSide(15);

        System.out.println(square);
        System.out.println(square.getName());

        Rectangle rectangle = new Rectangle(5,6);

        System.out.println(rectangle);

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());

        Circle circle = new Circle(9);

        System.out.println(circle);


    }



}
