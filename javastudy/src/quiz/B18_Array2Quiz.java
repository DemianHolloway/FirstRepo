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

		// 1, numArr�� ��� ���� 0 ~100 ������ ���� ������ �ٲ㺸����
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] = (int)(Math.random() * 101);
				System.out.printf("%4s, ", "'" + numArr[i][j] + "'");
			}
			System.out.println("}");
		}		
				
		// 2. numArr�� ���հ� ����� ���ؼ� ����غ�����
	
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			count += numArr[i].length;
	
		for (int j = 0; j < numArr[i].length; ++j) {
			sum += numArr[i][j];
			
		}
		}
		System.out.printf("numArr�� ���� : %d, ��� :  %.2f\n" + sum, sum / (double)count );	
				
		
		// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
	
		int[] rowSum = new int[numArr.length];
		
		for(int i = 0; i < rowSum.length; ++i) {	
			for(int j = 0; j < numArr[i].length; ++j) {
					rowSum[i] += numArr[i][j];
				}
				
		}			
		
		// Arrays.toString() : �迭 ���ϰ� ����ϱ�
		System.out.println("���� ��: " + Arrays.toString(rowSum));
		
		// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		// * row : ��, column : ��
		
		// ���� �� �迭ã��
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
	
	System.out.println("���� ��: " + Arrays.toString(colSum));	
}
	
}	
		
		
		
		/*
		// 1, numArr�� ��� ���� 0 ~100 ������ ���� ������ �ٲ㺸����
		for (int i = 0; i < numArr.length; ++i) {
			
			System.out.println(i + " numArr======");
			
			for (int j = 0; j < numArr[i].length; ++j) {
				System.out.println((int)(Math.random() * 100 + 0));

		// 2. numArr�� ���հ� ����� ���ؼ� ����غ�����
			}
		}
		int sum = 0;
		double average = sum /numArr.length;
		
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		System.out.println("numArr�� ���� : " + sum +"\t��� : " + average );	
				
		
		// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
	
		for(int i = 0; hor <= 0; ++hor) {	
			System.out.print(hor + "����: ");
				
				for(int ver = 1; ver <= 9; ++ver) {
					System.out.println("numArr�� �� ���� �� : " + sum);
				}
				
		}			
		// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
					
		System.out.println("============================");
					
		for (int i = 0; i < numArr.length; ++i) {
			System.out.printf(i + "numArr�� �� ���� �� : " + sum);
		}
		
			System.out.println("");					
	*/