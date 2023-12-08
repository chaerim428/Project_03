package com.javalec.function;

public class AddSubMulDiv extends AddSubMul {

	// --------------------------------------------------------------//
	// Desc : 1,2,4번 숫자를 나누기. 1,2,4번 숫자를 나누기. 2,4번 숫자를 나누기.
	// Date : 2023.12.08
	// Author : chaerim
	// --------------------------------------------------------------//
	
	// Field
	
	// Constructor
    public AddSubMulDiv() {
		// TODO Auto-generated constructor stub
	}
    
	// Method
	public double div1Action() {
		return (double)num1/num3/num4;
	}
	
	public double div4Action() {
		return (double)num1/num2/num4;
	}	
	
	public double div5Action() {
		return (double)num2/num4;
	}
}
