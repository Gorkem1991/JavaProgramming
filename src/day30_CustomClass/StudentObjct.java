package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjct {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Gorkem",'M',31, 46513, 'A');

        Student student2 = new Student();
        student2.setInfo("Halid",'M',33, 234234, 'C');

        Student student3 = new Student();
        student3.setInfo("As",'F',26, 344, 'B');

        Student student4 = new Student();
        student4.setInfo("Hülya",'F',24, 34245, 'F');

        Student student5 = new Student();
        student5.setInfo("Mert",'M',23, 53456, 'C');

        Student[] students = {student1,student2,student3,student4};

        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(students));

        for (Student s: studentList)
        {
            System.out.println(s);
        }

        System.out.println("-------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(Arrays.asList(students)); // grade A
        ArrayList<Student> angryBirds = new ArrayList<>(Arrays.asList(students)); // grade B

        earlyBirds.removeIf(p-> p.grade !='A');
        angryBirds.removeIf(p-> p.grade =='A');

        for(Student student : students)
        {
            if(student.grade =='A')
            {
                earlyBirds.add(student);
            }
            else
            {
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);






    }
}
