package day12;

import java.util.Scanner;

public class QuizTest01 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		setName(scan.next());
		System.out.print("나이 입력 : ");
		setAge(scan.nextInt());
	}
	public void op() {
		age-=1;		
	}
	public void print() {
		op();
		System.out.println("이름 : "+getName());
		System.out.println("나이 : "+getAge());
	}
	
}
