package com.syntax.class15;

public class Google {
	
	  // define features such as emp id, name, last name, salary, title
    // define a behavior working, get paid, attending meetings


		int empId;
		double salary;
		
		String name, lastname, title;
		
		void working() {
			System.out.println(title+ " is working");
		}
		void getPaid() {
			System.out.println(name + " is getting paid" + salary);
		}
		void attendMeetings() {
			System.out.println(name + " attends meetings");
		}
		
		public static void main(String[] args) {

			
			Google emp1=new Google();
			emp1.empId=123;
			emp1.name="Abe";
			emp1.lastname="Dagnachew";
			emp1.title="CEO";
			emp1.salary=200000;
			emp1.working();
			emp1.getPaid();
			emp1.attendMeetings();
			emp1.attendMeetings();
			
			//creating second object
			Google emp2=new Google();
			emp2.empId=123;
			emp2.name="Abe";
			emp2.lastname="Dagnachew";
			emp2.title="CEO";
			emp2.salary=200000;
			emp2.working();
			emp2.getPaid();
			emp2.attendMeetings();
			emp2.attendMeetings();
			
		}
		
		
		}


