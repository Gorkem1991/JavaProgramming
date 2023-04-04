package day37_Inheritance.scrumTask2;

import day37_Inheritance.scrumTask.ScrumMaster;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam{

    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester)
    {
        testers.add(tester);
    }
    public void addTesters(Tester[] testers)
    {
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id)
    {
        testers.removeIf(p->p.id == id);
    }

    public void addDeveloper(Developer developer)
    {
        developers.add(developer);
    }
    public void addDevelopers(Developer[] developer)
    {
        this.developers.addAll(Arrays.asList(developer));
    }
}
