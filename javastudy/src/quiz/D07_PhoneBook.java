package quiz;

import java.util.TreeSet;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map.Entry;

public class D07_PhoneBook {


	public static class PhoneInfo {
		String name;
		String phone_Number;
		String address;
		String profile_image_path;
	}
	
	HashMap<String, HashMap<String, String>> phonebook;
	
	public D07_PhoneBook() {
		phonebook = new HashMap<>();
		
		phonebook.put("친구", new HashMap<>());
		phonebook.put("직장", new HashMap<>());
		phonebook.put("가족", new HashMap<>());
		phonebook.put("미분류", new HashMap<>());

		phonebook.get("가족").put("010-5487-5346","엄마");
	}

	/*
		# HashMap을 이용해 전화번호부를 구현해보세요
		
		1. 그룹 / 전화번호 / 이름을 저장해야 한다
		2. 그룹 이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다
		3. 전화번호 목록에 전화번호를 키값으로 넣으면 이름이 나온다 << 중복되지 않는 것을 키 값!
		
		# 구현해야 할 메서드
		
		1. 새로운 그룹을 추가하는 메서드
		2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드 (그룹이 없다면 미분류 그룹에 저장)
	 	3. 등록된 모든 전화번로를 이름기준 오름차순으로 보여주는 메서드
	 	4. 이름의 일부를 입력하면 일치하는 모든 정보다 출력되는 검색 메서드
	 	5. 전화번로의 일부릉 입력하면 일치하는 모든 전화번호가 출력되는 검색 메서드
	 */

	public boolean addGroup(String groupName) {
		if (phonebook.containsKey(groupName)) {
			System.out.println("이미 존재하는 그룹입니다. : " + groupName);

			return false;
		} else {
			System.out.println("성공적으로 추가되었습니다. : " + groupName);
			return true;
		}	
	}
	
	public void printGroupList() {
		for (String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	

	public boolean addNumber(String groupName, String phoneNumber, String name) {
	
		// phonebook : 여러 그룹을 저장할 수 있는 전체 전화번호부 인스턴스
		// phonebook.keySet() : 그룹명들
		// phonebook.values() : 그룹 이름을 키값으로 삼아 접근할 수 있는 그룹맵 인스턴스
		for (HashMap<String, String> group : phonebook.values()) {
			if (group.containsKey(phoneNumber)) {
				System.out.println("이미 등록된 번호입니다.");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		} else {
			phonebook.get("미분류").put(phoneNumber, name);
		}
		
		return true;
	}
	
	public void printPhoneBook() {
		for (String groupName : new TreeSet<>(phonebook.keySet())) {

			System.out.printf("---- %s ----\n", groupName);
			
			HashMap<String, String> group = phonebook.get(groupName);
			
			/*
			 	# TreeSet의 두 가지 생성자
			 	
			 	1. 정렬 기준을 정하면서 인스턴스를 생성
			 	2. 컬렉션을 전달 (정렬 기준으로 전달하는 컬렉션의 제네릭 타입 Comparable을 사용)
			*/
			TreeSet<Entry<String, String>> sortedEntrySet =
				new TreeSet<>(new Comparator<Entry<String, String>>() {
					@Override
					public int compare(Entry<String, String> o1, Entry<String, String> o2) {
						// 이름 기준으로 1차 정렬 후, 전화번호 기준으로 2차 정렬
						int value_diff = o1.getValue().compareTo(o2.getValue());
						
						if (value_diff == 0) {
							return o1.getKey().compareTo(o2.getKey());
						} else {
							return value_diff;
						}
					}
				});
			
			sortedEntrySet.addAll(group.entrySet());
			
			for (Entry<String, String> entry : sortedEntrySet) {
				System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
			}
		}
	}
	
	public void searchByName(String keyword) {
		// System.out.println("Heloo, world!".contains(","));
		int count = 0;
		System.out.println("- - 검색 결과 - -");
		for (HashMap<String, String> group : phonebook.values()) {		
			for (Entry<String, String> entry : group.entrySet()) {
				if (entry.getValue().contains(keyword)) {
					System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
					count++;

//				for (String phoneNumber : group.keySet()) {
//					String name = group.get(phoneNumber);
//					if(name.contains(keyword)) {
//						System.out.printf("%s : % \n", name, phoneNumber);
				}
				
			}
		}
		System.out.printf("검색 결과 %d건\n", count);
	}
	public void searchByPhoneNumber(String number_fragment) {
		int count = 0;
		System.out.println("- - 검색 결과 - -");
		for (HashMap<String, String> group : phonebook.values()) {		
			for (String phoneNumber : group.keySet()) {
				if(phoneNumber.contains(number_fragment)) {
					System.out.printf("%s : %s\n", group.get(phoneNumber),phoneNumber);
					count++;
				}
			}
		}
//		System.out.printf("검색 결과 : ");
	
	}
	public static void main(String[] args) {
		
		D07_PhoneBook book = new D07_PhoneBook();
//		Scanner sc = new Scanner(System.in);
//		
		
//		while (true) {
//			System.out.print("그룹 이름을 입력 >> ");
//			book.addGroup(sc.nextLine());
//			
//			book.printGroupList();
//		}
		book.addGroup("가족");
		book.addGroup("동호회");
		book.addGroup("초등학교 동창");
		book.addGroup("중학교 동창");
		book.addGroup("고등학교 동창");
		book.addGroup("대학동기");
		book.addGroup("취업반");
		
		book.printGroupList();
		
		book.addNumber(null, "12312341234", "김동현");
		book.addNumber(null, "01012341235", "추성훈");
		book.addNumber(null, "01012341234", "이대호");
		book.addNumber(null, "01012864234", "추신수");
		book.addNumber(null, "01012546457", "강호동");
		
		book.printPhoneBook();
		
		book.searchByName("호");
		book.searchByPhoneNumber("01012341234");
	}
	
}	
/*	
	public static void main(String[] args) {
		
		System.out.println("========================");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		}
		
		
		HashMap<String, HashMap<String, PhoneInfo>> phonebook;
		
		phonebook = new HashMap<>();
			
		phonebook.put("친구", new HashMap<>());
		phonebook.put("직장", new HashMap<>());
		phonebook.put("미분류", new HashMap<>());

		// phonebook.get("가족").put(,());

		TreeSet<String> name = new TreeSet<>(new name_내림차순());

		name.put("홍길동");
		name.put("고길동");
		name.put("박길동");
		name.put("이길동");
		name.put("서길동");
		name.put("김길동");
		
		
		HashSet<String> number = ((HashSet)phonebook.get(name));

		number.put("010123456789");
		number.put("010123453773");
		number.put("010783423456");
		number.put("010467868641");
		number.put("010350045704");
		number.put("010350045704");
		
		// 
		// 배열을 만들고 > 포도처럼 적용하고 > contain을 적용한다..?
		
		for (String key : phonebook.keySet()) {
			Object value = phonebook.get(key);

		if (value instanceof String[]) {
			String[] arr = (String[]) value;
			
			System.out.print(key + "[");
			for (int i = 0; i < arr.length; ++i) {
				System.out.print(arr[i] + ", ");
			}
			System.out.print("]");
		} else {
			System.out.println(key + ": " + value);
			
		}
		
		System.out.println(name.descendingSet());

		System.out.println("========================");
		
		System.out.print("이름을 검색해보세요.>>");
		System.out.println(phonebook.containsValue(input));
	
		}
static class PhoneInfo {
	String name;
	String number;
	String address;
	String profile_image_path;
*/

// @Override	
	
	
	
//	public static void map(String[] args) {
//	HashMap<Integer, String> map = new HashMap<>();
//	
//	map.put(3, "hello!");
//	map.put(99, "good night!");
//	map.put(99, "good night!");
//
//	System.out.println(map.get(3));
//	System.out.println(map.get(99));
//	System.out.println(map.get(35));
//
//	
//	// containKey(key) : 맵에 해당 키가 포함되어 있는지 검사한다
//	System.out.println("키 중에 15가 있나요?" + map.containsKey(15));
//	System.out.println("키 중에 35가 있나요?" + map.containsKey(35));
//
//	// containValue(value) : 맵에 해당 값이 포함되어 있는지 검사한다
//	System.out.println("값 중에 Hello!가 있나요?" + map.containsValue("Hello"));
//	System.out.println("값 중에 hello!가 있나요?" + map.containsValue("hello!"));


