package day12;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		TestClass03 t3 = new TestClass03();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		String name = scan.next();
		t3.setName(name);
		
		System.out.println("�̸� : "+t3.getName());

	}

}
