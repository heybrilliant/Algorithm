package chap01;

import java.util.Scanner;

// 실습 1-1 : 3개의 정숫값을 입력하고 그 중 최댓값을 구합니다 

public class Max3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.print("정수 A의 값 : "); 
		int a = scanner.nextInt();
		
		System.out.print("정수 B의 값 : "); 
		int b = scanner.nextInt();
		
		System.out.print("정수 C의 값 : "); 
		int c = scanner.nextInt();
		
		
		// a,b,c의 최댓값을 구하여 max에 대입
		// 1) max에 a값을 넣는다
		int max = a;
		// 2) b값이 max보다 크면 max에 b값을 넣는다
		if(b > max) max = b;
		// 3) c값이 max보다 크면 max에 c값을 넣는다
		if(c > max) max = c;
		
		System.out.println("최댓값은 "+ max + "입니다.");
	}

}
