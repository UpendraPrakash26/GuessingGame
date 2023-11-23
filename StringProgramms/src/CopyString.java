import  java.util.*;
public class CopyString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String original=scan.nextLine();
		String copy="";
		System.out.println("The String is :"+original);
		for(int i=0;i<original.length();i++)
		{
			copy=copy+original.charAt(i);
		}
		System.out.println("Copy of the String is :"+copy);
	}

}
