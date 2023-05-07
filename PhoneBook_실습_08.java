import java.util.Scanner;

class Phone{
	String name;
	String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

class PhoneBook extends Phone{
	public PhoneBook(String name,String tel) {
		super(name,tel); //Phone 부모 클래스 생성자 생성
	}
	
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수>>");
		int Hnum = sc.nextInt();
		
		PhoneBook [] pb = new PhoneBook[Hnum];
		
		for (int i=0; i<pb.length; i++) {
			System.out.println("이름과 전화번호(이름과 전화번호는 빈 칸 없이 입력)");
			String name = sc.next();
			String tel = sc.next();
			pb[i] = new PhoneBook(name,tel);
		}
		
		System.out.println("저장되었습니다...");
		
		while (true) {
			System.out.println("검색할 이름>>");
			String name = sc.next();
			if (name.equals("그만")) break;
				boolean flag = false;
				
				for (int i =0; i<pb.length; i++) {
					if (pb[i].name.equals(name)) {
						System.out.println(pb[i].name+"의 번호는"+pb[i].tel+"입니다.");
						flag = true;
						break;
					}
				}
				if (flag==false) {
					System.out.println(name+"이 없습니다.");
				}
				
			
		}sc.close();
		

	}

}
