package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	
		/*
		 ������ �Է¹����� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.
		 
		 90�� �̻� : A ���
		 80�� �̻� : B ���
		 70�� �̻� : C ���
		 60�� �̻� : D ���
		 �� �� : F ���
		 
		 *��ȿ�� ������ 0 ~ 100�� �Դϴ�.
		 */
	public static void main(String[] args) {

		System.out.print("���� >> ");
		int score = new Scanner(System.in).nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("������ �̻��մϴ�");
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
					System.out.printf("����� ���� %d������ [ %c ] �Դϴ�.\n", score, grade);
			}
	}
}
		
		/* ���� �� ��
		int score;
		char A_Grade = 'A';
		char B_Grade = 'B';
		char C_Grade = 'C';
		char D_Grade = 'D';
		

		System.out.print(" ������ �Է��ϼ���. (������ ���� ��� ��ȯ) > ");
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
				System.out.println("������ �̻��մϴ�.");
	}
}

		*/
		
