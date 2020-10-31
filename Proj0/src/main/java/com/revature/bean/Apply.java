package com.revature.bean;


/*
 * 1. Populate # of accounts based on qty #
 * */

public class Apply extends Customer{
	private int qty;
	private int num;
	
		public Apply() {
			super();
			System.out.print(" apply \n");
		}

		public Apply(int qty, int num) {
			super();
			this.qty = qty;
			this.num = num;
		}

		public void applyMenu() {
			System.out.println("Apply Menu");
			System.out.println("_________________________________");
			System.out.println("complete");
		}
		
		
		@Override
		public String toString() {
			return "Accounts [qty=" + qty + ", num=" + num + "]";
		}	
		
		

}
