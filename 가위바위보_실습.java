package W3;

import java.util.Scanner;

public class 가위바위보_실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위","바위","보"}; //Array 지정
		String User;
		String Computer;
		int n ;
		
		while(true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.println("가위 바위 보!>>");
			User = sc.nextLine();
			if(User.equals("그만")) {
				break;
			}
			n = (int)(Math.random()*3);
			Computer = str[n];
			
			if(Computer.equals("가위")) {
				if(User.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터는 = 가위, 비겼습니다.");
				}else if(User.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터는 = 가위, 사용자가 이겼습니다.");
					
				}else {
					System.out.println("사용자 = 보, 컴퓨터는 = 가위, 사용자가 졌습니다.");
				}
				
			}else if(Computer.equals("바위")) {
				if(User.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터는 = 바위, 사용자가 졌습니다.");
				}else if (User.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터는 바위, 비겼습니다.");
				}else {
					System.out.println("사용자 = 보, 컴퓨터는 바위, 사용자가 이겼습니다.");
				}
			}else {
				if(User.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터는 = 보, 사용자가 이겼습니다.");
				}else if (User.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터는 보, 사용자가 졌습니다.");
				}else {
					System.out.println("사용자 = 보, 컴퓨터는 보, 비겼습니다.");
				}
				
			}
			
						
		} sc.close();
		

	}

}
