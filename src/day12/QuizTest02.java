package day12;

import java.util.Scanner;

public class QuizTest02 {
	private int kor,eng,math,sum;
	private double avg;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		setKor(scan.nextInt());
		System.out.print("���� ���� �Է� : ");
		setEng(scan.nextInt());
		System.out.print("���� ���� �Է� : ");
		setMath(scan.nextInt());
		
	}
	
	public void op() {
		setSum(kor+eng+math);
		setAvg(sum/3.0);
	}
	public void print() {
		op();
		System.out.println("���� ���� : "+getKor());
		System.out.println("���� ���� : "+getEng());
		System.out.println("���� ���� : "+getMath());
		System.out.println("�� ���� : "+getSum());
		System.out.println("��� ���� : "+getAvg());
	}
}
