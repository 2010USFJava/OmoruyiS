package com.revature.bean;



import java.io.Serializable;

public class League implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4628095041091978161L;
	private String name;
	private String position;
	private String team;
	private int age;
	
	public League() {
		super();
		Player.leagueList.add(this);
		StoreData.writeLeagueFile(Player.leagueList);

	}
	
	public League(String name, String position, String team, int age) {
		super();
		this.name = name;
		this.position = position;
		this.team = team;
		this.age = age;
		Player.leagueList.add(this);
		StoreData.writeLeagueFile(Player.leagueList);

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "League [name=" + name + ", position=" + position + ", team=" + team + ", age=" + age + "]";
	}
	
	
	
	

}
