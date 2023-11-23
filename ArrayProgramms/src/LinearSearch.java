import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter the element to be find");
		int num=sc.nextInt();
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{	found=true;
				System.out.println("Element "+num+" is found @: "+i ); 
			}
		}
		if(!found)
		{
			System.out.println("Element not found");
		}
		

	}

}
