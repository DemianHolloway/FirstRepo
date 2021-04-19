package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
		/*
		 	사용자로부터 단어를 하나 입력받고
		 	첫 번재 글자와 마지막 번째 글자가 일치하면 "OK"를 출력
		 	아니라면 "NOT OK"출력
		 */
		
		// next() : 다음 단어를 String타입으로 받아오기 (공백, \t 기준)
		// nextLine() : 다음 한 줄을 String타입으로 받아오기 (\n 기준)
		
		Scanner sc = new Scanner(System.in);
		
		String user_input;
		
		System.out.print("단어를 입력하세요 >> ");
		user_input = sc.next();
		char lastChar = user_input.charAt(user_input.length() - 1);
		
		if ((user_input.charAt(0)) == (lastChar)) {
			System.out.println("OK");
		} else if ((user_input.charAt(0)) != (lastChar)) {
			System.out.println("NOT OK");
		}	
		
	}

}
/*
 쌤이 한 것을 비교해보자...
System.out.print("단어를 입력하세요 >> ");
user_input = sc.next();
char lastChar = user_input.charAt(user_input.length() - 1);

if ((user_input.charAt(0)) == (lastChar)) {
	System.out.println("OK");
} else if ((user_input.charAt(0)) != (lastChar)) {
	System.out.println("NOT OK");
*/
