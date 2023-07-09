package practice;

public class Student {

    public String name;
    public String surname;
    public int age;
    public int id;
    public static String schoolName;

    static {
        schoolName = "Cydeo";
    }

    public void sayName()
    {
        System.out.println("My name is " + name);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public Student(String name, String surname, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }
}
