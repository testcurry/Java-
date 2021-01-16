package com.atguigu.p1;
/*a. 声明三个私有对象属性：firstName、lastName 和 account。 
b. 声明一个公有构造器，这个构造器带有两个代表对象属性的参数（f 和 l）
c. 声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName 
返回相应的属 性。 d. 声明 setAccount 方法来对 account 属性赋值。 
e. 声明 getAccount 方法以获取 account 属性。a. 声明三个私有对象属性：
firstName、lastName 和 account。 b. 声明一个公有构造器，
这个构造器带有两个代表对象属性的参数（f 和 l） c. 
声明两个公有存取器来访问该对象属性，
方法 getFirstName 和 getLastName 返回相应的属 性。
d. 声明 setAccount 方法来对 account 属性赋值。
e. 声明 getAccount 方法以获取 account 属性。*/

public class Customer {
	private String lastName;
	private String firstName;
	private Account account;
	
	public  Customer(String lastName,String firstName) {
		this.lastName=lastName;
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public String  getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getfirstName(){
		return this.firstName;
	}
	public void setAccount(Account account){
		this.account=account;
	}
	public Account getAccount(){
		return this.account;
	}
}
