package com.cg.bean;


public class AccountBean {
	private int acc_Id;
	private String acc_Type;
	private int total_Amt;
	private int withdrawl_Amt;
	private int bal_Amt;
	private int transaction_Id;
	public AccountBean(int acc_Id, String acc_Type, int total_Amt,
			int withdrawl_Amt, int bal_Amt, int transaction_Id) {
		super();
		this.acc_Id = acc_Id;
		this.acc_Type = acc_Type;
		this.total_Amt = total_Amt;
		this.withdrawl_Amt = withdrawl_Amt;
		this.bal_Amt = bal_Amt;
		this.transaction_Id = transaction_Id;
	}
	public AccountBean(String acc_Type, int total_Amt, int withdrawl_Amt,
			int bal_Amt, int transaction_Id) {
		super();
		this.acc_Type = acc_Type;
		this.total_Amt = total_Amt;
		this.withdrawl_Amt = withdrawl_Amt;
		this.bal_Amt = bal_Amt;
		this.transaction_Id = transaction_Id;
	}
	public AccountBean() {
		
	}
	public int getAcc_Id() {
		return acc_Id;
	}
	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}
	public String getAcc_Type() {
		return acc_Type;
	}
	public void setAcc_Type(String acc_Type) {
		this.acc_Type = acc_Type;
	}
	public int getTotal_Amt() {
		return total_Amt;
	}
	public void setTotal_Amt(int total_Amt) {
		this.total_Amt = total_Amt;
	}
	public int getWithdrawl_Amt() {
		return withdrawl_Amt;
	}
	public void setWithdrawl_Amt(int withdrawl_Amt) {
		this.withdrawl_Amt = withdrawl_Amt;
	}
	public int getBal_Amt() {
		return bal_Amt;
	}
	public void setBal_Amt(int bal_Amt) {
		this.bal_Amt = bal_Amt;
	}
	public int getTransaction_Id() {
		return transaction_Id;
	}
	public void setTransaction_Id(int transaction_Id) {
		this.transaction_Id = transaction_Id;
	}
	@Override
	public String toString() {
		return "AccountBean [acc_Id=" + acc_Id + ", acc_Type=" + acc_Type
				+ ", total_Amt=" + total_Amt + ", withdrawl_Amt="
				+ withdrawl_Amt + ", bal_Amt=" + bal_Amt + ", transaction_Id="
				+ transaction_Id + "]";
	}
	
	
	
}

