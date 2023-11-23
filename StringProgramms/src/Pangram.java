
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		String s1="THE QUICK BROWN FOX JUMPES OVER THE LAZY DOG";
		s1=s1.replace(" ", "");
		System.out.println("modified String is :"+s1);
		char[]ch=s1.toCharArray();
		int[]ar=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;
		} 
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("Not pangram");
				flag=false;
			}	 
		}
		if(flag==true)
		{
			System.out.println("pangram ");
		}
		 

	}

}
