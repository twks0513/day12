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
		System.out.print("국어 점수 입력 : ");
		setKor(scan.nextInt());
		System.out.print("영어 점수 입력 : ");
		setEng(scan.nextInt());
		System.out.print("수학 점수 입력 : ");
		setMath(scan.nextInt());
		
	}
	
	public void op() {
		setSum(kor+eng+math);
		setAvg(sum/3.0);
	}
	public void print() {
		op();
		System.out.println("국어 점수 : "+getKor());
		System.out.println("영어 점수 : "+getEng());
		System.out.println("수학 점수 : "+getMath());
		System.out.println("총 점수 : "+getSum());
		System.out.println("평균 점수 : "+getAvg());
	}
}
