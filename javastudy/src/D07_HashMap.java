import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D07_HashMap {

	/*
	 	# Map
	 	
	 	- Key�� Value�� �� ���� �̷�� �ڷᱸ��
	 	- Key���� ���� Value�� ������ �� �ִ�
	 	- Key�� �ߺ��� ������� �ʴ´�
	 */
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> record = new HashMap<>();
		
		// put(key, value)
		// - map�� ������ �߰�
		// - ������ ����ִ� ���� ������ �� ���� ����, ������ null�� ����
		record.put("ȫ�浿", 5000);
		record.put("���浿", 3500);
		record.put("�ڱ浿", 9000);
		
		// �̹� �����ϴ� Ű���� put�ϸ� ���� ����
		Integer previous_value = record.put("ȫ�浿", 3500); // �̹� �����ϴ� Ű���� put�ϸ� ���� ����
		
		System.out.println("������ ����ִ� ��: " + previous_value);
		System.out.println("���� ����ִ� ��: " + record.get("ȫ�浿"));

		// ��������: "ȫ�浿" �� ����Ǿ� �ִ� ���ڸ� 3000 �������� ������
		record.put("ȫ�浿", record.get("ȫ�浿") + 3000);
		
		
		System.out.println(record);

		
		//get(key) : key�� �̿��� value�� ����
		System.out.println(record.get("�ڱ浿"));
	
		HashMap<String, Object> person = new HashMap<>();
		
		person.put("�̸�", "ȫ�浿");
		person.put("����", 35);
		person.put("�����ϴ� ��", new String[] {"���", "���ڱ�", "�Ա�"});
		person.put("�Ⱦ��ϴ� ��", new String[] {"����ŷ", "ķ��", "5���̻� ���� ����"});
		person.put("�Ⱦ��ϴ� ��", new HashSet<>());
		
		
		// ��������: "�Ⱦ��ϴ� ��"�� �����͸� �߰��غ�����
		HashSet<String> hate = ((HashSet)person.get("�Ⱦ��ϴ� ��"));

		hate.add("�߱�");
		hate.add("Ư��");
		hate.add("�����");
		
		
		System.out.println(person.get("����"));
		System.out.println(((String[]) person.get("�����ϴ� ��"))[0]);
		System.out.println(((String[]) person.get("�Ⱦ��ϴ� ��"))[2]);
		System.out.println(((String[]) person.get("�Ⱦ��ϴ� ��"))[2]);
		
		System.out.println(person.get("�Ⱦ��ϴ� ��"));
		
		/*
			# �ݺ������� Map�� Ȱ���ϱ�
			
			- keySet() : key��θ� �̷���� Set�� ��ȯ�Ѵ�
			- values() : value��θ� �̷���� Set�� ��ȯ�Ѵ�
			- entrySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�
		 */
		
		for (String key : person.keySet()) {
			Object value = person.get(key);
			
			// A instanceof B : A�� B�� �ν��Ͻ������� �Ǻ��Ѵ�. ��ĳ���� ��뿡���� �Ǻ��ȴ�
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
		}
		
		// # values()
		System.out.println("values: " + person.values());
		
		// # entrySet()
		for (Entry<String, Object> entry : person.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key + "=" + value);
		}
	}
}