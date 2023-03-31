package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Daniel");
        person1.setAge(28);
        person1.setAge(2000);

        System.out.println(person1.getName() + " : " + person1.getAge());

    }

}

