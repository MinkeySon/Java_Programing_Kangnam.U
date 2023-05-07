import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		char s = sc.next().charAt(0);
		double b = sc.nextInt();
		double result1 = a+b;
		double result2 = a-b;
		double result3 = a*b;
		double result4 = a/b; //0을 입력받아야 해서 int 말고 double 형으로 받아야 함.
		
				
		if (s == '+') {
			System.out.println("연산>>a"+s+"b");
			System.out.println("a+b의 계산 결과는"+result1);
		}else if(s == '-') {
			System.out.println("연산>>a"+s+"b");
			System.out.println("a-b의 계산 결과는"+result2);
		}else if(s=='*') {
			System.out.println("연산>>a"+s+"b");
			System.out.println("a*b의 계산 결과는"+result3);
		}else if(s=='/') {
			if((a==0)||(b==0)) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else{
				System.out.println("연산>>a"+s+"b");
				System.out.println("a/b의 계산 결과는"+result4);	
			}		
		
		}
		sc.close();
		

	}

}
