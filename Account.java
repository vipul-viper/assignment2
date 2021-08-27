package com.lti.ex11;

import org.springframework.stereotype.Component;

import com.lti.ex2.stock;

class AmountException extends Exception
{
	AmountException(String str)
	{
		super(str);
		
	}
}
class BalanceException extends Exception
{
	BalanceException(String str)
	{
		super(str);
		
	}
}
@Component("acc")
public class Account {
	double balance;
	

	public Account() {
		super();
		
	}
  public Account(double balance) {
		super();
		this.balance = balance;
	}
	public double deposit(double amount)throws AmountException
	{
		if(amount<0)
			throw new AmountException("amount less than 0 not allowed");
		this.balance=this.balance+amount;
		System.out.println("balance after depositing : "+this.balance);
		return this.balance;
	}
	public double withdraw(double amount)throws AmountException,BalanceException
	{
		if(amount<0)
			throw new AmountException("amount less than 0 not allowed");
		if(amount>this.balance)
			throw new BalanceException("not enough balance");
		this.balance=this.balance-amount;
		System.out.println("balance after withdrawing : "+this.balance);
		return this.balance;
	}
	

	

}
