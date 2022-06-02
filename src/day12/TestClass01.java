package day12;

public class TestClass01 {
	private String str="인스턴스";
	
	
	public void setStr() {
		String str;
		str="문자열";
		System.out.println(this.str);
	}
	
	
	public void func() {
		System.out.println("func 실행");
		System.out.println(this);
		this.func02();
	}
	public void func02() {
		System.out.println("func02 실행");
	}
	public void func03() {
		System.out.println(str);
	}
	public void func04() {
		this.str="반갑습니다";
		func03();
	}
	
}
