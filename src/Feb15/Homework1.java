package Feb15;

import java.util.*;
class Homework1 
{
	public static void main(String[] args) 
	{
        Developer developer1=new Developer(1,"Aman",5,200000);
        Developer developer2=new Developer(2,"Abhishek",2,100000);
        Developer developer3=new Developer(3,"Karan",1,300000);
        Developer developer4=new Developer(4,"Dipankar",0,900000);
        Developer developer5=new Developer(5,"Ashutosh",3,250000);
        Developer developer6=new Developer(6,"Gaurav",5,340000);
        Developer developer7=new Developer(6,"Amit",5,350000);
        ArrayList<Developer> developers=new ArrayList<>();
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer4);
        developers.add(developer5);
        developers.add(developer6);
        developers.add(developer7);
        System.out.println("Sort By Experience");
        Collections.sort(developers,new byExp());
        System.out.println(developers);
        System.out.println("Sort By Salary");
        Collections.sort(developers,new bySal());
        System.out.println(developers);
        System.out.println("Sort By Name");
        Collections.sort(developers);
        System.out.println(developers);
    }
}
class Developer implements Comparable 
{
    int id;
    String name;
    int experience;
    int salary;
    public Developer(int id, String name, int experience, int salary) 
    {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
    @Override
    public int compareTo(Object o) 
    {
        return name.compareTo(((Developer)o).name);
    }
    @Override
    public String toString() 
    {
        return ("\nID: "+id+"Name: "+ name.toString()+" Experience: "+experience+" Salary: "+salary);
    }
}
class byExp implements Comparator<Developer>
{
    @Override
    public int compare(Developer o1, Developer o2) 
    {
        return o1.experience-o2.experience;
    }
}
class bySal implements Comparator<Developer>
{
    @Override
    public int compare(Developer o1, Developer o2) 
    {
        return o1.salary-o2.salary;
    }
}