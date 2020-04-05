package com.syntax.class20;

public class ScrumTeam extends Employee {
	String ceremonies;
	
	void attendMeeting() {
		System.out.println("Scrum team attends " + ceremonies);
	}
}
class ProductOwner extends ScrumTeam{
	void prioritizeBacklog() {
		System.out.println("");
	}
}

class ScrumMaster extends ScrumTeam{
	void NavigateTeam() {
		System.out.println("Scrum master facililitates scrum team");
	}
}
class Developer extends ScrumTeam{
	void coding() {
		System.out.println("This team writes codes");
	}
}

class Automation extends ScrumTeam {
	void Automation() {
		System.out.println("test ensures quality of coding");
	}
}

class BA extends ScrumTeam{
	void BA() {
		System.out.println("Gathers requirements");
	}
}