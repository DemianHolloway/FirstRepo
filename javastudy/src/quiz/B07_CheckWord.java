package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
		/*
		 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
		 	ù ���� ���ڿ� ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ���
		 	�ƴ϶�� "NOT OK"���
		 */
		
		// next() : ���� �ܾ StringŸ������ �޾ƿ��� (����, \t ����)
		// nextLine() : ���� �� ���� StringŸ������ �޾ƿ��� (\n ����)
		
		Scanner sc = new Scanner(System.in);
		
		String user_input;
		
		System.out.print("�ܾ �Է��ϼ��� >> ");
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
 ���� �� ���� ���غ���...
System.out.print("�ܾ �Է��ϼ��� >> ");
user_input = sc.next();
char lastChar = user_input.charAt(user_input.length() - 1);

if ((user_input.charAt(0)) == (lastChar)) {
	System.out.println("OK");
} else if ((user_input.charAt(0)) != (lastChar)) {
	System.out.println("NOT OK");
*/
