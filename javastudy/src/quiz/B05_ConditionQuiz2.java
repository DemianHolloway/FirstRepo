package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		/*
        [ �˸��� ���ǽ��� �������� ]

        1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
        2. char�� ���� b�� �����̳� ���� �ƴ� �� true
        3. char�� ���� c�� ����('0' ~ '9')�� �� true
        4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
        5. char�� ���� e�� �ѱ��� �� true
        6. char�� ���� f�� �Ϻ����� �� true        
		*/
	Scanner sc = new Scanner(System.in);	
		
		char a = 'q';
		System.out.println("1." + (a == 'q'||a == 'Q'));
		
		char b = 1;
		System.out.println("2. " + (b != ' ' ||b != '\t'));
		
		char c = 5;
		System.out.println("3. " + (c >= '0' || c <= '9'));

		char d = ' ';
		System.out.println("4. ���ĺ��ΰ�?"
					+ ((d >= 'a' && d <= 'Z') || (d >= 'a' && d <= 'Z')));


		char e = '��';
		System.out.println(e >= 0xAC00 && e <= 0xD7A3);
		
		
		char f = '��';
		System.out.println((f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF));
		

		String user_input;
		
		System.out.print("�ƹ� �ܾ �Է��غ����� > ");
		user_input = sc.next();
		
		System.out.println(user_input.equals("exit"));
		

		// Q. �����ڵ�..? �ƽ�Ű �ڵ�...? �� ����ؾ� �Ѵٴµ�....��� ����ؾ��ϴ°���..?
		
		
	}

}
