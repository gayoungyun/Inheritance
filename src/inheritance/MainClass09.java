package inheritance;
class Test09{
	public Test09(String s) {
		System.out.println(s+": 부모 생성자");
	}
	public Test09() {//디폴트 생성자
		System.out.println("부모 기본 생성자");
	}
}
class TestClass09 extends Test09{
	public TestClass09() {
		System.out.println("자식 기본생성자");
	}
	public TestClass09(String s) {//기본생성자 디폴트
		super(s);//생성해서 에러를 줄이자(기본생성자를 만들지 않았을때)
		System.out.println(s+": 자식 생성자");
	}
}
public class MainClass09 {
	public static void main(String[] args) {
		TestClass09 tc = new TestClass09("전달");
		TestClass09 tc2 = new TestClass09();//기본생성자로
		
	}
	
}
