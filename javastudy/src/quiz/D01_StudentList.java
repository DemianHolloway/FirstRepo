package quiz;

import java.util.ArrayList;
import java.util.Random;

import myobj.school.Student2;

public class D01_StudentList {

	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	1. �� �л��� ������ �������� �����˴ϴ�
	 	
	 	2. ������ ��/��/�� �ۿ� �����ϴ�
	 	
	 	3. 30���� ����� ������ּ���
	 	
	 	4. 30���� ���� ������ ���� �л��� �̸��� ������ ������ּ���
	 	
	 	5. �̸��� ������ ���� �����˴ϴ�
	 	
	 		�л�000000
	 		�л�000001
	 		�л�000002
	 		...
	 */

	// �迭�� �����...
	public static void main(String[] args) {
		ArrayList<Student2> clazz= new ArrayList<>();
	
		for (int i = 0; i < 30; ++i) {
			new student2();
			clazz.add(stu);
			System.out.println(stu.get);
		}
	}
}	
/*
	
		students.add("�л�000000");
		students.add("�л�000001");
		students.add("�л�000002");
		students.add("�л�000003");
		students.add("�л�000004");
		students.add("�л�000005");
		students.add("�л�000006");
		students.add("�л�000007");
		students.add("�л�000008");
		students.add("�л�000009");
		students.add("�л�000010");
		students.add("�л�000011");
		students.add("�л�000012");
		students.add("�л�000013");
		students.add("�л�000014");
		students.add("�л�000015");
		students.add("�л�000016");
		students.add("�л�000017");
		students.add("�л�000018");
		students.add("�л�000019");
		students.add("�л�000020");
		students.add("�л�000021");
		students.add("�л�000022");
		students.add("�л�000023");
		students.add("�л�000024");
		students.add("�л�000025");
		students.add("�л�000026");
		students.add("�л�000027");
		students.add("�л�000028");
		students.add("�л�000029");
		students.add("�л�000030");
		
	}
	// ���� ������ ������ �����...
	public abstract class Student {	
		int mat;
		int kor;
		int eng;
		
		Random ran;

		ran = new Random();
		
		mat = getRandomScore();
		kor = getRandomScore();
		eng = getRandomScore();

		}
		
		public abstract void printGradeCard();
		
		int getRandomScore() {
			return ran.nextInt(101);
		}

		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < students.length; i++) {
			count += students[i].length;
	
		for (int j = 0; j < students[i].length; ++j) {
			sum += students[i][j];
			
		}
		}
		System.out.printf("�л��� ���� : %d, ��� :  %.2f\n" + sum, sum / (double)count );
		
		
		
		System.out.println(students.get());
		
		
	}
}

*/