package Comparing;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang.builder.CompareToBuilder;

public class MultipleFieldSorter {
	public static void main(String[] args) 
    {
		 List<Employee> list = Arrays.asList(new Employee(1, "A", "B", 34), 
                 new Employee(4, "C", "D", 30), 
                 new Employee(3, "B", "A", 31), 
                 new Employee(2, "D", "C", 25),
                 new Employee(5, "A", "B", 25),
                 new Employee(5, "A", "C", 25),
                 new Employee(5, "A", "C", 26));
/*
		 Collections.sort(list, new FirstNameSorter()
         .thenComparing(new LastNameSorter())
         .thenComparing(new AgeSorter()));

		 System.out.println(list);*/
		 Collections.sort(list, new Comparator<Employee>() 
	        {
	            public int compare(Employee empOne, Employee empTwo) 
	            {
	                return new CompareToBuilder()
	                        .append(empOne.getFirstName(), empTwo.getFirstName())
	                        .append(empOne.getLastName(), empTwo.getLastName())
	                        .append(empOne.getAge(), empTwo.getAge())
	                        .toComparison();
	            }
	        });
	 
	        System.out.println(list);   //Sorted list
    }
}
