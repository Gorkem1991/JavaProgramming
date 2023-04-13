package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{

    public Eagle(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eats()
    {
        System.out.println(getName() + " is eating snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is eating snake");
    }

    @Override
    public void fly() {

    }
}
