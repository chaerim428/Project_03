package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.AddSubMulDivRemainder;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1. Addition : 덧셈 - 수진
		   2. AddSub : 덧셈 + 뺄셈 - 광영
           3. AddSubMul : 덧셈+뺄셈+곱셈 - 수민
           4. AddSubMulDiv : 덧셈+뺄셈+곱셈+나눗셈 - 채림
           5. AddSubMulDivRemainder : 덧셈+뺄셈+곱셈+나눗셈+나머지 - 대근
           6. Main?
		 */
		
		Scanner scan = new Scanner(System.in);
		int num1=0, num2=0, num3=0, num4=0; // 입력받는 숫자갯수
		
		System.out.print("1번의 숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		
		System.out.print("2번의 숫자를 입력하세요 : ");
		num2 = scan.nextInt();
		
		System.out.print("3번의 숫자를 입력하세요 : ");
		num3 = scan.nextInt();
		
		System.out.print("4번의 숫자를 입력하세요 : ");
		num4 = scan.nextInt();

		
		AddSubMulDivRemainder all = new AddSubMulDivRemainder(); 
		// AddSubMulDiv class 값 가져오기
		all.num1 = num1;
		all.num2 = num2;
		all.num3 = num3;
		all.num4 = num4;
		
		System.out.println(">>> Field를 사용 하여 Date 전달");
		System.out.println("1. 1번과 2번의 숫자의 합은 " + all.addAction() + "입니다.");
		System.out.println("2. 1번과 3번,4번의 덧셈 뺄셈 곱셈 나눗셈의 결과는 덧셈 : " + all.add1Action() + ", 뺄셈 : " + all.sub1Action() + ", 곱셈 : " + all.mul1Action() + ", 나눗셈 : " + all.div1Action() );
		System.out.println();
		
		System.out.println(">>> Constructor를 사용 하여 Date 전달");
		System.out.println("1. 3번과 4번의 덧셈 뺄셈 곱셈의 결과는 덧셈 : " + all.add2Action() + ", 뺄셈 : " + all.sub2Action() + ", 곱셈 : " + all.mul2Action());
		System.out.println("2. 1 2 3번의 뺄셈 곱셈의 결과는 뺄셈 : " + all.sub3Action() + ", 곱셈 : " + all.mul3Action());
		System.out.println();
		
		System.out.println(">>> Method를 사용 하여 Date 전달");
		System.out.println("1. 1 2 4번의 덧셈 뺄셈 곱셈 나눗셈 나머지의 결과는 덧셈 : " + all.add4Action() + ", 뺄셈 : " + all.sub4Action() + ", 곱셈 : " + all.mul4Action() + ", 나눗셈 : " + all.div4Action() + ", 나머지 : " + all.remainder4Action());
		System.out.println("2. 2번과 4번의 뺄셈 나눗셈의 결과는 뺄셈 : " + all.sub5Action() + ",나눗셈 : " + all.div5Action());
		
			
		
	}
	}

}
