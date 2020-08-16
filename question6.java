package pro;
import java.util.*;
class E{
    String EmpName;
    int EmpYearOfJoining;
    int EmpSalary;
    String EmpAddress;
    E(){
    }
    E(String name,int yearOfJoining, int salary,String address){
        EmpName = name;
        EmpYearOfJoining = yearOfJoining;
        EmpSalary = salary;
        EmpAddress = address;
    }
}
class assignment6{
    public static void main(String[] args) {
        E Emp = new E("ABC",2019,50000,"ABC Street");
        E Emp1 = new E("DEF",2018,45000,"DEF Street");
        E Emp2 = new E("GHI",2020,70000,"GHI Street");
        System.out.println("Name    " + "Year of joining    "+ "  Address");
        System.out.println(Emp.EmpName +"          " + Emp.EmpYearOfJoining+"           "+ Emp.EmpAddress);
        System.out.println(Emp1.EmpName +"          " + Emp1.EmpYearOfJoining+"           "+ Emp1.EmpAddress);
        System.out.println(Emp2.EmpName +"          " + Emp2.EmpYearOfJoining+"           "+ Emp1.EmpAddress);

    }

}