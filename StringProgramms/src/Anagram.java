import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Care";
		String s2="racR";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[]ch1=s1.toCharArray();
		char[]ch2=s1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("It is Anagram");
		}else
		{
			System.out.println("It is not Anagram");
		}
	}

}
