package quiz;

public class B04_ConditionQuiz {

	public static void main(String[] args) {
		/*
        [ �˸��� �񱳿����� �������� ]
            
        1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
        2. int�� ���� b�� ¦���� �� true                
        3. int�� ���� c�� 7�� ����� �� true
        4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
        5. int�� ���� d�� e�� ���̰� 30�� �� true                
        6. int�� ���� year�� 400���� ������ �������� true  
           �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
        7. �μ��� ö������ 2�� ������ true
        8. �μ��� ö������ ������ 3�� ������ true  
        9. boolean�� ���� powerOn�� false�� �� true
        10. ���ڿ� �������� str�� "yes"�� �� true
*/        
		
		int a = 14;
		System.out.println("1." + (a >10 && a<20));
		
		int b = 8;
		System.out.println("2." + (b % 2 == 0));
		
		
		int c = 21;
		System.out.println("3." + (c % 7 == 0));
				
		int hour = 13;
		System.out.println("4." + (hour >= 12 && hour >= 24));
		
		int d = 85;
		int e = 19;
		System.out.println(Math.abs(d - e) == 30 );

		int year = 800;
		System.out.println((year % 400) == 0 || (year % 4 == 0 && year % 100 ==0));
		
		int Min = 18;
		int Ch = 16;
		System.out.println(Min > Ch && (Min -Ch)>=2);
	
		int minsuBirth = 8;
		int chBirth = 12;
		System.out.println(minsuBirth +3 == chBirth);
		
		boolean powerOn = false;
		System.out.println("9." + !powerOn);
		
		// *���ڿ�(������ Ÿ��)�� ==���� ���ϸ� �ȵȴ�.
		// ������ Ÿ���� ���� ���� ���� �ش� Ŭ������ ���ǵǾ� �ִ� equals()���
		// �޼��带 �̿��ؾ� �Ѵ�
		
		
		String str = "yes";
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		// # �⺻�� Ÿ�԰� ������ Ÿ���� ������
		// - �⺻�� Ÿ���� ���� �������� ũ�⸦ �����ϱ� ����(�������� ���̴� �޸� ���= ����(Stack))
		// - ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ�(�������� �� ���� �޸� ���= ��(Heap))
		
		String str1 = "yes";
		String str2 = new String("yes"); // str1�� �ٸ� yes(�ٸ� �ּ�, ���� ����)
		String str3 = "yes"; // str�� ���� yes(str�� �ּҰ� ����, ���� �ܾ ����ϴ°� ���� �ּ�, �� �����͸� ������)
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1 ==str2 : " + (str1 ==str2));
		System.out.println("str1 ==str3 : " + (str1 ==str3));
		
	}

}
