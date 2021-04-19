package quiz;

import java.util.ArrayList;
import java.util.Random;

import myobj.school.Student2;

public class D01_StudentList {

	/*
	 	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	 	
	 	1. 각 학생의 점수는 랜덤으로 설정됩니다
	 	
	 	2. 과목은 국/영/수 밖에 없습니다
	 	
	 	3. 30명의 평균을 출력해주세요
	 	
	 	4. 30명중 가장 총점이 높은 학생의 이름과 성적을 출력해주세요
	 	
	 	5. 이름은 다음과 같이 생성됩니다
	 	
	 		학생000000
	 		학생000001
	 		학생000002
	 		...
	 */

	// 배열을 만든다...
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
	
		students.add("학생000000");
		students.add("학생000001");
		students.add("학생000002");
		students.add("학생000003");
		students.add("학생000004");
		students.add("학생000005");
		students.add("학생000006");
		students.add("학생000007");
		students.add("학생000008");
		students.add("학생000009");
		students.add("학생000010");
		students.add("학생000011");
		students.add("학생000012");
		students.add("학생000013");
		students.add("학생000014");
		students.add("학생000015");
		students.add("학생000016");
		students.add("학생000017");
		students.add("학생000018");
		students.add("학생000019");
		students.add("학생000020");
		students.add("학생000021");
		students.add("학생000022");
		students.add("학생000023");
		students.add("학생000024");
		students.add("학생000025");
		students.add("학생000026");
		students.add("학생000027");
		students.add("학생000028");
		students.add("학생000029");
		students.add("학생000030");
		
	}
	// 랜덤 점수의 과목을 만든다...
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
		System.out.printf("학생의 총합 : %d, 평균 :  %.2f\n" + sum, sum / (double)count );
		
		
		
		System.out.println(students.get());
		
		
	}
}

*/