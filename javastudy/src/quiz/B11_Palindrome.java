package quiz;

import java.util.Scanner;


public class B11_Palindrome {

	public static void main(String[] args) {
		/*
		 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
		 	�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		 	ȸ���� �ƴ϶�� "NOT PALINDROME"
		 	* ȸ�� ? MOM, BOB, ABBA, MADAM ó�� �¿� ��Ī�� �ܾ�
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ܾ� >> ");
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
//			System.out.println("�̹��� �˻��� ����: " + ch);
//			System.out.println("���ϰ� �Ǵ� ����: " + ch2);
			
		}
		
		System.out.printf("[%s]�� ����� %s�Դϴ�.\n", word, result);
	}
}
		
		
		
		
		/*
		 
		���� �� ��...
		
		Scanner scnr = new Scanner(System.in);

		String text = sc.next();
		

		int pal_str = 0;
		
		
		for (int i = 0; i < (int)text.length() / 2; i++) {
			
		
			// i++ �� i-- �϶��� �����ϸ�....���� �ʳ�..?
			
		if (text ==  && text == ) {
			pal_str = 0;
			break; 
			
			}
		}
		System.out.println("pal_str: " + (pal_str = 0 ? "PALINDROME" : "NOT PALINDROME"));
	}
}
*/