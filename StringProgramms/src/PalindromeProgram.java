import java.util.*;
public class PalindromeProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2="";
		System.out.println("Entered String is :"+s1);
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+(s1.charAt(i));
		}
		System.out.println("Reversed String is :"+s2);
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindraome");
		}
	}

}
