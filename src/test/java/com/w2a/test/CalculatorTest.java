package com.w2a.test;

import org.junit.Test;

import com.w2a.Calculator;

public class CalculatorTest {

	Calculator c = new Calculator();
	
	@Test
	public void testSum()
	{
		c.setInput(12, 89);
		c.getsum();
	}
	
	@Test
	public void testDiv()
	{
		c.setInput(12, 0);
		c.getDiv();
	}
	
	@Test
	public void testMul()
	{
		c.setInput(12, 89);
		c.getMul();
	}
	
	
	@Test
	public void testDiff()
	{
		c.setInput(12, 89);
		c.getDiff();
	}
	
	
	
}
