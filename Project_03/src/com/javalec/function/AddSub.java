package com.javalec.function;

public class AddSub extends Addition {
	/* -------------------------------------------------------------------------------
		(1) Desc :	subAction() : Field를 사용한 2번 문제 (1번과 3번, 4번의 숫자의 뺄셈)
					sub2Action() : Constructor를 사용한 1번 문제 (3번과 4번의 숫자의 뺄셈)
					sub3Action() : Constructor를 사용한 2번 문제 (1, 2, 3번의 숫자의 뺄셈)
					sub4Action() : Method를 사용한 1번 문제 (1, 2, 4번의 숫자의 뺄셈)
					sub5Action() : Method를 사용한 2번 문제 (2번과 4번의 숫자의 뺄셈)
					
		(2) Date : 2023.12.07(Ver1.0)
				   2023.12.08(Ver2.0)
	
		(3) Author : Gwangyeong
	
		(4) History : 1. 초기 로직 제작.
					  2. Main 구상 후 변경한 로직 적용.(Constructor 구조 새로 변경)
					  3. 주석 추가.
	 ------------------------------------------------------------------------------- */
	
	// Field
	
	// Constructor
	public AddSub() {
		// TODO Auto-generated constructor stub
	}
	
	public AddSub(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
		sub2Action();
	}
	
	public AddSub(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		sub3Action();
	}
	
	// Method
	public int subAction() {	// Field를 사용한 2번 문제 (1번과 3번, 4번의 숫자의 뺄셈)
		return (num1 - num3 - num4);
	}
	
	public int sub2Action() {	// Constructor를 사용한 1번 문제 (3번과 4번의 숫자의 뺄셈)
		return (num3 - num4);
	}
	
	public int sub3Action() {	// Constructor를 사용한 2번 문제 (1, 2, 3번의 숫자의 뺄셈)
		return (num1 - num2 - num3);
	}
	
	public int sub4Action() {	// Method를 사용한 1번 문제 (1, 2, 4번의 숫자의 뺄셈)
		return (num1 - num2 - num4);
	}
	
	public int sub5Action() {	// Method를 사용한 2번 문제 (2번과 4번의 숫자의 뺄셈)
		return (num2 - num4);
	}
}
