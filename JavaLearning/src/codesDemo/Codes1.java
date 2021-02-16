package codesDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Codes1{

	static int countD;
	static int countAl;
	static int countSp;
	static String Al = "";
	static String D = "";
	static String Sp = "";

	public static void FindNumeric(String key) {

		char[] keyword = key.replace(" ", "").toLowerCase().toCharArray();
		System.out.println(keyword);
		for (int i = 0; i < keyword.length; i++) {
			if (Character.isDigit(keyword[i])) // can do with key.charAt(i);
			{
				// character.is

				countD++;
				D = D + keyword[i];

			} else if (Character.isAlphabetic(keyword[i])) {
				countAl++;
				Al = Al + keyword[i];
			} else {
				countSp++;
				Sp = Sp + keyword[i];
			}

		}
		System.out.println("Alphabets are " + Al + " and count is " + countAl);
		System.out.println("Digits are " + D + " and count is " + countD);
		System.out.println("Special chars are " + Sp + " and count is " + countSp);

	}

	public static void AlterLetters(String str) {

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			String finalWord = "";
			if (arr[i].length() > 1) {
				String word = arr[i];
				String newWord = "";
				for (int j = 0; j < word.length() - 1; j += 2) {
					newWord = newWord + word.charAt(j + 1);
					// finalWord= finalWord+newWord;

				}
				finalWord = finalWord + newWord;

				System.out.print(finalWord);
			}
		}

	}

	public static void Regexp(String regexp)
	{
		Pattern p = Pattern.compile("[a-z]{3}[0-9]{1}");
		Matcher m = p.matcher(regexp);
		while(m.find())
		{
			System.out.println(m.group());
			
		}
		System.out.println(m.groupCount());
	}
	
	public static void Regexp_Email(String email)
	{
		Pattern p = Pattern.compile("[a-zA-Z0-9]{6,}[@]{1}[a-z]{5,}[.com]{4}");
		Matcher m = p.matcher(email);
		while(m.find())
		{
			System.out.println(m.group());
		}
		
	}
	
	public static void StringRev(String rev)
	{
		String strr="";
		for(int i=rev.length()-1;i>=0;i--)
		{
			strr = strr+rev.charAt(i);
			
		}
		System.out.println(strr);
		
		String[] arr = strr.split(" ");
		System.out.println(arr[1]+" "+arr[0]);
		
	}
	
	public static void main(String[] args) {
		
		/*FindNumeric("Sumit12ra  jhans##ssfdgasfdg        yfegawufkjnbfcbsa375986  736984::;;''''*****&*^%$      #@%^*FDXD$#^%^&gfdd 6876879&&66%%465 474^^&**))@HWHWH@HHHH");
		AlterLetters("India is a great country");
		Regexp("Sumit12ra  jhans##ssfdgasfdg        yfegawufkjnbfcbsa375986  736984::;;''''*****&*^%$      #@%^*FDXD$#^%^&gfdd 6876879&&66%%465 474^^&**))@HWHWH@HHHH");
		Regexp_Email("wfddsdjnsfnkfnsfsumit@gmail.comjfdwkwefkjwkjef46823642325dileep@hotmail.com");
*/
		StringRev("Sumit rajhans");
	}

}
