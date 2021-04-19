package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDay {

	/*
	 	� ī�信�� ¦����° ����ϸ��� ������縦 �����Ѵٰ� ���� �� ��
	 	
	 	�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ����غ�����
	 */
	public static void main(String[] args) {
	
	int year = 2020;
	
	printAllEventDays(year);
	
	}
	
	// * Callendar Ŭ������ � �ʵ带 �����ϸ� ������ �ʵ嵵 ��Ȳ�� �°� �˾Ƽ� ������Ʈ �ȴ�
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy/mm/dd\t[%d��° ���]\n");
		Calendar event = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		event.set(year, 0, 1, 0, 0, 0);
		
		// for (int i = 0; i < 12; ++i) {
		int count = 1;
		while (event.get(Calendar.YEAR) == year){
			// event.set(Calendar.MONTH, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY); // ����Ϸ� �ٲٰ�
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2); // �̹��� �ι�° ���Ϸ� ����
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
//			event.get(Calendar.YEAR),
//			event.get(Calendar.MONTH) + 1,
//			event.get(Calendar.DATE));

			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4); // �̹��� �� ��° ���Ϸ� ����
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
//					event.get(Calendar.YEAR),
//					event.get(Calendar.MONTH) + 1,
//					event.get(Calendar.DATE));
	
			// add() : ���ϴ� �ʵ带 ���ϴ� ��ġ��ŭ ���ϰų� �� �� �ִ�
			event.add(Calendar.MONTH, 1);
		}
	}
}