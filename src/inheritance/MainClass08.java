package inheritance;

class Test08{
	public Test08(String s) {
		System.out.println(s+"부모 생성자 실행!!");
	}
}
class TestClass08 extends Test08{
	public TestClass08() {
		super("값 전달");//부모에 string s에 대한 값이 필요, 무조건 생성자 첫번째 줄에 와야한다
		System.out.println("자식 생성자 실행!!");
	}
}
public class MainClass08 {
	public static void main(String[] args) {
		TestClass08 tc = new TestClass08();
	}

}
