package com.revature.beans;

public class Customer {
	
	private int uid;
	private String daoUser; 
	private String daoPass;
	private String daoFirst;
	private String daoLast;
	private double daoBalance;
	private long daoAccountNo;
	private int daoType;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int uid, String daoUser, String daoPass, String daoFirst, String daoLast) {
		super();
		this.uid = uid;
		this.daoUser = daoUser;
		this.daoPass = daoPass;
		this.daoFirst = daoFirst;
		this.daoLast = daoLast;
	}

	public Customer(int uid, double daoBalance, long daoAccountNo, int daoType) {
		super();
		this.uid = uid;
		this.daoBalance = daoBalance;
		this.daoAccountNo = daoAccountNo;
		this.daoType = daoType;
	}

	public Customer(int uid, String daoUser, String daoPass, String daoFirst, String daoLast, double daoBalance,
			long daoAccountNo, int daoType) {
		super();
		this.uid = uid;
		this.daoUser = daoUser;
		this.daoPass = daoPass;
		this.daoFirst = daoFirst;
		this.daoLast = daoLast;
		this.daoBalance = daoBalance;
		this.daoAccountNo = daoAccountNo;
		this.daoType = daoType;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getDaoUser() {
		return daoUser;
	}

	public void setDaoUser(String daoUser) {
		this.daoUser = daoUser;
	}

	public String getDaoPass() {
		return daoPass;
	}

	public void setDaoPass(String daoPass) {
		this.daoPass = daoPass;
	}

	public String getDaoFirst() {
		return daoFirst;
	}

	public void setDaoFirst(String daoFirst) {
		this.daoFirst = daoFirst;
	}

	public String getDaoLast() {
		return daoLast;
	}

	public void setDaoLast(String daoLast) {
		this.daoLast = daoLast;
	}

	public double getDaoBalance() {
		return daoBalance;
	}

	public void setDaoBalance(double daoBalance) {
		this.daoBalance = daoBalance;
	}

	public long getDaoAccountNo() {
		return daoAccountNo;
	}

	public void setDaoAccountNo(long daoAccountNo) {
		this.daoAccountNo = daoAccountNo;
	}

	public int getDaoType() {
		return daoType;
	}

	public void setDaoType(int daoType) {
		this.daoType = daoType;
	}

	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", daoUser=" + daoUser + ", daoPass=" + daoPass + ", daoFirst=" + daoFirst
				+ ", daoLast=" + daoLast + ", daoBalance=" + daoBalance + ", daoAccountNo=" + daoAccountNo
				+ ", daoType=" + daoType + "]";
	}
	
	
	

}
