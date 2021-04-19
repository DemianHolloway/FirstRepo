package quiz;

public class B15_Count369Ver3 {

	public static void main(String[] args) {
//		System.out.println(testValue / 1000);
//		System.out.println(testValue % 100 / 100); << 30¹øÁÙ
//		System.out.println(testValue % 100 / 10);
//		System.out.println(testValue % 10);
		
		int input = 5678;
		int clap = 0;
		
		for(int i = 1; i <= input; ++i) {
		
			int testValue = i;
			System.out.print(i + ": ");
			
			while (testValue > 0) {
				int digit = testValue % 10;
				
				
				if (digit % 3 == 0 && digit != 0) {
				clap++;
				System.out.print("Â¦");
				}
				
				testValue /= 10;
				
			}
			System.out.println();
		}
		
		/*
		int i = 1234;
		
		System.out.println(i % 10);
		System.out.println(i / 10 % 10);
		System.out.println(i / 10 / 10 % 10);
		*/

	}

}
