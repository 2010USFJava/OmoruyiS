package com.revature.bean;

public class Messages {
	

	public static void quitMsg() {
		System.out.println("\n\tQuiting...\n");
		
	}

	public static void errMsg() {
		System.out.println("\n***Error: Invalid Input***** \n");
		
	}

	public static void processMsg() {
		System.out.println("\n\tProcessing...\n\n");
		try
		{
			Thread.sleep(300);
			System.out.print("[#                   ]    1%\r");
		    Thread.sleep(800);
		    System.out.print("[##########          ]    50%\r");
		    Thread.sleep(800);
		    System.out.print("[################    ]    75%\r");
		    Thread.sleep(800);
		    System.out.print("[####################]    100%\r\n");
		    Thread.sleep(800);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
	}
	
	
	

}
