package com.atguigu.p1;

public class Test {

	public static void main(String[] args) {
		/* 创建一个 Customer ，名字叫 Jane Smith, 
		 他有一个账号为 1000，余额为 2000 元， 年利率为 1.23％ 的账户。*/ 
		Customer cust =new Customer("Jane", "Smith");
		Account acc=new Account(1000, 2000, 0.0123);
		cust.setAccount(acc);
//		cust.setAccount(new Account(1000, 2000.0, 0.0123));
		
//		对 Jane Smith 操作。 存入 100 元，再取出 960 元。再取出 2000 元。 打印出 Jane Smith 的基本信息 
		/*要求打印这样的信息：成功存入 ：100.0 成功取出：960.0 余额不足，取款失败 
		Customer [Smith, Jane] has a account: id is 1000, 
		annualInterestRate is 1.23％, balance is 1140.0 */
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		System.out.println("Customer ["+cust.getLastName()+","+cust.getfirstName()+"] "
		+"has a account: id is "+cust.getAccount().getId()
		+",balance is "+acc.getBalance()+",annualInterestRate is "
		+cust.getAccount().getAnnualInterestRate()*100+"%");
	}

}
