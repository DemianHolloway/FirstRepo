package quiz;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C13_InputRightThing {

	
	/*
	  ����ڷκ��� ���ڸ� ����� �Է¹��������� ��� �Է¹޴� ���α׷��� ��������
	  (�߸��� ���� �ԵǾ �������� ���� �ʰ�, �ùٸ� ���� �ԷµǸ� ��� �� ���α׷��� ����)
	 
	 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
//		while (true) {
//			try {
//				System.out.print("�ݵ�� ���ڸ� �Է����ּ���!");
//				int num = sc.nextInt();
//				System.out.println("�Է��Ͻ� ����" + num +"�Դϴ�.");
//				break;
//			} catch (InputMismatchException e) { //��ǲ ��¼��� Ŭ���� 'e'���� ������
//				System.out.println("�߸��� �Է��Դϴ�. ���ڸ� �Է��ϼ���");
//				String stuck = sc.nextLine();
//				System.out.println("�ɷ��ִ��� ��:" + stuck);
//			}
//		}
		
//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
//	}
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {	
		int a = inputInt("���� > ");
		int b = inputInt("�� ��° ���� > ");
		
	System.out.println("input �Լ��� �Է¹��� ��: " + a);
	System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
	}
	
	public static int inputInt(String message) {
		int num;
		
		while (true) {
			try {
				System.out.println(message);
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
	
		// sc.close(); // �� �̻� ���� ���� ��ĳ�ʸ� ���� (System.in)�� 
		
		sc.close();
		return num;
	}
}
