package day12;

public class MainClass02 {

	public static void main(String[] args) {
		TestClass02 t2 = new TestClass02();
		//t2.str="¾È³çÇÏ¼¼¿ä";
		//System.out.println(t2.str);
		t2.setting("È«±æµ¿");
		String s = t2.getter();
		System.out.println(s);
	}

}
