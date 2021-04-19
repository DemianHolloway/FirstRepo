package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class D05_Poker {

	/*
	 
	 	��Ŀ�� �����غ�����
	 	
	 	1. �ξ� �÷���(Royal Flush a.k.a ��Ƽ��)
���� ������ ī��� 10,J,Q,K,A�� ������ ������ ���̵�

2. ��Ʈ����Ʈ �÷���(Straight Flush a.k.a ��Ƽ��)
���� ���̷� 5���� ���ӵ� ī�带 ������ ������ ���̵�

3. ��ī��(Four of a kind)
���� ������ ī�带 4�� ������ ������ ���̵�

4. Ǯ�Ͽ콺(Full House)
Ʈ���ð� �Բ� �ϳ��� �� ������ ������ ���̵�
���� ��ŷ�� ��� Ʈ������ ���ڰ� ���� �÷��̾ �¸�

5. �÷���(Flush)
���� ������ ī�带 5�� ������ ������ ���̵�
���� ��ŷ�� ��� ���� ���� ���ڸ� ������ �÷��̾ �¸�

6. ��Ʈ����Ʈ(Straight)
���ӵ� 5���� ī�带 ������ ������ ���̵�
A(Ace)�� ���� 10,J,Q,K,A�� A,2,3,4,5�� ����
������ ��� ��Ʈ����Ʈ���� ���� ���� ����̰�, ������ ��찡 ���� ���� ���

7. ���� ���� �� ī�ε�(Three of a kind a.k.a Ʈ����)
���� ������ ī�带 3�� ������ ������ ���̵�

8. �����(Two Pair)
���� ������ ī�� 2���� 2�� �����ϰ� ������ ���̵�

9. �����(One Pair)
���� ������ ī�� 2���� 1�� �����ϰ� ������ ���̵�

10. ����ī��(High Card)
�ƹ��� �� ���� ������ �ִ� ������ ���� ���� ��ġ�� ī��
	 */

	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<>();
		
		numbers.add("A");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("5");
		numbers.add("6");
		numbers.add("7");
		numbers.add("8");
		numbers.add("9");
		numbers.add("10");
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");
		
		

		HashSet<String> answer = new HashSet<>();
		
		answer.add("A");
		answer.add("2");
		answer.add("3");
		answer.add("4");
		answer.add("5");
		answer.add("6");
		answer.add("7");
		answer.add("8");
		answer.add("9");
		answer.add("10");
		answer.add("J");
		answer.add("Q");
		answer.add("K");
		
		System.out.println("numbers�� answer�� ���� �����ϰ� �ִ°�?"
			+ numbers.containsAll(answer));
		
	}
}
