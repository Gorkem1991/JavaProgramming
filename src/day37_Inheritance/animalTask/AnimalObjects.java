package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max","Husky","Small","Brown",'F',3);

        System.out.println(dog1);

        dog1.bark();


        Cat cat1 = new Cat("Love","Siamese","Small","White",'F',2);

        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King","Macaw","Small","Blue",'M',3);

        System.out.println(parrot1);

        parrot1.sing();

    }
}
