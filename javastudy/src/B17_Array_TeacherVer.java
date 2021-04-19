
public class B17_Array_TeacherVer {

	public static void main(String[] args) {
		
		
		 int[] score = new int[133];
         
         // 배열도 배열.length를 통해 길이를 알 수 있다                
         for (int index = 0; index < score.length; ++index) {
                 score[index] = (int)(Math.random() * 101);
         }
         
         System.out.println("10번째 학생의 점수: " + score[9]);
         
         // 연습문제1: score의 총합과 평균(소수 둘째 자리)을 출력해보세요
         int sum = 0;
         
         for (int i = 0; i < score.length; ++i) {
                 sum += score[i];
         }
         
         System.out.printf("총합: %d, 평균: %.2f\n", sum, sum / (double)score.length);
         
         /*
                 # 배열을 선언하는 방법
                 
                  1. 타입[] 배열이름 = new 타입[배열크기];
                  2. 타입[] 배열이름 = { 값1, 값2, 값3, ... };        
                  3. 타입[] 배열이름 = new 타입[] { 값1, 값2, 값3, ... };         
         */
         char[] grade = new char[50];                
         int[] age = { 10, 15, 20, 18, 31, 80, 75 };
         boolean[] passExam = { true, false, true, true, false, 80 > 70 };
         
         String[] animals = new String[] { "lion", "tiger", "penguin", "monkey" };
         
         System.out.println(animals[0]);
         System.out.println(animals[3]);
         
         if (passExam[3]) {
                 System.out.println("4번째 사람은 시험을 통과했습니다.");
         }
         
         for (int i = 0; i < grade.length; ++i) {
                 System.out.println((int)grade[i]);
         }
         
         // # 배열은 변수와 다르게 초기화가 자동으로 되어있다
         int[] arr = new int[3];                
         int a, b, c;
         
         System.out.println("arr[0]: " + arr[0]);
         
         // # String은 char형 배열로 변환할 수 있다
         char[] msg1 = new char[] { 'h', 'e', 'l', 'l', 'o' };
         String msg2 = "hello";
         char[] msg3 = msg2.toCharArray();
         
         System.out.println(msg1[0]);
         System.out.println(msg1[1]);
         System.out.println(msg1[2]);
         
         System.out.println(msg2.charAt(0));
         System.out.println(msg2.charAt(1));
         System.out.println(msg2.charAt(2));
         
         System.out.println(msg3[0]);
         System.out.println(msg3[1]);
         
 }
 
}

