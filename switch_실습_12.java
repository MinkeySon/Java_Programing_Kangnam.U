package W2;

import java.util.Scanner;

public class switch_실습_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		char s = sc.next().charAt(0);
		double b = sc.nextInt();
		double result1 = a+b;
		double result2 = a-b;
		double result3 = a*b;
		double result4 = a/b;
		
		switch(s) {
		case '+':
			System.out.println("연산>>a"+s+"b");
			System.out.println("a+b의 계산 결과는"+result1);
			break;
		
		case '-':
			System.out.println("연산>>a"+s+"b");
			System.out.println("a-b의 계산 결과는"+result2);
			break;
		case '*':
			System.out.println("연산>>a"+s+"b");
			System.out.println("a*b의 계산 결과는"+result3);
			break;
		case '/':
			if ((a==0)||(b==0)) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			System.out.println("연산>>a"+s+"b");
			System.out.println("a/b의 계산 결과는"+result4);
			break;
		default:
			System.out.println("오류입니다.");
			sc.close();
		
			
		
		}
		
		

	}

}
