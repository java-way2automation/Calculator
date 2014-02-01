package com.w2a;

public class Calculator {
	
	int input1;
	int input2;
	
	public void setInput(int input1, int input2)
	{
		this.input1 = input1;
		this.input2 = input2;
	}
	
	public int getsum()
	{
		int result = input1 + input2;
		return result;
	}
	
	public int getDiv()
	{
		int result = input1 / input2;
		return result;
	}

	
}
