package com.revature.bean;

public class Messages {
	
	public static void quitMsg() {
		
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.println("\n\tQuiting...\n");
	}
	
	public static void loggingOutMsg() {
		System.out.println("\n\tLogging out of Account...\n");
	}
	
public static void exitMsg() {
		
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.println("\n\tExiting...\n");
	}
	
	

	public static void errMsg() {
		
		for (int i = 0; i < 50; ++i) System.out.println();
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
