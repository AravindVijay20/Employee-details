package org.emp;

public class Employee {
 public void empId(int id) {
System.out.println("Embloyee ID is"+id);
 }
 public void empId(String Name) {
System.out.println("Employee Name is"+Name);
 }
 public void empId1(String comp) {
System.out.println("Enter the company Name is"+comp);
 }
 public static void main(String[] args) {
	Employee e = new Employee();
	e.empId(123);
	e.empId("Aravind");
	e.empId("Greens");
}
}