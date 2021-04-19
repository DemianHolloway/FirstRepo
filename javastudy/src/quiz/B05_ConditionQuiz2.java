package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		/*
        [ 알맞은 조건식을 만들어보세요 ]

        1. char형 변수 a가 'q'또는 'Q'일 때 true
        2. char형 변수 b가 공백이나 탭이 아닐 때 true
        3. char형 변수 c가 문자('0' ~ '9')일 때 true
        4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
        5. char형 변수 e가 한글일 때 true
        6. char형 변수 f가 일본어일 때 true        
		*/
	Scanner sc = new Scanner(System.in);	
		
		char a = 'q';
		System.out.println("1." + (a == 'q'||a == 'Q'));
		
		char b = 1;
		System.out.println("2. " + (b != ' ' ||b != '\t'));
		
		char c = 5;
		System.out.println("3. " + (c >= '0' || c <= '9'));

		char d = ' ';
		System.out.println("4. 알파벳인가?"
					+ ((d >= 'a' && d <= 'Z') || (d >= 'a' && d <= 'Z')));


		char e = '영';
		System.out.println(e >= 0xAC00 && e <= 0xD7A3);
		
		
		char f = 'ほ';
		System.out.println((f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF));
		

		String user_input;
		
		System.out.print("아무 단어나 입력해보세요 > ");
		user_input = sc.next();
		
		System.out.println(user_input.equals("exit"));
		

		// Q. 유니코드..? 아스키 코드...? 를 사용해야 한다는데....어떻게 사용해야하는거지..?
		
		
	}

}
