package day12;

public class TestClass01 {
	private String str="�ν��Ͻ�";
	
	
	public void setStr() {
		String str;
		str="���ڿ�";
		System.out.println(this.str);
	}
	
	
	public void func() {
		System.out.println("func ����");
		System.out.println(this);
		this.func02();
	}
	public void func02() {
		System.out.println("func02 ����");
	}
	public void func03() {
		System.out.println(str);
	}
	public void func04() {
		this.str="�ݰ����ϴ�";
		func03();
	}
	
}
