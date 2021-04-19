import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {

	/*
	 	# 정규표현식 (Regular Expression)
	 	
	 	- 문자열의 패턴을 표현하는 표현식
	 	- 특정 프로그래밍 언어에 종속되지 않는다
	 	 - 프로그래머가 원하는 문자열 패턴과 일치하는지 검사할 때 사용한다
	 	 
	 	 # Pattern 클래스
	 	 
	 	 - 정규표현식을 다루는 클래스
	 	 
	 	 # Match 클래스
	 	 
	 	 - 패턴 인터페이스를 이용하여 문자열을 검사할 때 사용하는 클래스
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regec, input) : input이 regex에 매치되는 문자열인지를 검사해주는 메서드
		System.out.println(Pattern.matches("sleep","sleEp"));

		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의하는 표현식
		System.out.println(Pattern.matches("s[lh@]eep","sleep"));
		System.out.println(Pattern.matches("s[lh@]eep","sheep"));
		System.out.println(Pattern.matches("s[lh@]eep","s@eep"));

		/*
		 	[] 내부에 정의할 수 있는 것들
		 	
		 	1. abc : 해당 자리에 a 또는 b 또는 c를 허용
		 	2. ^abc : 해당 자리에 abc를 제외한 모든것을 하용
		 	3. a-z : a부터 z까지 모두 허용
		 	4. && : 교집합
		 */
		System.out.println(Pattern.matches("s[^lh@]eep","s\\eep"));
		System.out.println(Pattern.matches("s[0-9a-z]eep","s0eep"));
		System.out.println(Pattern.matches("s[0-9]eep","s0eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep","sceep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep","sfeep"));

		/*
		 	여러 문자를 나타내는 것들
		 	
		 	1.  . : 모든 문자
		 	2. \d : 모든 숫자
		 	3. \D : 숫자를 제외한 모든 것
		 	4. \s : 모든 공백 (\t\n .. 등의 모든 공백)
		 	5. \S : 공백을 제외한 모든 것
		 	6. \w : 일반적인 문자들을 허용 [a-zA-Z0-9]
		 	7. \W : 일반적인 문자들을 제외한 모든것을 허용
		 */
		System.out.println("문자==========");
		System.out.println(Pattern.matches("s.eep","sheep")); //모든 문자
		System.out.println(Pattern.matches("s[.]eep","sheep")); // .만 허용
		System.out.println(Pattern.matches("s\\.eep","sheep")); // .만 허용

		System.out.println("숫자==========");
		System.out.println(Pattern.matches("s\\deep","s9eep")); // 숫자만 허용
		System.out.println(Pattern.matches("\\D\\D\\D", "cat")); // 숫자 제외 허용

		System.out.println("공백==========");
		System.out.println(Pattern.matches("s\\seep","s eep"));
		System.out.println(Pattern.matches("s\\seep","saeep"));
		System.out.println(Pattern.matches("s\\seep","s\teep"));
		System.out.println(Pattern.matches("s\\seep","s\neep"));
		System.out.println(Pattern.matches("s\\seep","s\reep"));
		
		System.out.println(Pattern.matches("s\\Seep","s eep"));
		
		System.out.println(Pattern.matches("s\\Seep","s eep"));
		
		/*
		 	해당 패턴이 적용될 문자의 개수를 정의하는 방법
		 	
		 	1. [ex]{n} : {}앞의 패턴이 n개 일치해야 한다
		 	2. [ex]{n,m} : {}앞의 패턴이 최소 n개 이상, 최대 m개(m포함) 일치해야 한다
		 		* 정규표현식에 {n,m}처럼 공백을 넣으면 안된다
		 	3. [ex]{n,} : {} 앞의 패턴이 최소 n개 이상 일치해야 한다
		 	4. [ex]? : 0번 또는 한번
		 	5. [ex]+ : 최소 한번 이상
		 	6. [ex]* : 0번 또는 여러번	
		 */
		
		System.out.println(Pattern.matches("[\\D3-5]{3}\\.txt","345!!.txt"));
		System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt","3!.txt"));
		System.out.println(Pattern.matches("[가-힣]{2,}\\.txt","안녕.txt"));
		System.out.println(Pattern.matches("[가-힣]{2,}\\.txt","안녕하세요.txt"));
		System.out.println(Pattern.matches("[가-힣]{2,}\\.txt","hi.txt"));

		String regex1 = String.format(".{%d,}\\.txt", 2);
		System.out.println(Pattern.matches(regex1,"abcd.txt"));

		System.out.println(Pattern.matches("[가-힣]{2,}?\\.txt",".txt"));
		System.out.println(Pattern.matches("[가-힣]{2,}?\\.txt","한.txt"));
		System.out.println(Pattern.matches("[가-힣]{2,}?\\.txt","한글.txt"));

		// 전화번호 정규표현식
		System.out.println(Pattern.matches("\\d{3}-?\\{3,4}-?\\d{4}","01012341234"));
		System.out.println(Pattern.matches("\\d{3}-?\\{3,4}-?\\d{4}","0101234123"));
		System.out.println(Pattern.matches("\\d{3}-?\\{3,4}-?\\d{4}","010-1234-1234"));
		System.out.println(Pattern.matches("\\d{3}-?\\{3,4}-?\\d{4}","010-123-1234"));

		// 연습문제 : 자바에서 허용하는 변수명을 검사할 수 있는 정규표현식을 만들어보세요
		
		System.out.println(Pattern.matches("^[a-zA-Z_$][\\*$]*$","abc"));
		System.out.println(Pattern.matches("^[\\D&&\\S$$\\w$가-힣][\\w$가-힣]*$","_김김김"));
		
		/*
		 	# Pattern.compile (regex)
		 	
		 	- 전달한 정규표현식을 해석하여 Pattern 인스턴스를 생성하고 반환한다
		 	- Pattern타입 인스턴스를 요구하는 곳에 사용할 수 있다
		 	
		 	# split() : 컴파일된 패턴 인스턴스로 slit()을 진행한다
		 	
		 	# matcher() : Matcher 인스턴스를 생성하여 반환한다
		 */
		String fruit_text = "apple/banana/orange/grape/peach/mango/redapple";
		
		Pattern regex = Pattern.compile("/");
		String[] fruits = regex.split(fruit_text);
		
		System.out.println(Arrays.toString(fruits));

		
		Pattern regex2 = Pattern.compile("[a-zA-Z]+");

		Matcher matcher = regex2.matcher(fruit_text);
		
		while (matcher.find()) {
			System.out.println("찾은 것: " + matcher.group());
			System.out.println("위치: " + matcher.start() + "부터 " + matcher.end() + "까지");
			
		}
	}
}
