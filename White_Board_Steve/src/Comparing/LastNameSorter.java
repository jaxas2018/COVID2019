package Comparing;

import java.util.Comparator;

public class LastNameSorter implements Comparator<Employee> 
{
    public int compare(Employee o1, Employee o2) 
    {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
