package day12;


class AAA{
	private String version;
	public AAA(){
		System.out.println("持失切 叔楳");
	}
	
	public AAA(String v) {
		System.out.println(v+" : v持失切");
		version = v;
	}
}


public class MainClass04 {

	public static void main(String[] args) {
		AAA a = new AAA("10");
		AAA b = new AAA();

		

	}

}
