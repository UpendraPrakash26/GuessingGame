import java.util.Scanner;

public class BinarySearch {

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
		System.out.print("The array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be find");
		int key=sc.nextInt();
		int min=0;
		int max=a.length-1;
		while(min<=max)
		{
			int mid=(min+max)/2;
			if(a[mid]==key)
			{
				System.out.println(key+" Element found in  "+mid);
				break;
			}
			else if(key<a[mid])
			{
				max=mid-1;
			}
			else if(key>a[mid])
			{
				min=mid+1;
			}
		}
		if(min>max)
		System.out.println("Element not found");

	}

}
