import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {

	/*
	 	# Á¤±ÔÇ¥Çö½Ä (Regular Expression)
	 	
	 	- ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â Ç¥Çö½Ä
	 	- Æ¯Á¤ ÇÁ·Î±×·¡¹Ö ¾ğ¾î¿¡ Á¾¼ÓµÇÁö ¾Ê´Â´Ù
	 	 - ÇÁ·Î±×·¡¸Ó°¡ ¿øÇÏ´Â ¹®ÀÚ¿­ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´ÂÁö °Ë»çÇÒ ¶§ »ç¿ëÇÑ´Ù
	 	 
	 	 # Pattern Å¬·¡½º
	 	 
	 	 - Á¤±ÔÇ¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º
	 	 
	 	 # Match Å¬·¡½º
	 	 
	 	 - ÆĞÅÏ ÀÎÅÍÆäÀÌ½º¸¦ ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­À» °Ë»çÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regec, input) : inputÀÌ regex¿¡ ¸ÅÄ¡µÇ´Â ¹®ÀÚ¿­ÀÎÁö¸¦ °Ë»çÇØÁÖ´Â ¸Ş¼­µå
		System.out.println(Pattern.matches("sleep","sleEp"));

		// [] : ÇØ´ç À§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã ¼ö ÀÖ´ÂÁö Á¤ÀÇÇÏ´Â Ç¥Çö½Ä
		System.out.println(Pattern.matches("s[lh@]eep","sleep"));
		System.out.println(Pattern.matches("s[lh@]eep","sheep"));
		System.out.println(Pattern.matches("s[lh@]eep","s@eep"));

		/*
		 	[] ³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Íµé
		 	
		 	1. abc : ÇØ´ç ÀÚ¸®¿¡ a ¶Ç´Â b ¶Ç´Â c¸¦ Çã¿ë
		 	2. ^abc : ÇØ´ç ÀÚ¸®¿¡ abc¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» ÇÏ¿ë
		 	3. a-z : aºÎÅÍ z±îÁö ¸ğµÎ Çã¿ë
		 	4. && : ±³ÁıÇÕ
		 */
		System.out.println(Pattern.matches("s[^lh@]eep","s\\eep"));
		System.out.println(Pattern.matches("s[0-9a-z]eep","s0eep"));
		System.out.println(Pattern.matches("s[0-9]eep","s0eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep","sceep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep","sfeep"));

		/*
		 	¿©·¯ ¹®ÀÚ¸¦ ³ªÅ¸³»´Â °Íµé
		 	
		 	1.  . : ¸ğµç ¹®ÀÚ
		 	2. \d : ¸ğµç ¼ıÀÚ
		 	3. \D : ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç °Í
		 	4. \s : ¸ğµç °ø¹é (\t\n .. µîÀÇ ¸ğµç °ø¹é)
		 	5. \S : °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç °Í
		 	6. \w : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë [a-zA-Z0-9]
		 	7. \W : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		 */
		System.out.println("¹®ÀÚ==========");
		System.out.println(Pattern.matches("s.eep","sheep")); //¸ğµç ¹®ÀÚ
		System.out.println(Pattern.matches("s[.]eep","sheep")); // .¸¸ Çã¿ë
		System.out.println(Pattern.matches("s\\.eep","sheep")); // .¸¸ Çã¿ë

		System.out.println("¼ıÀÚ==========");
		System.out.println(Pattern.matches("s\\deep","s9eep")); // ¼ıÀÚ¸¸ Çã¿ë
		System.out.println(Pattern.matches("\\D\\D\\D", "cat")); // ¼ıÀÚ Á¦¿Ü Çã¿ë

		System.out.println("°ø¹é==========");
		System.out.println(Pattern.matches("s\\seep","s eep"));
		System.out.println(Pattern.matches("s\\seep","saeep"));
		System.out.println(Pattern.matches("s\\seep","s\teep"));
		System.out.println(Pattern.matches("s\\seep","s\neep"));
		System.out.println(Pattern.matches("s\\seep","s\reep"));
		
		System.out.println(Pattern.matches("s\\Seep","s eep"));
		
		System.out.println(Pattern.matches("s\\Seep","s eep"));
		
		/*
		 	ÇØ´ç ÆĞÅÏÀÌ Àû¿ëµÉ ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇÇÏ´Â ¹æ¹ı
		 	
		 	1. [ex]{n} : {}¾ÕÀÇ ÆĞÅÏÀÌ n°³ ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 	2. [ex]{n,m} : {}¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ ÀÌ»ó, ÃÖ´ë m°³(mÆ÷ÇÔ) ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 		* Á¤±ÔÇ¥Çö½Ä¿¡ {n,m}Ã³·³ °ø¹éÀ» ³ÖÀ¸¸é ¾ÈµÈ´Ù
		 	3. [ex]{n,} : {} ¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ ÀÌ»ó ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 	4. [ex]? : 0¹ø ¶Ç´Â ÇÑ¹ø
		 	5. [ex]+ : ÃÖ¼Ò ÇÑ¹ø ÀÌ»ó
		 	6. [ex]* : 0¹ø ¶Ç´Â ¿©·¯¹ø	
		 */
		
		System.out.println(Pattern.matches("[\\D3-5]{3}\\.txt","345!!.txt"));
		System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt","3!.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt","¾È³ç.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt","¾È³çÇÏ¼¼¿ä.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt","hi.txt"));

		String regex1 = String.format(".{%d,}\\.txt", 2);
		System.out.println(Pattern.matches(regex1,"abcd.txt"));

		System.out.println(Pattern.matches("[°¡-ÆR]{2,}?\\.txt",".txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}?\\.txt","ÇÑ.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}?\\.txt","ÇÑ±Û.txt"));

		// ÀüÈ­¹øÈ£ Á¤±ÔÇ¥Çö½Ä
		System.out.println(Pattern.matches("\\d{3}-?\\{3,4}-?\\d{4}","01012341234"));
		System.out.println(Pattern.matches("\\d{3}-?\\{3,4}-?\\d{4}","0101234123"));
		System.out.println(Pattern.matches("\\d{3}-?\\{3,4}-?\\d{4}","010-1234-1234"));
		System.out.println(Pattern.matches("\\d{3}-?\\{3,4}-?\\d{4}","010-123-1234"));

		// ¿¬½À¹®Á¦ : ÀÚ¹Ù¿¡¼­ Çã¿ëÇÏ´Â º¯¼ö¸íÀ» °Ë»çÇÒ ¼ö ÀÖ´Â Á¤±ÔÇ¥Çö½ÄÀ» ¸¸µé¾îº¸¼¼¿ä
		
		System.out.println(Pattern.matches("^[a-zA-Z_$][\\*$]*$","abc"));
		System.out.println(Pattern.matches("^[\\D&&\\S$$\\w$°¡-ÆR][\\w$°¡-ÆR]*$","_±è±è±è"));
		
		/*
		 	# Pattern.compile (regex)
		 	
		 	- Àü´ŞÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÇØ¼®ÇÏ¿© Pattern ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ°í ¹İÈ¯ÇÑ´Ù
		 	- PatternÅ¸ÀÔ ÀÎ½ºÅÏ½º¸¦ ¿ä±¸ÇÏ´Â °÷¿¡ »ç¿ëÇÒ ¼ö ÀÖ´Ù
		 	
		 	# split() : ÄÄÆÄÀÏµÈ ÆĞÅÏ ÀÎ½ºÅÏ½º·Î slit()À» ÁøÇàÇÑ´Ù
		 	
		 	# matcher() : Matcher ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ¿© ¹İÈ¯ÇÑ´Ù
		 */
		String fruit_text = "apple/banana/orange/grape/peach/mango/redapple";
		
		Pattern regex = Pattern.compile("/");
		String[] fruits = regex.split(fruit_text);
		
		System.out.println(Arrays.toString(fruits));

		
		Pattern regex2 = Pattern.compile("[a-zA-Z]+");

		Matcher matcher = regex2.matcher(fruit_text);
		
		while (matcher.find()) {
			System.out.println("Ã£Àº °Í: " + matcher.group());
			System.out.println("À§Ä¡: " + matcher.start() + "ºÎÅÍ " + matcher.end() + "±îÁö");
			
		}
	}
}
