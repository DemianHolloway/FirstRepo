package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// ���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� �� �� �ְ� �ȴ�
// ���� ������ Object�� �����ȴ�
public class D02_JiphapQuiz<T> {

	/*
	 	1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
	 	
	 	2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
	 	
	 	3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���

	 */
	public Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {                
        Set<T> union_set = new HashSet<>(a);                
        union_set.addAll(b);                
        return union_set;
	}

	public Set<T> intersection(Collection<? extends T> a, Collection<? extends T> b) {
        Set<T> inter_set = new HashSet<>(a);                
        inter_set.retainAll(b);                
        return inter_set;
	}

	public Set<T> diff(Collection<? extends T> a, Collection<? extends T> b) {
        Set<T> diff_set = new HashSet<>(a);                
        diff_set.removeAll(b);                
        return diff_set;
	}

	public static int plus(int a, int b) {
        a += b;                
        return a;
	}        

	public static void main(String[] args) {                
        // �ҹ��ڷ� �����ϴ� Ÿ�Ե�(�⺻��)�� �Ű������� ������ �� ���� �����Ͽ� �����Ѵ�
        int int_a = 20;
        int int_b = 30;
        
        System.out.println(plus(int_a, int_b));
        System.out.println("plus �� int_a�� ��: " + int_a);
        
        // �빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�
        List<String> a = new ArrayList<>();
        Set<String> b = new HashSet<>();                
        Set<String> c = new HashSet<>();
        
        a.add("abc");
        a.add("application");
        a.add("advertise");
        a.add("apple");
        
        b.add("banana");
        b.add("balloon");
        b.add("bike");
        b.add("apple");
        
        c.add("cow");
        c.add("cat");
        c.add("crack");
        c.add("apple");
        
        
        D02_JiphapQuiz<String> jiphap_tools = new D02_JiphapQuiz<String>();
        D02_JiphapQuiz<Integer> jiphap_tools2 = new D02_JiphapQuiz<Integer>();                        
        
        System.out.println("\nunion�� �����ϱ� ���� a: " + a);
        System.out.println(jiphap_tools.union(a, b));
        
        System.out.println("\nunion�� ������ ���� a: " + a);                
        System.out.println(jiphap_tools.union(a, c));
        
        System.out.println(jiphap_tools.intersection(jiphap_tools.intersection(a, b), c));        
	}
}

	/*
	 ���� �� �󷹹���
	
	public static void main(String[] args) {
		
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		
		HashSet<Integer> Jiphap1 = new HashSet<Integer>();
		Jiphap1.add(2);
		Jiphap1.add(3);
		Jiphap1.add(4);


		HashSet<Integer> Jiphap2 = new HashSet<Integer>();
		Jiphap2.add(1);
		Jiphap2.add(2);
		Jiphap2.add(3);
		Jiphap2.add(5);
		Jiphap2.add(7);
		
		
		Jiphap1.addAll(Jiphap2);
		System.out.println("������: " + Jiphap1.toString());
		
		Jiphap1.removeAll(Jiphap2);
		System.out.println("������: " + Jiphap1.toString());
		
		Jiphap1.retainAll(Jiphap2);
		System.out.println("������: " + Jiphap1.toString());
		
		
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);

		//�޼���� �����!
	}
}
 */
