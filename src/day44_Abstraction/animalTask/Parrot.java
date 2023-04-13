package day44_Abstraction.animalTask;

public final class Parrot extends Animal{

    public Parrot(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eats()
    {
        System.out.println(getName() + " is eating chocolate");
    }

}
