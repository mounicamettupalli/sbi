package com.prj.bi;

public class Employee {
int empId;  
String empName;  
		    
//parameterized constructor with two parameters
Employee(int id, String name)
{  
this.empId = id;  
this.empName = name;  
}  
void info()
{
System.out.println("Id: "+empId+" Name: "+empName);
}  
		   
public static void main(String args[])
{  
Employee e1 = new Employee(10245,"Chaitanya");  
Employee e2 = new Employee(92232,"Negan");  
e1.info();  
e2.info();  }  
}
