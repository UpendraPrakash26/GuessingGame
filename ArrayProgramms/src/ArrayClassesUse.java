import java.util.Arrays;
import java.util.*;
public class ArrayClassesUse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]a=new int[5];
		for(int element:a)
		{
			System.out.print(element);
		}
		System.out.println();
		//to fill the elements of array with same number throughout
		Arrays.fill(a,5);
		for(int element:a)
		{
			System.out.print(element);
		}
		System.out.println();
		//to replace a sequence of values from one index value 
		//till required index with an element
		int[]b= {1,2,3,0,0,4,5,6};
		Arrays.fill(b, 3, 6, 10);
		for(int element:b)
		{
			System.out.print(element+" ");
		}
		System.out.println();
		// method used to store an array
		System.out.println("Sorted Array");
		int[]c= {30,2,56,1,4,96};
		Arrays.sort(c);
		for(int element:c)
		{
			System.out.print(element+" ");
		}
		System.out.println();
		//method to perform BinarySearch in an array
		System.out.println("Element to found");
		int key=sc.nextInt();
		int result=Arrays.binarySearch(c, key);
		System.out.println(result);

	}

}
