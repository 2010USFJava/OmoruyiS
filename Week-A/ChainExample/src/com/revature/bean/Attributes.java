package com.revature.bean;

public class Attributes {
	private String name;
	private String team;
	private String position;
	
	private int rating; /* 1 - 100 */
	private int age;
	private int speed; /* 1 - 10*/
	
	public Attributes() {

	}
	
	public Attributes(String name) {
		this(name, "Lakers");
	}
	public Attributes(String name, String team) {
		this(name, team, "PG");
	}
	
	public Attributes(String name, String team, String position) {
		this(name, team, position, 99);
	}
	
	public Attributes(String name, String team, String position, int rating) {
		this(name, team, position, rating, 25);
	}
	
	public Attributes(String name, String team, String position, int rating, int age) {
		this(name, team, position, rating, age, 9);
	}
	
	public Attributes(String name, String team, String position, int rating, int age, int speed) {
		this.name = name;
		this.team = team;
		this.position = position;
		this.rating = rating;
		this.age = age;
		this.speed = speed;
	}
	
	@Override 
	public String toString() { /* 3.1 */
		return  "Player [" +
				" Name:" + name + 
				" Team:" + team +
				" Position:" +  position + 				
				" Rating:" + rating + 
				" Age:" + age +
				" Speed:" +  speed + 
				" ]";
	}
}
