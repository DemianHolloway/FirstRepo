package myobj.school;

import java.util.Random;

public class Student2 {

	private String name;
	private int math;
	private int kor;
	private int eng;
	
	private static Random ran = new Random();
	private static int sno = 0;
	
	public static int BEST_TOTAL = 0;
	
	private static int getRandomScore() {
		return ran.nextInt(101);
	}
	
	public Student2() {
	math = getRandomScore();
	kor = getRandomScore();
	eng = getRandomScore();
	name = String.format("?л?%06d", sno++);
	BEST_TOTAL = (int)Math.max(getTotal(),  BEST_TOTAL);
	
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public int getAvg() {
		return getTotal() / 3.0;
	}

	public String getTranscript() {
		/*
System.out.printf("???? %d, 10");
		*/
		return String.format("%s / %3d / %.2f",
				name, getTotal(), getAvg());
		//return String.format("");
	}
}
