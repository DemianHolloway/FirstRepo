package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {
		/*
		 	�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
		 	
		 	*�ʿ���� ������ ������� �� ��\
		 	ex: 0�� 0�� 5�ð� 0�� 20���� ��� = 0�� 0���� ������ �ʾƾ� ��
		 */
	
		
		System.out.println("�� > ");
		int second = new Scanner(System.in).nextInt();
		
		
		// 90000000000��
		
		// 1�� : 60 * 60 * 24 * 365 ��
		// 1�� : 60 * 60 * 24��
		// 1�ð� : 60 * 60��
		// �� : 60��
		
		final int SECOND_PER_YEAR= 3153600;
		final int SECOND_PER_DAY= 86400;
		final int SECOND_PER_HOUR= 3600;
		final int SECOND_PER_MINUTE= 60;
		
		//final int�� int���� �� ���� ����! �������� �ν� �ȴ�!
		
		int original = second;
		int y = 0, d = 0, h = 0, m = 0, s = 0;
		
		
		y = second / SECOND_PER_YEAR;
		second %= SECOND_PER_YEAR;
		
		d = second / SECOND_PER_DAY;
		second %= SECOND_PER_DAY;
		
		h = second / SECOND_PER_HOUR;
		second %= SECOND_PER_HOUR;
		
		m = second / SECOND_PER_MINUTE;
		second %= SECOND_PER_MINUTE;
		
		s = second;
		
//		System.out.printf("'%d'�ʴ� ��ȯ�ϸ� '%d�� %d�� %d�ð� %d�� %d��' �Դϴ�.\n"
//				, original, y, d, h, m, s);
		
		System.out.printf("'%d'�ʴ� ��ȯ�ϸ�", original);
		
		
		boolean exist = false;
		
		if (y != 0) {
			System.out.print(y + "�� ");
			exist = true;
		}
		if (exist || d != 0) {
			System.out.print(d + "�� ");
			exist = true;
		}
		if (exist || h != 0) {
			System.out.print(h + "�ð� ");
			exist = true;
		}
		if (exist || m != 0) {
			System.out.println(m + "�� ");
			exist = true;
		}
		System.out.println(s + "�� �Դϴ�.");
	
	}
	

}
		/*
		 ���� �Ѱ�...
		
	Scanner sc = new Scanner(System.in);	
	
	
	int year, month, day, hour , minute, second;

	System.out.print(" [  : ��]�� �Է��ϸ� �ð��� ��ȯ�մϴ�.>> (��/��/�ð�/��/��)");
	second = sc.nextInt();
	
	minute = second / 60;
	hour = second / 3600;
	second = second - (60*minute);
	
	day = hour / 60;
	month = day / 60;
	year = month / 60;
	minute = second / 60;
	
	
	if ( year > 0 && month > 0 && day > 0  && hour > 0 && minute > 0 && second > 0 ) {
		System.out.println("%d�� %d�� %d�� %d�� %d�� %d�� �Դϴ�.");
		
	}else if( year == 0 && month > 0 && day > 0  && hour > 0 && minute > 0 && second > 0 ) {
		System.out.println("%d�� %d�� %d�� %d�� %d�� �Դϴ�.");
		
	}else if( year == 0 && month == 0 && day > 0  && hour > 0 && minute > 0 && second > 0 ) {
			System.out.println("%d�� %d�� %d�� %d�� �Դϴ�.");
			
	} else if( year == 0 && month == 0 && day == 0  && hour > 0 && minute > 0 && second > 0 ) {
				System.out.println("%d�� %d�� %d�� �Դϴ�.");
				
	}else if( year == 0 && month == 0 && day == 0  && hour == 0 && minute > 0 && second > 0 ) {
					System.out.println("%d�� %d�� �Դϴ�.");
	}else if( year == 0 && month == 0 && day == 0  && hour == 0 && minute == 0 && second > 0 ) {
		System.out.println("%d�� �Դϴ�.");
	}else if( year == 0 && month == 0 && day == 0  && hour == 0 && minute == 0 && second == 0 ) {
		System.out.println("�ٽ� �Է��Ͻʽÿ�.");	
			
	}	
	 */
