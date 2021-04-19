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
		
		phonebook.put("ģ��", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("�̺з�", new HashMap<>());

		phonebook.get("����").put("010-5487-5346","����");
	}

	/*
		# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
		
		1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�
		2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
		3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´� << �ߺ����� �ʴ� ���� Ű ��!
		
		# �����ؾ� �� �޼���
		
		1. ���ο� �׷��� �߰��ϴ� �޼���
		2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼��� (�׷��� ���ٸ� �̺з� �׷쿡 ����)
	 	3. ��ϵ� ��� ��ȭ���θ� �̸����� ������������ �����ִ� �޼���
	 	4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
	 	5. ��ȭ������ �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���
	 */

	public boolean addGroup(String groupName) {
		if (phonebook.containsKey(groupName)) {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�. : " + groupName);

			return false;
		} else {
			System.out.println("���������� �߰��Ǿ����ϴ�. : " + groupName);
			return true;
		}	
	}
	
	public void printGroupList() {
		for (String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	

	public boolean addNumber(String groupName, String phoneNumber, String name) {
	
		// phonebook : ���� �׷��� ������ �� �ִ� ��ü ��ȭ��ȣ�� �ν��Ͻ�
		// phonebook.keySet() : �׷���
		// phonebook.values() : �׷� �̸��� Ű������ ��� ������ �� �ִ� �׷�� �ν��Ͻ�
		for (HashMap<String, String> group : phonebook.values()) {
			if (group.containsKey(phoneNumber)) {
				System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�.");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		} else {
			phonebook.get("�̺з�").put(phoneNumber, name);
		}
		
		return true;
	}
	
	public void printPhoneBook() {
		for (String groupName : new TreeSet<>(phonebook.keySet())) {

			System.out.printf("---- %s ----\n", groupName);
			
			HashMap<String, String> group = phonebook.get(groupName);
			
			/*
			 	# TreeSet�� �� ���� ������
			 	
			 	1. ���� ������ ���ϸ鼭 �ν��Ͻ��� ����
			 	2. �÷����� ���� (���� �������� �����ϴ� �÷����� ���׸� Ÿ�� Comparable�� ���)
			*/
			TreeSet<Entry<String, String>> sortedEntrySet =
				new TreeSet<>(new Comparator<Entry<String, String>>() {
					@Override
					public int compare(Entry<String, String> o1, Entry<String, String> o2) {
						// �̸� �������� 1�� ���� ��, ��ȭ��ȣ �������� 2�� ����
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
		System.out.println("- - �˻� ��� - -");
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
		System.out.printf("�˻� ��� %d��\n", count);
	}
	public void searchByPhoneNumber(String number_fragment) {
		int count = 0;
		System.out.println("- - �˻� ��� - -");
		for (HashMap<String, String> group : phonebook.values()) {		
			for (String phoneNumber : group.keySet()) {
				if(phoneNumber.contains(number_fragment)) {
					System.out.printf("%s : %s\n", group.get(phoneNumber),phoneNumber);
					count++;
				}
			}
		}
//		System.out.printf("�˻� ��� : ");
	
	}
	public static void main(String[] args) {
		
		D07_PhoneBook book = new D07_PhoneBook();
//		Scanner sc = new Scanner(System.in);
//		
		
//		while (true) {
//			System.out.print("�׷� �̸��� �Է� >> ");
//			book.addGroup(sc.nextLine());
//			
//			book.printGroupList();
//		}
		book.addGroup("����");
		book.addGroup("��ȣȸ");
		book.addGroup("�ʵ��б� ��â");
		book.addGroup("���б� ��â");
		book.addGroup("����б� ��â");
		book.addGroup("���е���");
		book.addGroup("�����");
		
		book.printGroupList();
		
		book.addNumber(null, "12312341234", "�赿��");
		book.addNumber(null, "01012341235", "�߼���");
		book.addNumber(null, "01012341234", "�̴�ȣ");
		book.addNumber(null, "01012864234", "�߽ż�");
		book.addNumber(null, "01012546457", "��ȣ��");
		
		book.printPhoneBook();
		
		book.searchByName("ȣ");
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
			
		phonebook.put("ģ��", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("�̺з�", new HashMap<>());

		// phonebook.get("����").put(,());

		TreeSet<String> name = new TreeSet<>(new name_��������());

		name.put("ȫ�浿");
		name.put("��浿");
		name.put("�ڱ浿");
		name.put("�̱浿");
		name.put("���浿");
		name.put("��浿");
		
		
		HashSet<String> number = ((HashSet)phonebook.get(name));

		number.put("010123456789");
		number.put("010123453773");
		number.put("010783423456");
		number.put("010467868641");
		number.put("010350045704");
		number.put("010350045704");
		
		// 
		// �迭�� ����� > ����ó�� �����ϰ� > contain�� �����Ѵ�..?
		
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
		
		System.out.print("�̸��� �˻��غ�����.>>");
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
//	// containKey(key) : �ʿ� �ش� Ű�� ���ԵǾ� �ִ��� �˻��Ѵ�
//	System.out.println("Ű �߿� 15�� �ֳ���?" + map.containsKey(15));
//	System.out.println("Ű �߿� 35�� �ֳ���?" + map.containsKey(35));
//
//	// containValue(value) : �ʿ� �ش� ���� ���ԵǾ� �ִ��� �˻��Ѵ�
//	System.out.println("�� �߿� Hello!�� �ֳ���?" + map.containsValue("Hello"));
//	System.out.println("�� �߿� hello!�� �ֳ���?" + map.containsValue("hello!"));


