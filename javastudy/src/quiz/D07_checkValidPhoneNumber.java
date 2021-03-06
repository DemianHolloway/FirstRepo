package quiz;

import java.util.HashMap;
import java.util.Map.Entry;

public class D07_checkValidPhoneNumber {

	/*
		사용자로부터 핸드폰번호를 입력받으면
		올바른 전화번호인지 구분하는 프로그램을 만들어보세요
		
		앞의 3자리가 숫자
		두번째 숫자는 3자리 혹은 4자리
		세번째 숫자는 4자리
		4번째 또는 8번째 또는 9번째 문자는 - << '정규식' 이라고 부름!
	 */
	
	
	// *Q1.배열의 자릿수를 세어서 추가해야하나? (분명...엑셀 함수처럼 서식해줄 다른 메서드가 있을거 같은데...)
//	public void checkByPhoneNumber(String number_fragment) {
//		int count = 0;
//		System.out.println("- - 검색 결과 - -");
//		for (HashMap<String, String> group : phonebook.values()) {		
//			for (String phoneNumber : group.keySet()) {
//				if(phoneNumber.contains(number_fragment)) {
//					System.out.printf("%s : %s\n", group.get(phoneNumber),phoneNumber);
//					count++;
//			}
//		}
//	}
//	System.out.printf("검색 결과 : ");
//	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
		
	}

	public static boolean checkValidPhoneNumber(String phoneNumber) {
		int len = phoneNumber.length();
		
		if (len != 12 && len !=13) {
			System.out.println("[invalid] 길이가 올바르지 않음");
			return false;
		}		
		
		for (int i = 0; i < len; ++i) {
            
            char ch = phoneNumber.charAt(i);
            
            if (i < 3 && !checkNumeric(ch)) {
                    System.out.println("[invalid] 맨앞 3자리에 숫자 아닌것이 있음");
                    return false;
            } else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
                    System.out.println("[invalid] 하이픈 자리가 올바르지 않음");
                    return false;
            } else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
                System.out.println("[invalid] 가운데 자리에 숫자 아닌것이 있음");
                return false;
        } else if (((i > 7 && len == 12) || i > 8 && len == 13) && !checkNumeric(ch)) {
                return false;

		}
	}

	return true;
	}
	
	public static void main(String[] args) {
		
		if (checkValidPhoneNumber("123-123-1233")) {
			System.out.println("올바른 핸드폰 번호입니다!");
	
		}
	}
}