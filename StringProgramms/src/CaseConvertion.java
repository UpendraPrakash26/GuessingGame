import java.util.*;
public class CaseConvertion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2="";
		String s3="";
		System.out.println("The String is:"+s1);
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+(char)(s1.charAt(i)-32);
		}
		System.out.println("Lower to Upper: "+s2);
		for(int i=0;i<s2.length();i++)
		{
			s3=s3+(char)(s2.charAt(i)+32);
		}
		System.out.println("Upper to Lower; "+s3);

	}

}
