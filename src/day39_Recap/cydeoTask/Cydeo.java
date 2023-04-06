package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Muhtar",32,'M',1234,"Java Developer",157468);
        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 120000);
        Teacher teacher = new Teacher("Daniel", 32 , 'M', 3, "Math Teacher", 100000);
        Student student = new Student("Suhaib",30 , 'M', 8, "SDET");


        System.out.println(developer);

        developer.setAge(39);

        System.out.println(developer);

        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        developer.work();
        tester.work();
        teacher.work();

        developer.eat();
        developer.sleep();
        developer.drink();

        developer.fixingBugs();
        tester.createTicket();

        tester.eat();
        tester.sleep();
        tester.drink();

        student.eat();
        student.sleep();
        student.drink();

        student.study();

    }
}
