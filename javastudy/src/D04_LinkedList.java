import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {

	/*
	 	# ���� ����Ʈ
	 	
	 	- ArrayList���� ����/������ ������ ����Ʈ
	 	- ������ �߰��� ������ �߻����� �� ArrayList�� ��� �����͸� �ڷ� �о�� ������
	 	  ���� ����Ʈ�� ����� ��常 �����ϱ� ������ �ξ� ������
	 	- ArrayList�� ������ ���� �� �б⿡ �����ϰ�
	 	  LinkedList�� ������ �߰� ���� �� ������ �����ϴ�
	 */
	
	public static void main(String[] args) {
	
		LinkedList<String> animals = new LinkedList<>();
		
		animals.add("tiger");
		animals.add("lion");
		animals.add("horse");

		
		System.out.println(animals);
		
		animals.addFirst("turtle");
		animals.addLast("monkey");
		
		System.out.println(animals);
		
		//LinkedList�� get��
		System.out.println(animals.get(3));
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
		
		// pop() , poll() : ����Ʈ���� �� �� �����͸� �а� ������
		while (animals.size() != 0) {
			System.out.println("pop! (poll!) " + animals.poll());
		}
		
		System.out.println("after pop: " + animals);
		
		// pollLast() : ����Ʈ�� �� �� �����͸� �а� ������
		ArrayList<String> cage = new ArrayList<>();
		cage.add("rabbit");
		cage.add("hamster");
		cage.add("rabbit");
		cage.add("rabbit");
		cage.add("rabbit");

		
		animals.addAll(cage);

		while (animals.size() != 0) {
			System.out.println("�ڿ������� ������ " + animals.pollLast());
		}
		
		
		//���� �׽�Ʈ
		int testsize = 1000000;
		
		ArrayList<String> arr = new ArrayList<>(testsize);
		
		for (int i = 0; i < testsize; ++i) {
			arr.add(i);
		}
		
		LinkedList<Integer> linked = new LinkedList<>();
		
		for (int i = 0; i< testsize; ++i) {
			linked.add(i);
		}
		
		// ������ �߰� ���ɺ�
		int insertionSize = 50000;
		
		System.out.println("1. ArrayList Insertion Test");
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 5000; ++i) {
			arr.add(50, 10);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms");
		
		
		
		System.out.println("2. LinkedList Insertion Test");
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 5000; ++i) {
			linked.add(50, 10);
		}
		
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms");
	}
}