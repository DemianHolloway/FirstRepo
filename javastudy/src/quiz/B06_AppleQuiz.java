package quiz;


import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		/*
		 ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
		 
		 ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
		 ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
		 */
		
		Scanner sc = new Scanner(System.in);
		int apple;
		int size = 10;
		
		System.out.print("�����ϰ� ���� ����� ����) > ");
		apple = sc.nextInt();
		
		// if (apple <0) {
		//	   System.out.println("�߸��� ��� �����Դϴ�.");
		// }else{
		// System.out.println("�ʿ��� �ٱ����� ���� : " +
		// 					   (int)Math.ceil(apple / (double)size));
		// }
		if (apple <0) {
			System.out.println("�߸��� ��� �����Դϴ�.");
		} else if (apple % size != 0) {
			System.out.println("�ʿ��� �ٱ����� ���� : " + (apple / size +1));
		} else {
			System.out.println("�ʿ��� �ٱ����� ���� : : + apple / size ");
		}
		
		/*
		 ���� �� ��...
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ������ �Է��ϼ���! (10�� �� : 1 �ٱ���) > ");
	
		int appleCount = sc.nextInt();
		double appleCase = appleCount * 0.1;

		System.out.printf("���� ����� ���� : %d / �ٱ��� + " + Math.round(appleCase)+ "�Դϴ�.");
 		���� �� ��...2
		if (appleCount > '1') {
			System.out.printf("���� ����� ���� :" + "%d" + "/ �ٱ��� : " appleCase "�Դϴ�." );
		} else (appleCount <= '0') {
			System.out.printf("0 ���ϴ� �ȵ˴ϴ�! ����� ����ּ���Ф�");
		}
*/
		
	}

}
