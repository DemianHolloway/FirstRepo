package myobj;

public class Homoeostasis {

	
	static int regulator = 1;
	static int avoider = 1;
	static int conformerr = 1;
		
	int[] positiveFeedback;
	int[] negativeFeedback;
	boolean effect; // Antagonistic effect, Feedforward control(�ݴ밪�� ����)
		
		
	static void changeRegulator(int regulator) {
		Homoeostasis.regulator = regulator;	
	}
}
