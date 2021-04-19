
public class A05_Print {

	public static void main(String[] args) {
		/*
		 	#�ֿܼ� ����ϱ� ���� �������� �Լ���
		 	
		 	1. print()
		 		- ���� �ڵ����� �ٲ��� �ʴ� ���� �⺻ ���
		 		
		 	2. println()
		 		- ���� �ڵ����� �ٲ��ָ� ����ϴ� �Լ�
		 		- ()�� ������ ������ �� �ڿ� '\n'�� �߰��Ͽ� ����Ѵ�
		 		- ()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�
		 */
		
		System.out.print("Hello");
		System.out.print("Hello");
		System.out.print("Hello");
		System.out.println();
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		/*
		 	3. printf()
		 		- ���� ���ڸ� �̿��� �� �ִ� ��� �Լ�
		 		- ����� ���¸� �̸� �����, ���� ���� �ڸ��� ���� ä���� ����Ѵ�
		 		- ���ڿ��� +�� �̾���̴� �� ���� ������ ����ϴ� ��찡 ���� ���� �ִ�
		 		- ���� �ڵ����� �ٲ����� �ʴ´�
		 		
		 */
		
		int year = 2021, month = 3, day = 17, hour = 11, minute = 9, second = 38, millisec = 1234;
		
		System.out.println(year + "��" + month + "��" + day + "�� / "
				+ hour + ":" + minute + ":" + second + "." + millisec);
		
		System.out.printf("%d�� %d�� %d�� / %d:%d:%d.%d\n",
				year, month, day, hour, minute, second, millisec);


		/*
		 	# ���� ������ ����
		 	
		 		%d		: �ش� �ڸ��� ������ ������ 10������ ������ش�
		 		%x,%x	: �ش� �ڸ��� ������ ������ 16������ ������ش� (%X�� �빮��)
		 		%o		: �ش� �ڸ��� ������ ������ 8������ ������ش�
		 		
		 	# 10������ ���ڵ�
		 	0 1 2 3 4 5 6 7 8 9 10
		 	
		 	# 8������ ���ڵ�
		 	0 1 2 3 4 5 6 7 10
		 	
		 	# 16������ ���ڵ�
		 	0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 . . . 19 1A 1B 1C 1D 1E 1F 20
		 	
		 */
		int testNum = 25;
		
		System.out.printf("8������ 15�� %o�Դϴ�.\n", 15);
		System.out.printf("10������ 15�� %d�Դϴ�.\n", 15);
		System.out.printf("16������ 15�� %x�Դϴ�.\n", 15);
		System.out.printf("16������ 15�� %X�Դϴ�.\n", 15);
		
		System.out.printf("8������ %d��(��) %o�Դϴ�.\n", testNum, testNum);
		System.out.printf("10������ %d��(��) %d�Դϴ�.\n", testNum, testNum);
		System.out.printf("16������ %d��(��) %x�Դϴ�.\n", testNum, testNum);
		System.out.printf("16������ %d��(��) %X�Դϴ�.\n", testNum, testNum);
		

		 // #���� ���� �ɼǵ�
		 //  �� ���� ���� �ڸ��� d�� �־�� �ϴ� ���� �ƴ�
		  
		 //  1) %����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�
		 System.out.printf("��� : %d��\n", 10);
		 System.out.printf("��� : %10d��\n", 10);
		 System.out.printf("��� : %20d��\n", 10);
		 
		 System.out.printf("[[ %s ]]\n", "Hello, world!");
		 System.out.printf("[[ %25s ]]\n", "Hello, world!");
		 System.out.printf("[[ %50s ]]\n", "Hello, world!");

		 //  2) %-����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ���� �����Ͽ� ����Ѵ�
		 System.out.printf("��� : %d��\n", 10);
		 System.out.printf("��� : %10d��\n", 10);
		 System.out.printf("��� : %20d��\n", 10);
		 
		 System.out.printf("%s : 10��\n", "���");
		 System.out.printf("%-7s : 10��\n", "��");
		 System.out.printf("%-10s : 10��\n", "�ٳ���");
		 
		 // 3) %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0�� ä���� ����Ѵ�
		 System.out.printf("%d��\n", 5);
		 System.out.printf("%02d��\n", 5);
		 System.out.printf("%03d��\n", 5);
		 System.out.printf("%020f\n", 3.141234);
		
		 // 4) %+����d : ��� �տ��� ��ȣ�� �ٿ��ش�
		 System.out.printf("��� : %d , ���� : %d\n", 5, -5);
		 System.out.printf("��� : %+d , ���� : %+d\n", 5, -5);
		 
		 // %.����f : �Ҽ� �ڸ����� �����Ѵ�
		 double avg = 123.125555;
		 System.out.printf("������� : %.4f\n", avg);
		 System.out.printf("������� : %.2f\n", avg);
		 
	}

}
