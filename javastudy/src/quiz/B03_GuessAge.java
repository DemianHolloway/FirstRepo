package quiz;


import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		// ����ڷκ��� �¾�ؿ� ������ �⵵�� �Է¹�����
		// �� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷���
		// ��������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �¾ �ظ� �������ּ��� > ");
		int a = sc.nextInt();
		
		System.out.println("������� �¾ �ش�" + a + "�Դϴ�.\n\n������ �⵵�� �������ּ��� >");
		int b = sc.nextInt();

		System.out.println("������� �ѱ� ���̴� " + ( b - a ) +"�Դϴ�.");

	}

}
