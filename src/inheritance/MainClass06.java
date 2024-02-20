package inheritance;

class Test06{
	public void test() {
		System.out.println("부모 test 메소드");
	}
	
}
class TestClass06 extends Test06{
	public void test() {//자기자신한테 없으면 부모로 찾아간다
		System.out.println("자식 test 메소드");
	}
	public void display() {
		this.test();
		super.test();//부모, this는 자기자신
	}
}
public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 tc = new TestClass06();
		tc.display();
	}
	

}
