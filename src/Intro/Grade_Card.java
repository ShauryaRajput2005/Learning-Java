package Intro;

public class Grade_Card{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Report Card");
		int marks=69;
		if(marks>=75) {
			System.out.print("A");
		}
		else if(marks>=65 && marks<=75) {
			System.out.print("B");
		}
		else if(marks>=55 && marks<=65) {
			System.out.print("C");
		}
		else if(marks>=45 && marks<=55) {
			System.out.print("D");
		}
	}

}
