package inheritance;

class Test07{
	public Test07() {
		System.out.println("부모 생성자 실행");
	}
}
class TestClass07 extends Test07{// 상속을 받으면 상속받은 부모 먼저 찾아가서 동작, 실행후 자기자신에게 돌아온다
	public TestClass07() {
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 tc = new TestClass07();
	}

}
