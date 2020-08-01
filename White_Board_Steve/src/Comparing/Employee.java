package Comparing;
import org.apache.commons.lang.builder.CompareToBuilder;
public class Employee implements Comparable<Employee> {
	 
    private Integer id;
    private Integer age;
    private String firstName;
    private String lastName;
 
    public Employee(Integer id, String fName, String lName, Integer age) {
            this.id = id;
            this.firstName = fName;
            this.lastName = lName;
            this.age = age;
    }
 
    //Getters and Setters
 
    @Override
    public String toString() {
        return "\nEmployee [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int compareTo(Employee o) {
		 
        if (o == null) {
            return -1;
        }
 
        CompareToBuilder buider = new CompareToBuilder();
 
        return buider
                .append(this.getFirstName(), o.getFirstName())
                .append(this.getLastName(), o.getLastName())
                .append(this.getAge(), o.getAge())
                .toComparison();
    }
}