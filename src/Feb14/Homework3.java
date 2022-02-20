package Feb14;
import java.util.*;
class NewEmployee 
{
    String name, skillSet;
    int id, salary, experience;
    public NewEmployee(String name, int id, int salary, int experience, String skillSet)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
        this.skillSet = skillSet;
    }
}
class OldEmployee 
{
    String name, skillSet;
    int id, salary, experience;
    public OldEmployee(String name, int id, int salary, int experience, String skillSet) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
        this.skillSet = skillSet;
    }
}
public class Homework3 
{
    public static void main(String[] args) 
    {
        NewEmployee new1 = new NewEmployee("VIRAT", 10001, 600000, 5, "Java");
        NewEmployee new2 = new NewEmployee("DIPANKAR", 10002, 300000, 2, "Python");
        NewEmployee new3 = new NewEmployee("MANISH", 10003, 400000, 1, "C++");
        NewEmployee new4 = new NewEmployee("DEEPAK", 10004, 500000, 5, "Angular");
        NewEmployee new5 = new NewEmployee("RAHUL", 10005, 600000, 6, "Php");
        OldEmployee old1 = new OldEmployee("SHIVANI",10006, 100000, 3, "Java");
        OldEmployee old2 = new OldEmployee("MISTI", 10007, 200000, 4, "Python");
        OldEmployee old3 = new OldEmployee("PRIYA", 10008, 300000, 3, "C++");
        OldEmployee old4 = new OldEmployee("AARTI", 10009, 400000, 5, "Angular");
        OldEmployee old5 = new OldEmployee("RUHI", 10010, 500000, 6, "Php");
        HashSet<Object> EmployeeSet = new HashSet<>();
        EmployeeSet.add(new1);
        EmployeeSet.add(new2);
        EmployeeSet.add(new3);
        EmployeeSet.add(new4);
        EmployeeSet.add(new5);
        EmployeeSet.add(old1);
        EmployeeSet.add(old2);
        EmployeeSet.add(old3);
        EmployeeSet.add(old4);
        EmployeeSet.add(old5);
        Set<String> skillSetWithJava = new HashSet<>();
        System.out.println("Total no of employees: " + EmployeeSet.size());
        Object forRemoval = null;
        for (Object o : EmployeeSet) 
        {
            if (o.getClass() == NewEmployee.class) 
            {
                if (((NewEmployee) o).id == 106) 
                {
                    System.out.println("Removed id 106");
                    forRemoval=o;
                }
                if (((NewEmployee) o).skillSet.contains("Java")) 
                {
                    skillSetWithJava.add(((NewEmployee) o).name);
                }
            } 
            else 
            {
                if (((OldEmployee) o).id == 106) 
                {
                    forRemoval=o;
                    System.out.println("Removed id 106");
                }
                if (((OldEmployee) o).skillSet.equals("Java")) 
                {
                    skillSetWithJava.add(((OldEmployee) o).name);
                }
            }
        }        
        EmployeeSet.remove(forRemoval);
        for (String s : skillSetWithJava) 
        {
            System.out.println("Skill set with Java :" + s);
        }
    }
}