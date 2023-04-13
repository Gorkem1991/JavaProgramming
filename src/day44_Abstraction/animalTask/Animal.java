package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private double size;
    private String color;
    public final static boolean canBreath;
    static{
        canBreath = true;

    }


    public Animal(String name, String breed, char gender, int age, double size, String color) {
       setName(name);
        this.breed = breed;
        if(!(gender == 'M' || gender =='F'))
        {
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
         setAge(age);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eats();

    public void drinks()
    {
        System.out.println(name + " is drinking water");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
