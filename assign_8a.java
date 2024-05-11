import java.util.*;
class Employee
{
    int eid;
    String name;
    double basic;
    String city;
    public Employee(int eid,String name,double basic,String city)
    {
        this.eid=eid;
        this.name=name;
        this.basic=basic;
        this.city=city;
    }
    public void DisplayDetails()
    {
        System.out.println("Employee ID: "+eid);
        System.out.println("Name: "+name);
        System.out.println("Basic salary: "+basic);
        System.out.println("City: "+city);
    }
    public double Salary()
    {
        return 0.0;
    }
}
class Company1 extends Employee
{
    public Company1(int eid,String name,double basic,String city)
    {
        super(eid,name,basic,city);
    }
    public double Salary()
    {
        double agp=0.4*basic;
        double mergedbasic = basic + agp;
        double da= 0.25*mergedbasic;
        double hra = 0.10*mergedbasic;
        return basic+agp+da+hra;
    }

}
class Company2 extends Employee
{
    public Company2(int eid,String name,double basic,String city)
    {
        super(eid,name,basic,city);
    }
    public double Salary()
    {
        double agp=0.5*basic;
        double mergedbasic = basic + agp;
        double da= 0.50*mergedbasic;
        double hra = 0.15*mergedbasic;
        return basic+agp+da+hra;
    }

}
class assign_8a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Employee e[] = new Employee[2];
        System.out.println("Enter company1 details: ");
        System.out.println("Enter employee id: ");
        int eid = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.println("Enter city: ");
        String city = sc.next();
        e[0]=new Company1(eid,name,basic,city);
        System.out.println("Enter company2 details: ");
        System.out.println("Enter employee id: ");
        int eid1 = sc.nextInt();
        System.out.println("Enter name: ");
        String name1 = sc.next();
        System.out.println("Enter basic salary: ");
        double basic1 = sc.nextDouble();
        System.out.println("Enter city: ");
        String city1 = sc.next();
        e[1]=new Company2(eid1,name1,basic1,city1);
        for(Employee employee:e)
        {
            System.out.println("\nEmployee Details:");
            employee.DisplayDetails();
            double S=employee.Salary();
            System.out.println("Gross Salary: "+S);
        }
        sc.close();
    }
}