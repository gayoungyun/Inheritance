package inheritance;
class Test10{
	protected int num = 1000;//상속받은 자식한테는 허용하고 외부의 접근은 막겠다, public private중간정도
}
class TestClass10 extends Test10{
	public int num= 12345;
	public void test() {
		System.out.println("num : "+num);
		System.out.println("this num : "+this.num);
		System.out.println("super num : "+super.num);
	}
}
public class MainClass10 {
	public static void main(String[] args) {
		TestClass10 tc = new TestClass10();
		tc.test();
	}

}
