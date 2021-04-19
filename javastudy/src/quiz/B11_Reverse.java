package quiz;

import java.util.Scanner;

public class B11_Reverse {

	public static void main(String[] args) {
		/*
		 	사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
		 */
		
		String sentence = "I am iron man";
		
		for (int i = sentence.length() - 1;i >= 0; --i) {
			
			System.out.println(sentence.charAt(i));
		}
		
		
		/*
		 내가 한 것
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장 >> ");
		String str = sc.next();
		
		for (int i = str.length()-1; i>=0; i--){
	         System.out.print(str.charAt(i));
	         
		}
		 */
	}
	
}
