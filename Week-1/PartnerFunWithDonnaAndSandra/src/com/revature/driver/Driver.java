package com.revature.driver;
import com.revature.bean.Player;

/*
 * 1.1 - 1.3: Instances
 * 2.1 - 2.3: All Print outs 
 */

public class Driver {
	public static void main(String[] args) {
		
	Player a = new Player("Lebron", "PF", "Lakers"); /* 1.1 */
	Player b = new Player("Kyrie", "PG", "Nets");	/* 1.2 */
	Player c = new Player("Clippers", "SF", "Clippers"); /* 1.3 */
	
	System.out.println(a); /* 2.1 */
	System.out.println(b); /* 2.2 */
	System.out.println(c); /* 2.3 */
	}
}
