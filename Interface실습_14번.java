package W5;

interface Shape{
	void redraw();
	double getArea();	
}

class Circle implements Shape{
	private int r;
	
	Circle(int r) {
		this.r = r;
	}
	
	public void redraw() {
		System.out.println("--- 다시 그립니다. 반지름이"+ r + "인 원입니다.");
	}
	public double getArea() {
		return (r*r*3.14);
	}
}

class Oval implements Shape{
	private int a, b;
	
	Oval(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void redraw() {
		System.out.println("--- 다시 그립니다."+a+"x"+b+"에 내접하는 타원입니다.");
	}
	
	public double getArea() {
		double area = a * b * 3.14;
		return Double.parseDouble(String.format("%.13f", area));
	}
}

class Rect implements Shape{
	private int a, b;
	
	Rect(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void redraw() {
		System.out.println("--- 다시 그립니다."+a+"x"+b+"에 내접하는 사각형입니다.");
	}
	
	public double getArea() {
		return a*b;
	}
}

public class Interface실습_14번 {

	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		
		for(int i=0; i<list.length; i++) list[i].redraw(); //메소드 선언만 해서 return 값이 필요없음.
		for(int i=0; i<list.length; i++) System.out.println("면적은" + list[i].getArea()); //println이라서 return 값만 필요
	}

}
