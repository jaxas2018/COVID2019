package Comparing;

import java.util.Comparator;

public class AgeSorter implements Comparator<Employee> 
{
    public int compare(Employee o1, Employee o2) 
    {
        return o1.getAge() - o2.getAge();
    }
}