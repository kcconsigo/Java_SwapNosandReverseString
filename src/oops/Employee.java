package oops;

public class Employee {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String args[])
	{
		Employee emp1 = new Employee();
		emp1.empid = 101;
		emp1.empname = "KC";
		emp1.salary = 20000;
		emp1.deptno = 10;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.empid = 102;
		emp2.empname = "Mario";
		emp2.salary = 25000;
		emp2.deptno = 20;
		emp2.display();
		
	}

}
