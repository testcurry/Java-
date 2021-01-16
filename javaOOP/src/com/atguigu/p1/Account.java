package com.atguigu.p1;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account(){
		
	}
	public Account(int id,double balance,double annualInterestRate) {
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	//取钱的方法
	public void withdraw(double amount){
		if (amount<0||amount>this.balance) {
			System.out.println("余额不足");
		}else{
			balance-=amount;
			System.out.println("取款成功,余额为："+balance);
		}
	
	}
	//存款的方法
	public void deposit(double amount){
		if (amount>0) {
			balance+=amount;
			System.out.println("存款成功,余额为："+balance);
		}
	}
}
