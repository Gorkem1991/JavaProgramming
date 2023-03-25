package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO;
    public String BA;
    public String SM;

   public ArrayList<Tester> testerList = new ArrayList<>();
   public ArrayList<Developer> devopsList = new ArrayList<>();
   public int daysOfSprint;


    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
    public void addTester(Tester tester)
    {
        testerList.add(tester);
    }
    public void addTester(Tester[] tester)
    {
        testerList.addAll(Arrays.asList(tester));
    }
    public void addDeveloper(Developer developer)
    {
        devopsList.add(developer);
    }
    public void addDeveloper(Developer[] developers)
    {
        devopsList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID)
    {
        testerList.removeIf(p->p.employeeID == employeeID);
    }

    public void removeDeveloper(int employeeID)
    {
        devopsList.removeIf(p->p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testerList.size() +
                ", total number of developes=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
