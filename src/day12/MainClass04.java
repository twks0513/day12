package day12;


class AAA{
	private String version;
	public AAA(){
		System.out.println("������ ����");
	}
	
	public AAA(String v) {
		System.out.println(v+" : v������");
		version = v;
	}
}


public class MainClass04 {

	public static void main(String[] args) {
		AAA a = new AAA("10");
		AAA b = new AAA();

		

	}

}
