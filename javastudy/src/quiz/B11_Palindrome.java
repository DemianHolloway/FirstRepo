package quiz;

import java.util.Scanner;


public class B11_Palindrome {

	public static void main(String[] args) {
		/*
		 	사용자로부터 단어를 하나 입력받고
		 	해당 단어가 회문이라면 "PALINDROME"을 출력
		 	회문이 아니라면 "NOT PALINDROME"
		 	* 회문 ? MOM, BOB, ABBA, MADAM 처럼 좌우 대칭인 단어
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어 >> ");
		String word = sc.next();
		
		String result = "PALINDROME";
		for (int i = 0; i < word.length() / 2; ++i) {
			
			char ch = word.charAt(i);
			char ch2 = word.charAt(word.length() -i -1);
			
			if (ch != ch2) {
				result = "NOT PALINDROME";
				break;
			}
			
//			System.out.println("--------------------");
//			System.out.println("이번엔 검사할 문자: " + ch);
//			System.out.println("비교하게 되는 문자: " + ch2);
			
		}
		
		System.out.printf("[%s]의 결과는 %s입니다.\n", word, result);
	}
}
		
		
		
		
		/*
		 
		내가 한 것...
		
		Scanner scnr = new Scanner(System.in);

		String text = sc.next();
		

		int pal_str = 0;
		
		
		for (int i = 0; i < (int)text.length() / 2; i++) {
			
		
			// i++ 이 i-- 일때랑 동일하면....되지 않나..?
			
		if (text ==  && text == ) {
			pal_str = 0;
			break; 
			
			}
		}
		System.out.println("pal_str: " + (pal_str = 0 ? "PALINDROME" : "NOT PALINDROME"));
	}
}
*/