package com.revature.player;

import com.revature.bean.Attributes;

public class Player {

	public static void main(String[] args) {
		Attributes defaultPlayer = new  Attributes();
		Attributes player1 = new  Attributes("Lebron");
		Attributes player2 = new  Attributes("Kawhi", "Clippers", "PF");
		Attributes player3 = new  Attributes("Kyrie", "Nets","PG");
		
		System.out.println(defaultPlayer);
		System.out.println(player1);		
		System.out.println(player2);
		System.out.println(player3);
		
	}

	
}
