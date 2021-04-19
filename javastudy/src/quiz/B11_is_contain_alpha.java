package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {

	public static void main(String[] args) {
		/*
		 	사용자가 입력한 문자열에
		 	알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력
		 */
		
		String word = "I have a dream";
		String word2 = "나는 꿈이 있어요";
		
		// word = word2;
		
		boolean contain_alphabet = false;
		
		//반복문을 이용해 문자열을 한 글자씩 분해하여 검사한다
		for (int index = 0; index < word.length(); ++index) {
			
			char ch = word2.charAt(index);
					
					if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
						// 하나씩 분리한 문자 ch가 알파벳인 경우 도착하는 곳
						contain_alphabet = true;
			}
		}
	}
}
			/*
		 내가 한 것
		
		Scanner sc = new Scanner(System.in);
		
		char alpha;
		
		System.out.print(" 문자를 입력하세요. >> ");
	
		String user_input;
		
		user_input = sc.next();
		
		char alpha = user_input
		
		for (int i = 0; i < alpha.charAt(alpha.i); i++) {

	
			if ( alpha >= 0x61 && alpha <= 0x7A) {
				System.out.println("true");
				
			} else if (alpha >= 0x41 || alpha <= 0x5A) {
			
				System.out.println("true");
			
			} else if (!(alpha >= 0x41 && alpha <= 0x5A)) {
				System.out.println("false");
				
		 */