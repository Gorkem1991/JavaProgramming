package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {
        Student student1 = new Student("Gorkem", "Agac",31,46245);
        Student student2 = new Student("Berkem", "Agac",31,46245);
        Student student3 = new Student("Cihan", "Agac",31,46245);
        Student student4 = new Student("Irem", "Agac",31,46245);

        Student[] allStudents = {student1,student2,student3,student4};

        ArrayList<Student> studentsNew = new ArrayList<>(Arrays.asList(allStudents));

        studentsNew.removeIf(p->p.name.startsWith("C"));

        System.out.println(studentsNew);

    }
}
