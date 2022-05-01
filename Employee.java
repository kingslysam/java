package com.company.classAndInstanceExecrise;
import java.util.*;
public class Employee {
    public String raisalary(String name, int sal){
        return "Surname: "+name+ " and original salary is: "+sal+ " new raised salary is "+ (1.1*sal);
    }
    public String dedsalary(String name, int sal){
        return "Surname: "+name+ " and original salary is "+sal+ "new deduct salary is "+ (sal-(0.1*sal));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter surname of employee:");
        String name = input.next();
        System.out.println("Enter the current salary:");
        int sal = input.nextInt();
        System.out.println("\"r\" to raise salary,  \"d\" for deduction & \"n\" no changes");
        String choice=input.next();
        if (Objects.equals(choice, "r")) {
            System.out.println(emp.raisalary(name, sal));
        }else if(Objects.equals(choice,"d")){
            System.out.println(emp.dedsalary(name, sal));
        }else {
            System.out.println("Surname: "+name+" Salary: "+sal);
        }
    }
}
