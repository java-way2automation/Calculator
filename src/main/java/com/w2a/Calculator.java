package com.w2a;

/*
 * 
 * Integration
 * 
 * TFS --> source code managment + version controlling + continous Integration + test case management + 
 * 
 * ALM (application lifecycle management) --> Visual studio online = MTM + VSTP 
 * 
 * Git + Git hub + CI(jenkins) + Eclipse + Junit + Maven
 * 
 */

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
	
	public int getMul()
	{
		int result = input1 * input2;
		return result;
	}
	
	public int getDiff()
	{
		int result = input1 - input2;
		return result;
	}

	
}
