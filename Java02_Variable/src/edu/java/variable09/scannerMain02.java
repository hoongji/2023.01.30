package edu.java.variable09;

import java.util.Scanner;

public class scannerMain02 {

	public static void main(String[] args) {
		//scanner 사용시 주의할 점 
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("age = " + age);
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("name = " + name);
		
		sc.close();
		
		
		//
	}// end main()

}//end scannerMain02
