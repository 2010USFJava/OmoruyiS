package com.revature.bean;

/*
 * 1.1 - 1.3 Private variables
 * 1.4 - Constructor
 * 2.1 - 2.3 Getter and Setter Methods
 * 3.1 - Print Out
 */
public class Player {

	private String name; /* 1.1 */
	private String position; /* 1.2 */
	private String team; /* 1.3 */
	
	public Player(String name, String position, String team){ /* 1.4 */
		this.name = name;
		this.position = position;
		this.team = team;
	}

	public String getName() { /* 2.1 */
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getPosition(){ /* 2.2 */
		return this.position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	
	public String getTeam(){ /* 2.3 */
		return this.team;
	}
	public void setTeam(String team){
		this.team=team;
	}

	@Override 
	public String toString() { /* 3.1 */
		return "Person [Name:" + name + 
				" Position:" + position +
				" Team:" + team + "]";
	}
}

public class Food{ /* 4.1 */
	
}
