package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark()
    {
        System.out.println(getName() + " is barking");
    }

    public void eats()
    {
        System.out.println(getName() + " is eating pizza");
    }

    @Override
    public void play() {

    }
}
