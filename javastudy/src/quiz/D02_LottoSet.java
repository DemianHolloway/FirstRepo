package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class D02_LottoSet {

	/*
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 HashSet을 생성하여
	 	반환하는 메서드를 작성 후 테스트해보기
	 */
	public HashSet<Integer> getLottoSet() {
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size()<7) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		return lotto;
	}
	



	/*
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하여
	 	반환하는 메서드를 작성 후 테스트
	 */
	public ArrayList<Integer> getLottoList() {
		return new ArrayList<>(getLottoSet());
	}

	/*
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 int[]을 생성하여
	 	반환하는 메서드를 작성 후 테스트
	 */
	
	public Integer[] getLottoArray() {
		return getLottoList().toArray(new Integer[7]);
	}
	
	public int[] getLottoArray2() {
		Integer[] lotto = getLottoArray();
		int[] result = new int[7];
		
		for (int i = 0; i < 7; ++i) {
			result[i] = lotto[i];
		}
	
		return result;
	}

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();

	System.out.println(lotto);

	}

}	
	/*
	 
	 내가 한 얼레벌레...
 public static void main(String[] args) {
	
	HashSet<Integer> lotto = new HashSet<Integer>();
	
	Random ran = new Random();

	while(lotto.size()<6)
	{
		int number = 1 + ran.nextInt(45);
		lotto.add(number);
	}
	System.out.println(lotto);
 	}
 }

	//중복을 없앤다
	ArrayList<String> lotto_list = new ArrayList<>(lotto);
	Collections.sort(lotto_list);
	System.out.println(lotto_list);
	
	Object[] arr1 = lotto.toArray();
	System.out.println("배열로 변환된 lotto: " + Arrays.toString(arr1));
	
	*/
