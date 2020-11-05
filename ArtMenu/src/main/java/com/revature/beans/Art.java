package com.revature.beans;

public class Art {
	
	private String title;
	private int qty;
	
	
	public Art() {
		super();
	}
	public Art(int qty) {
		super();
		this.qty= qty;
	}

	public Art(String title, int qty) {
		super();
		this.title = title;
		this.qty= qty;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return qty;
	}

	public void setQuantity(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Art [title=" + title + ", qty=" + qty + "]";
	}
	
	
}
