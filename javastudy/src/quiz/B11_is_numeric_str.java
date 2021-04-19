package quiz;


public class B11_is_numeric_str {

	public static void main(String[] args) {
		/*
		  입력받은 문자열에 숫자만 포함되어 있으면 result가 1
		  다른 문자가 포함되어 있다면 result가 0
		 */
		
		String word = "123456789";
		String word2 = "1234a56";
		
		int numeric_str = 0;
		
		for (int i = 0; i < word.length(); ++i) {
			
			char ch = word.charAt(i);
			
			// 
			if (ch < '0' || ch > '9') {
				numeric_str = 0;
				break; // 숫자가 아닌 다른 문자를 하나라고 찾으면 그만 찾음
			}
		}
		
		System.out.println("numeric_str: " + (numeric_str > 0 ? "true" : "false"));
		
		/*
		 내가 한 것
		Scanner sc = new Scanner(System.in);

		system.out.print(" 문자를 입력하세요. >> ");
		
		for (int i = 10; i >= 0; i--) {

			boolean text = 
					
			if (sc.nextInt(); = ) {
				continue;
			}
			System.out.println("false");
		*/
	}

}
