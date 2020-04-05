package com.syntax.class20;

public class Test  {
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empNumber=101;
		emp.salary=90000;
		emp.getPaid();
		Employee.company="ABC";
		Employee.work();
		//features accessibe from grand parent
		ProductOwner po=new ProductOwner();
		po.empNumber=123;
		po.empNumber();
		po.salary=150000;
		po.getPaid();
		
		po.ceremonies="Sprint Grooming, Spring Planning, Sprint Demo, Daily Standup";
		po.attendMeeting();
		Employee.work();
		
		
	}
		
	}

