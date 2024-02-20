package inheritance;
class A{
	public void a() {
		System.out.println("a 메소드 실행");
	}
}
class B extends A{
	public void b() {
		System.out.println("bbbb 메소드 실행");
	}
}
class C extends B{//클래스 여러개 상속x, 물림으로 상속(c는 다 사용가능)
	public void c() {
		System.out.println("ccccc 메소드 실행");
	}
}
public class MainClass11 {
	public static void main(String[] args) {
		 C c = new C();
		 c.c(); c.a(); c.b();
	}

}
