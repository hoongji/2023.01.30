package edu.java.variable08;

import java.util.Scanner;

public class ScannerMain01 {

	public static void main(String[] args) {
		System.out.println("변수 입력");
		
		//입력 받기 위한 변수는 Scanner 선언 ,c++에서 scanf 같은 것
		Scanner sc = new Scanner(System.in);
//		System.out.println("국어 점수 입력 : ");
//		int kor = sc.nextInt();
//		System.out.println("국어 점수 : " + kor);
		
		//nextInt() : 정수를 입력받는 메소드 
		//nextDouble : 실수를 입력받는 메소드 
		//nextLine(): 문자열 한 줄을 입력받는 메소드. 아래 것이 더 좋음. 고통받음
		//next() : 문자열 한 줄을 입력받는 메소드. 엔터 버퍼를 처리 
		
		System.out.println();
		System.out.println("실수 입력 : ");
		double x = sc.nextDouble();
		System.out.println("x= " + x);
		
		
		
		//
	}// end main()

}//end ScannerMain01
