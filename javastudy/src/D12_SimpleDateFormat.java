import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_SimpleDateFormat {

	
	/*
	 
	 	# SimpleDatesFormat Ŭ����
	 	
	 	- �����ϰ� ��¥ �ν��Ͻ��� ���ڷ� ��ȯ�� �� �մ� Ŭ����
	 
		# ��¥ ����
		
		y : ��
		M : ��
		d : ��
		D : �� ���� ���� �� (1~365��)
		H : 24��1
		h : 12��
		m : ��
		s : ��
		
		E : ����
		a : ����/����
		
		w : day of week in year
		W : day of week in month
		
	 */
	
	public static void main(String[] args) {
		
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/mm/dd (DDD) a HH:mm:ss.SSS EEEE w W");
		
		System.out.println(f1.format(Calendar.getInstance().getTime()));
		
		
	}
}
