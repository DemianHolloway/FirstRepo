package myobj;

public class Homoeostasis {

	
	static int regulator = 1;
	static int avoider = 1;
	static int conformerr = 1;
		
	int[] positiveFeedback;
	int[] negativeFeedback;
	boolean effect; // Antagonistic effect, Feedforward control(반대값의 정의)
		
		
	static void changeRegulator(int regulator) {
		Homoeostasis.regulator = regulator;	
	}
}
