package com.lti.ex11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.lti.ex11.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:appctx.xml")

public class TestAccount {
	@Autowired
	private ApplicationContext appctx;
	@Autowired
	private Account tc;
	@Test
	public void testValidDeposit() throws AmountException
	{
	
		tc.deposit(1000.0);
	}
	@Test
	public void testInvalidDeposit() throws AmountException
	{
		tc.deposit(-102);
	}
	@Test
	public void testValidWithdraw() throws AmountException, BalanceException
	{
		tc.deposit(10000.0);
		
		tc.withdraw(100);
	}
	@Test
	public void testInValidWithdraw() throws AmountException, BalanceException
	{
		tc.deposit(10000.0);
		tc.withdraw(100000);
	}

}
