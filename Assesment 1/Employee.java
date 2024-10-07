package Assessment;

public class Employee
{
    int empid;
    String name;
    float basicsalary;
    double bonus;
    float netsalary;

    public Employee(int empid, String name, float basicsalary, double bonus, float netsalary)
    {
        this.empid = empid;
        this.name = name;
        this.basicsalary = basicsalary;
        this.bonus = bonus;
        this.netsalary = netsalary;

    }
    public void displaydetails()
    {
        System.out.println("employee id"+empid);
        System.out.println("employee name is"+name);
    }

}
class permanentemployee extends Employee
{
    int pf;
    public permanentemployee(int empid,String name, float basicsalary, double bonus,float netsalary,int pf)
    {
        super(empid,name,basicsalary,bonus,netsalary);
        this.pf=pf;
    }
    void calculatenetsalary()
    {
        netsalary=netsalary-pf;
    }
    void calculatebonus()
    {
        if(pf<1000)
        {
            bonus=100/10*basicsalary;
        }
        else if(pf>=1000 && pf<1500)
        {
            bonus=11.5/100*basicsalary;
        }
        else if(pf>=1500 && pf<1000)
        {
            bonus=12/100*basicsalary;
        }
        else if(pf>=1000)
        {
            bonus=15/100*basicsalary;
        }

    }
}
class temperoryemployee extends Employee
{
    int wages;
    int numberofdays;
    public temperoryemployee(int empid,String name,float basicsalary,double bonus, float netsalary,int wages, int numberofdays)
    {
        super(empid,name,basicsalary,bonus,netsalary);
        this.wages=wages;
        this.numberofdays=numberofdays;
    }
    void calculatenetsalary()
    {
        netsalary=wages*numberofdays;
    }
    void calculatebonus()
    {
        if(wages<1000)
        {
            bonus=15/100 * netsalary;
        }
        else if(wages>=1000 &&wages<1500)
        {
            bonus=12/100*netsalary;
        }
        else if(wages>=1500 && wages<=1750)
        {
            bonus=11/100*netsalary;
        }
        else if(wages>=1750)
        {
            bonus = 8 / 100 * netsalary;
        }

    }
}
class Employeepayroll
{
    public static void main(String args[]) {
        permanentemployee emp1 = new permanentemployee(101, "esther", 25000, 5000, 2000, 2000);
        emp1.calculatenetsalary();
        emp1.calculatebonus();
        System.out.println("Assessment.Employee is" + emp1.empid);
        System.out.println("Assessment.Employee name is" + emp1.name);
        System.out.println("Basic salary is" + emp1.basicsalary);
        System.out.println(" Provident fund is" + emp1.pf);
        temperoryemployee emp2 = new temperoryemployee(1002,"Rajesh",2000,1000,25000,1000, 10);
        emp2.calculatenetsalary();
        emp2.calculatebonus();
        System.out.println("Assessment.Employee is"+emp2.empid);
        System.out.println("Assessment.Employee name is"+emp2.name);
        System.out.println("Daily wages is"+emp2.wages);
        System.out.println("Number of days is"+emp2.numberofdays);

    }
}