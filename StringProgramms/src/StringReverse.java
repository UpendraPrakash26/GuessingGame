
public class StringReverse {

	public static void main(String[] args) {
//		String s1="ineuron java";
//		String s2="";
//		System.out.println("Method 1 of reversing");
//		for(int j=s1.length()-1;j>=0;j--)
//		{
//			char ch=s1.charAt(j);
//			s2=s2+(char)s1.charAt(j);
//		}
//		System.out.println(s2);
//		
//		System.out.println();
//		System.out.println("method 2 of reversing");
//		String []str=s1.split(" ");
//		String s3="";  
//		for(String a:str)
//		{
//			for(int i=a.length()-1;i>=0;i--)
//			{
//				s3=s3+(char)a.charAt(i);
//			}
//			s3=s3+" ";
//		}
//		System.out.println(s3);
//		
//		System.out.println();
		String ss="ineuron java";
		String ss2="";
		String ar[]=ss.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			ss2=ss2+ar[i]+" ";
		}
		System.out.println(ss);
		System.out.println(ss2);
	}

}
   