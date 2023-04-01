package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max","Husky", "Small","Brown",'M',2);
        dog.sleep();
        dog.bark();
        dog.drink();
        dog.eat();
        dog.move();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarçın","British", "Small","Brown",'M',3);

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Benga", "Large","Orange",'M',4);

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);

    }
}
