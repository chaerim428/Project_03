package com.javalec.function;


public class AddSubMulDivRemainder extends AddSubMulDiv {
	
	// --------------------------------------------------------------//
	// Desc : "Method를 사용 하여 Date 전달" - 1, 2, 4번의 나눈 나머지의 결과
	// Date : 2023.12.07(ver1.0)
	//      : 2023.12.08(ver2.0)
	// Author : Daegeun Lee
	// History : Field에 rem = 0으로 초기화 시켜주고 Method에 계산식을 넣어준다
	// --------------------------------------------------------------//
	
	// Field
	public int rem = 0;
	
	// Constructor
	
	
	// Method
	public int allAction() {
		rem = num1 % num2 % num4;
		return rem;
	}
}
