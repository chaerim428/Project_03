package com.javalec.function;

public class Addition {
	// --------------------------------------------------------------//
	// Desc : sum2():숫자 2개 더하기. sum3():숫자 3개 더하기.
	// Date : 2023.12.07(Ver1.0)
	// 		  2023.12.08(Ver2.0)
	// Author : sujin
	// History :1. 내가 생각한 초기로직.
	//			2. Main 구상 후 변경한 로직 적용.
	// 			3. 페이지 설명 추가.
	// --------------------------------------------------------------//
		
	
	// Field
	public int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
	
	// Constructor
	public Addition(){
		
	}

	// Method 
	public int sum2() {	// 2개 숫자 더하기.
		return num1 + num2;
	}
	public int sum3() {	// 3개 숫자 더하기.
		return num1 + num3 + num4;
	}
	
}
