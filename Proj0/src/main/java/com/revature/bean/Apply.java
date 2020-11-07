package com.revature.bean;


/*
 * 1. Populate # of accounts based on qty #
 * */

public class Apply extends Customer{
	private int qty;
	private int numOfAccounts;
	private int accountNum;
	
		public Apply() {
			super();
			System.out.print(" apply \n");
		}

		

		public Apply(int qty, int numOfAccounts, int accountNum) {
			super();
			this.qty = qty;
			this.numOfAccounts = numOfAccounts;
			this.accountNum = accountNum;
		}


		@Override
		public String toString() {
			return "Apply [qty=" + qty + ", numOfAccounts=" + numOfAccounts + ", accountNum=" + accountNum + "]";
		}	
		
		

}
