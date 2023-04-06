package day39_Recap.cydeoTask;

import com.sun.security.jgss.GSSUtil;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void work()
    {
        System.out.println(getJobTitle() + " " + getName() + " is testing the application");
    }
    public void createTicket()
    {
        System.out.println(getJobTitle() + " " + getName() + " is creatng a ticket");
    }




}
