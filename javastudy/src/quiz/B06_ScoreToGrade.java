package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	
		/*
		 점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요.
		 
		 90점 이상 : A 등급
		 80점 이상 : B 등급
		 70점 이상 : C 등급
		 60점 이상 : D 등급
		 그 외 : F 등급
		 
		 *유효한 점수는 0 ~ 100점 입니다.
		 */
	public static void main(String[] args) {

		System.out.print("점수 >> ");
		int score = new Scanner(System.in).nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("점수가 이상합니다");
		} else {	
			char grade = 'F';
					
			if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} 	
					System.out.printf("당신은 점수 %d점으로 [ %c ] 입니다.\n", score, grade);
			}
	}
}
		
		/* 내가 한 것
		int score;
		char A_Grade = 'A';
		char B_Grade = 'B';
		char C_Grade = 'C';
		char D_Grade = 'D';
		

		System.out.print(" 점수를 입력하세요. (점수에 따른 등급 전환) > ");
		score = sc.nextInt();
		
		if (score < 60) {
			System.out.println("F");
		} else if (score >= 90) {
			System.out.println( A_Grade );
		} else if (score >= 80 && score <= 89) {
			System.out.println( B_Grade );
		} else if (score >= 70 && score <= 79) {
			System.out.println( C_Grade );
		} else if (score >= 60 && score <= 69) {
			System.out.println( D_Grade );
		} else (score < 0 || score > 100) {
				System.out.println("점수가 이상합니다.");
	}
}

		*/
		
