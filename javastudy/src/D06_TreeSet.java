import java.util.Comparator;
import java.util.TreeSet;

public class D06_TreeSet {

    /*
    # TreeSet
    
     - �ߺ����� ������ �� ���� 
     - �����͸� ������ �� Comparator�� �̿��� �̸� �����Ѵ� 
     - ��ҷ� null�� ������� �ʴ´�
     - ó���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
     - ������ TreeSet���� ����(�ε���)�� �ֱ� ������ ���ϴ� �����͸� ���� �� �ִ� 
     */

	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new  �����з���_gno_��������());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new �����з���_�����˸���_��������());
   
		// �ش� ��ü ��ü�� �� ������ ��ü��� Comparator�� ������� ���� �� �ִ�
		TreeSet<String> word_tree = new TreeSet<>();
		TreeSet<Mango> mango_tree = new TreeSet<>();
   
		for (int i = 0; i < 5; ++i) {
        mango_tree.add(new Mango(String.format("MANGO%05d", (int)(Math.random() * 100000)), 10, 10));}
                   
		grape_tree.add(new Grape().setGno("1").setFruit(37));
		grape_tree.add(new Grape().setGno("2").setFruit(31));
		grape_tree.add(new Grape().setGno("3").setFruit(40));
		grape_tree.add(new Grape().setGno("4").setFruit(37));
   
		grape_tree2.addAll(grape_tree);
   
		System.out.println(grape_tree);
		System.out.println(grape_tree2);
   
		word_tree.add("cat");
		word_tree.add("pet");
		word_tree.add("pat");
		word_tree.add("fat");
		word_tree.add("bat");
   
		System.out.println(word_tree);
		System.out.println(mango_tree);
   
		// # TreeSet Ȱ��
		
		// descendingSet() : �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ
		System.out.println("descendingSet : " + grape_tree.descendingSet());
		
		
		// headSet(toElement) : �� �պ��� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ
		System.out.println("headSet : " + grape_tree.headSet(new Grape().setGno("3")));
		
		// tailSet(toElement) : ���ϴ� ��Һ��� �� �ڱ��� �ڸ� Set�� ��ȯ
		System.out.println("tailSet : " + grape_tree.tailSet(new Grape().setGno("3")));
				
		// subset(fromElement, toElement) : ���ϴ� ��Һ��� �����ؼ� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ
		System.out.println("subset : " + grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1")));
		
		
		TreeSet<Integer> int_tree = new TreeSet<>();
		
		
		int_tree.add(99);
		int_tree.add(5);
		int_tree.add(21);
		int_tree.add(24);
		int_tree.add(37);
		int_tree.add(63);
		int_tree.add(88);
		
		System.out.println(int_tree);
		
		// ceiling(element) : ���ϴ� ���� ����� ��Ҹ� �÷��� ���� (������ ���� ����)
		System.out.println(int_tree.ceiling(20));
		System.out.println(int_tree.ceiling(21));
		System.out.println(int_tree.ceiling(22));
		
		// floor(element) : ���ϴ� ���� ����� ��Ҹ� ������ ���� (������ ���� ����)
		System.out.println(int_tree.floor(21));
		System.out.println(int_tree.floor(20));
		System.out.println(int_tree.floor(19));
		System.out.println(int_tree.floor(18));
		
		// higher(element) : ���ϴ� ���� ����� ��Ҹ� �÷��� ���� (������ �� ������)
		System.out.println(int_tree.higher(21));
		
		// lower(element) : ���ϴ� ���� ����� ��Ҹ� ������ ���� (������ �� ������)
		System.out.println(int_tree.lower(21));
		
		// ��������: ����Ʈ���� ���� 5�� �߰��Ҷ� mno���� �������� ������ �ǵ��� ����� Ȯ��
		//           sysout���� ����� �� ���� ���� ���;� �� (���� �ּ� X)                
		// new Mango("1234", 12, 123).setMno("4321");
	}

}

class MangoCompareBySweetAsc implements Comparator<Mango> {
    
	@Override
	public int compare(Mango o1, Mango o2) {                
		if (o1.sweet > o2.sweet) {
			return 1;
		} else if (o1.sweet < o2.sweet) {
			return -1;
		} else {
           return 0;
		}
	}        
}

	//Comparator : ���Ҷ� ����ϴ� �� ���� Ŭ������ ����� �������̽� 
	//Comparable : �� ��ü�� �� ������ Ŭ�������� ǥ���ϴ� �������̽� 
class Mango implements Comparable<Mango> {
	String mno;
	int sweet;
	int size;

public Mango(String mno, int sweet, int size) {
   this.mno = mno;
   this.sweet = sweet;
   this.size = size;
}

Mango setMno(String mno) {
	this.mno = mno;
   		return this;
	}

	// this vs �Ű������� compare �޼��带 �����ϸ� �ȴ� 
	@Override
	public int compareTo(Mango o) {
		return this.mno.compareTo(o.mno);
	}

	@Override
	public String toString() {        
		return mno + "/" + sweet + "/" + size;
	}
}