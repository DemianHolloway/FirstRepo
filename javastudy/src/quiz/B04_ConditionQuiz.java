package quiz;

public class B04_ConditionQuiz {

	public static void main(String[] args) {
		/*
        [ 알맞은 비교연산을 만들어보세요 ]
            
        1. int형 변수 a가 10보다 크고 20보다 작을 때 true
        2. int형 변수 b가 짝수일 때 true                
        3. int형 변수 c가 7의 배수일 때 true
        4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
        5. int형 변수 d와 e의 차이가 30일 때 true                
        6. int형 변수 year가 400으로 나누어 떨어지면 true  
           또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
        7. 민수가 철수보다 2살 많으면 true
        8. 민수가 철수보다 생일이 3달 빠르면 true  
        9. boolean형 변수 powerOn이 false일 때 true
        10. 문자열 참조변수 str이 "yes"일 때 true
*/        
		
		int a = 14;
		System.out.println("1." + (a >10 && a<20));
		
		int b = 8;
		System.out.println("2." + (b % 2 == 0));
		
		
		int c = 21;
		System.out.println("3." + (c % 7 == 0));
				
		int hour = 13;
		System.out.println("4." + (hour >= 12 && hour >= 24));
		
		int d = 85;
		int e = 19;
		System.out.println(Math.abs(d - e) == 30 );

		int year = 800;
		System.out.println((year % 400) == 0 || (year % 4 == 0 && year % 100 ==0));
		
		int Min = 18;
		int Ch = 16;
		System.out.println(Min > Ch && (Min -Ch)>=2);
	
		int minsuBirth = 8;
		int chBirth = 12;
		System.out.println(minsuBirth +3 == chBirth);
		
		boolean powerOn = false;
		System.out.println("9." + !powerOn);
		
		// *문자열(참조형 타입)은 ==으로 비교하면 안된다.
		// 참조형 타입의 값을 비교할 때는 해당 클래스에 정의되어 있는 equals()라는
		// 메서드를 이용해야 한다
		
		
		String str = "yes";
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		// # 기본형 타입과 참조형 타입의 차이점
		// - 기본형 타입은 내부 데이터의 크기를 예측하기 쉽다(차곡차곡 쌓이는 메모리 사용= 스택(Stack))
		// - 참조형 타입은 내부 데이터의 크기를 예측하기 어렵다(여기저기 막 쓰는 메모리 사용= 힙(Heap))
		
		String str1 = "yes";
		String str2 = new String("yes"); // str1과 다른 yes(다른 주소, 같은 내용)
		String str3 = "yes"; // str과 같은 yes(str의 주소가 같다, 같은 단어를 사용하는건 같은 주소, 즉 데이터를 공유함)
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1 ==str2 : " + (str1 ==str2));
		System.out.println("str1 ==str3 : " + (str1 ==str3));
		
	}

}
