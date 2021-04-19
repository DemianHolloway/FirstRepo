package quiz.basic;

public class B14_Gugudan {

	public static void main(String[] args) {
		/*
		 
		 	1. �������� ������ ���� ���η� ����غ�����
		 	
		 	2�� : 2X1=2 2X2=4 2X3=6 . . .
		 	3�� : 3X1=2 3X2=6 3X3=9 . . .
		 	4�� : . . .
		 	
		 	2. �������� ������ ���� ���η� ����غ�����
		 	
		 	2��		3��		4��
		 	2X1=2	3X1=3   ...
		 	2X2=4	3X2=6	...
		 	2X3=6	3X3=9	...
		 	. . .	. . .	...
		 */
		System.out.println("=======����=========");
		
		
		for(int dan = 2; dan <= 9; ++dan) {	
			System.out.print(dan + "��: ");
				
				for(int gop = 1; gop <= 9; ++gop) {
					System.out.printf("%dx%d=%-2d" , dan, gop, dan * gop);
				
			}
				
		}
		System.out.println("============================");
		
		for(int line = 1; line <= 9; ++line) {	
				for(int dan = 1; dan <= 9; ++dan) {
					
					if(line == 0) {
						System.out.print(dan + "��\t");
					} else {
						System.out.printf("%dx%d=%d\t" , dan, line, dan * line);
				}
				}
				System.out.println("");		
		}
	}
}
