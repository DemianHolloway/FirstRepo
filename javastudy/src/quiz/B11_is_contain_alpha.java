package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {

	public static void main(String[] args) {
		/*
		 	����ڰ� �Է��� ���ڿ���
		 	���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
		 */
		
		String word = "I have a dream";
		String word2 = "���� ���� �־��";
		
		// word = word2;
		
		boolean contain_alphabet = false;
		
		//�ݺ����� �̿��� ���ڿ��� �� ���ھ� �����Ͽ� �˻��Ѵ�
		for (int index = 0; index < word.length(); ++index) {
			
			char ch = word2.charAt(index);
					
					if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
						// �ϳ��� �и��� ���� ch�� ���ĺ��� ��� �����ϴ� ��
						contain_alphabet = true;
			}
		}
	}
}
			/*
		 ���� �� ��
		
		Scanner sc = new Scanner(System.in);
		
		char alpha;
		
		System.out.print(" ���ڸ� �Է��ϼ���. >> ");
	
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