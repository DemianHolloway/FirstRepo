package quiz;

import java.util.Arrays;
import java.util.Random;

public class B18_Array2Quiz {

	public static void main(String[] args) {

		int[][] numArr = new int[][] {
			{1, 1, 1, 1,},
			{1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1, 1,},
		};

		// 1, numArr의 모든 값을 0 ~100 사이의 랜덤 정수로 바꿔보세요
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] = (int)(Math.random() * 101);
				System.out.printf("%4s, ", "'" + numArr[i][j] + "'");
			}
			System.out.println("}");
		}		
				
		// 2. numArr의 총합과 평균을 구해서 출력해보세요
	
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			count += numArr[i].length;
	
		for (int j = 0; j < numArr[i].length; ++j) {
			sum += numArr[i][j];
			
		}
		}
		System.out.printf("numArr의 총합 : %d, 평균 :  %.2f\n" + sum, sum / (double)count );	
				
		
		// 3. numArr의 각 행의 합을 모두 구해서 출력해보세요
	
		int[] rowSum = new int[numArr.length];
		
		for(int i = 0; i < rowSum.length; ++i) {	
			for(int j = 0; j < numArr[i].length; ++j) {
					rowSum[i] += numArr[i][j];
				}
				
		}			
		
		// Arrays.toString() : 배열 편하게 출력하기
		System.out.println("행의 합: " + Arrays.toString(rowSum));
		
		// 4. numArr의 각 열의 합을 모두 구해서 출력해보세요
		// * row : 행, column : 열
		
		// 제일 긴 배열찾기
		int longest = 0;
		for (int i = 0; i < numArr.length; ++i) {
			longest = Math.max(longest, numArr[i].length);
		}
		
		int[] colSum = new int[7];
		
		for(int i = 0; i < colSum.length; ++i) {	
			
			for(int j = 0; j < numArr.length; ++j) {
				
				colSum[i] += numArr[j][i];
			}
		}
		
//		for(int i = 0; i < colSum.length; ++i) {	
			
//			for(int j = 0; j < numArr.length; ++j) {
//				if(numArr[j].length > i) {
//				colSum[i] += numArr[j][i];
//}
// }
// }
	
	System.out.println("열의 합: " + Arrays.toString(colSum));	
}
	
}	
		
		
		
		/*
		// 1, numArr의 모든 값을 0 ~100 사이의 랜덤 정수로 바꿔보세요
		for (int i = 0; i < numArr.length; ++i) {
			
			System.out.println(i + " numArr======");
			
			for (int j = 0; j < numArr[i].length; ++j) {
				System.out.println((int)(Math.random() * 100 + 0));

		// 2. numArr의 총합과 평균을 구해서 출력해보세요
			}
		}
		int sum = 0;
		double average = sum /numArr.length;
		
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		System.out.println("numArr의 총합 : " + sum +"\t평균 : " + average );	
				
		
		// 3. numArr의 각 행의 합을 모두 구해서 출력해보세요
	
		for(int i = 0; hor <= 0; ++hor) {	
			System.out.print(hor + "가로: ");
				
				for(int ver = 1; ver <= 9; ++ver) {
					System.out.println("numArr의 각 행의 합 : " + sum);
				}
				
		}			
		// 4. numArr의 각 열의 합을 모두 구해서 출력해보세요
					
		System.out.println("============================");
					
		for (int i = 0; i < numArr.length; ++i) {
			System.out.printf(i + "numArr의 각 열의 합 : " + sum);
		}
		
			System.out.println("");					
	*/