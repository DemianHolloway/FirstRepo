package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {
		/*
		 	초를 입력받으면 년/일/시간/분/초로 변환하여 출력해보세요
		 	
		 	*필요없는 단위는 출력하지 말 것\
		 	ex: 0년 0일 5시간 0분 20초인 경우 = 0년 0일은 나오지 않아야 함
		 */
	
		
		System.out.println("초 > ");
		int second = new Scanner(System.in).nextInt();
		
		
		// 90000000000초
		
		// 1년 : 60 * 60 * 24 * 365 초
		// 1일 : 60 * 60 * 24초
		// 1시간 : 60 * 60초
		// 분 : 60초
		
		final int SECOND_PER_YEAR= 3153600;
		final int SECOND_PER_DAY= 86400;
		final int SECOND_PER_HOUR= 3600;
		final int SECOND_PER_MINUTE= 60;
		
		//final int는 int보다 더 위의 변수! 최종적인 인식 된다!
		
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
		
//		System.out.printf("'%d'초는 변환하면 '%d년 %d일 %d시간 %d분 %d초' 입니다.\n"
//				, original, y, d, h, m, s);
		
		System.out.printf("'%d'초는 변환하면", original);
		
		
		boolean exist = false;
		
		if (y != 0) {
			System.out.print(y + "년 ");
			exist = true;
		}
		if (exist || d != 0) {
			System.out.print(d + "일 ");
			exist = true;
		}
		if (exist || h != 0) {
			System.out.print(h + "시간 ");
			exist = true;
		}
		if (exist || m != 0) {
			System.out.println(m + "분 ");
			exist = true;
		}
		System.out.println(s + "초 입니다.");
	
	}
	

}
		/*
		 내가 한것...
		
	Scanner sc = new Scanner(System.in);	
	
	
	int year, month, day, hour , minute, second;

	System.out.print(" [  : 초]를 입력하면 시간을 변환합니다.>> (년/일/시간/분/초)");
	second = sc.nextInt();
	
	minute = second / 60;
	hour = second / 3600;
	second = second - (60*minute);
	
	day = hour / 60;
	month = day / 60;
	year = month / 60;
	minute = second / 60;
	
	
	if ( year > 0 && month > 0 && day > 0  && hour > 0 && minute > 0 && second > 0 ) {
		System.out.println("%d년 %d월 %d일 %d시 %d분 %d초 입니다.");
		
	}else if( year == 0 && month > 0 && day > 0  && hour > 0 && minute > 0 && second > 0 ) {
		System.out.println("%d월 %d일 %d시 %d분 %d초 입니다.");
		
	}else if( year == 0 && month == 0 && day > 0  && hour > 0 && minute > 0 && second > 0 ) {
			System.out.println("%d일 %d시 %d분 %d초 입니다.");
			
	} else if( year == 0 && month == 0 && day == 0  && hour > 0 && minute > 0 && second > 0 ) {
				System.out.println("%d시 %d분 %d초 입니다.");
				
	}else if( year == 0 && month == 0 && day == 0  && hour == 0 && minute > 0 && second > 0 ) {
					System.out.println("%d분 %d초 입니다.");
	}else if( year == 0 && month == 0 && day == 0  && hour == 0 && minute == 0 && second > 0 ) {
		System.out.println("%d초 입니다.");
	}else if( year == 0 && month == 0 && day == 0  && hour == 0 && minute == 0 && second == 0 ) {
		System.out.println("다시 입력하십시오.");	
			
	}	
	 */
