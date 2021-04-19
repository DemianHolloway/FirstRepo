
public class B07_charAt {

	public static void main(String[] args) {
		/*
			"문자열". charAt(index);
			- 해당 문자열에 원하는 문자를 char타입으로 꺼내는 함수
			
			"문자열". length();
			-함수를 실행하면 해당 문자열의 길이를 (int)타입으로 알려준다
			-
		 */
		
		System.out.println("Hellow, everyone!!!");
		
		// 첫번째의 문자는 0, 두번째의 문자는 1이다!!!
		System.out.println("Hellow, everyone!!!".charAt(0));
		System.out.println("Hellow, everyone!!!".charAt(1));
		System.out.println("Hellow, everyone!!!".charAt(12));
		
		
		String str = "Hellow, everyone!!";
		
		System.out.println(str.charAt(7));
		System.out.println("str은 몇 글자짜리 문자열인가요?" + str.length());
		System.out.println(str.charAt(18));
		
	}

}
