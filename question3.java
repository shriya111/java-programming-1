package pro;
import java.util.*;
class Emp{

	int id;
	String name;
	String designation;
	String emploc;
	int Salary;
	public int getId() {
        return id;
    }
	public void setId(final int id) {
        this.id = id;
    }
	public int getSal() {
        return Salary;
    }
	public void setSal(final int Salary) {
        this.Salary= Salary;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        // Validating the name and throwing an exception if name is null or length is <= 0.
        if(name == null ||  name.length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(final String designation) {
        this.designation = designation;
    }
    public String getCompany() {
        return emploc;
    }
    public void setCompany(final String emploc) {
        this.emploc = emploc;
    }
   
    public String toString() {
        return "Emp: [Salary =" +getSal() +", id= " + getId() + ", name= " + getName() + ", designation= " + getDesignation() + ", company= " + getCompany() + "]";
    }
}
 class Employee{
    public static void main(String args[]){
    	final Emp myemployee = new Emp();
    	final Emp myemployee1 = new Emp();
    	final Emp myemployee2 = new Emp();
        // Setting the employee details via the setter methods.
        myemployee.setId(1002);
        myemployee.setName("Harry");
        myemployee.setDesignation("Software Developer");
        myemployee.setCompany("ABC Corporation");
        myemployee.setSal(2000);
        myemployee1.setId(1001);
        myemployee1.setName("James");
        myemployee1.setDesignation("Web Developer");
        myemployee1.setCompany("ABC");
        myemployee1.setSal(2500);
        myemployee2.setId(1003);
        myemployee2.setName("John");
        myemployee2.setDesignation("Web Developer");
        myemployee2.setCompany("Muraj's");
        myemployee1.setSal(1800);
        System.out.println(myemployee.toString());
        System.out.println(myemployee1.toString());
        System.out.println(myemployee2.toString());
     }
    } 