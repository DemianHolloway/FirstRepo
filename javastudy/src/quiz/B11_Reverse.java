package quiz;

import java.util.Scanner;

public class B11_Reverse {

	public static void main(String[] args) {
		/*
		 	����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
		 */
		
		String sentence = "I am iron man";
		
		for (int i = sentence.length() - 1;i >= 0; --i) {
			
			System.out.println(sentence.charAt(i));
		}
		
		
		/*
		 ���� �� ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� >> ");
		String str = sc.next();
		
		for (int i = str.length()-1; i>=0; i--){
	         System.out.print(str.charAt(i));
	         
		}
		 */
	}
	
}
