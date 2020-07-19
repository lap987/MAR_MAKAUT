import java.util.Scanner;
import java.util.TreeSet;

public class code23consecutive {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		str=tomyUpper(str);
		Consecutive(str);
	}
	
	public static String tomyUpper(String str)
	{
		String res="";
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				ch=(char) (str.charAt(i)-32);
			}
			else ch=(char)(str.charAt(i));
			
			res=res+ch;
		}
		return res;
	}
	public static void Consecutive(String string)
	{
		TreeSet<String> treeSetString=new TreeSet<String>();
		int len=string.length();
		for(int i=1;i<=len;i++)
		{
			String str=string;
			for(int j=1;j<=len-i;j++)
			{
				String pat=subStr(str,j-1,j+i);
				
				if(isConsecutive(pat))
				{
					int occhar=occureChars(str,pat);
					
					if(!treeSetString.contains(pat))
					{
						treeSetString.add(pat);
						System.out.println(pat+":"+occhar);
					}
				}
			}
		}
		
	}
	
	public static boolean isConsecutive(String str)
	{
		int len=str.length();
		for(int i=1;i<len;i++)
		{
			if((int)str.charAt(i)-(int)str.charAt(i-1)!=1)
				return false;
			
		}
		return true;
	}
	
	
	
	public static int occureChars(String string,String word)
	{
		int len=string.length();
		int l=word.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(word.equals(subStr(string,i,i+l)))
				count++;
			
		}
		return count;
	}
	
	public static String subStr(String string,int i,int j)
	{
		String temp="";
		int len=string.length();
		while(i<j && i<len)
		{
			temp+=string.charAt(i++);
		}
		return temp;
	}
	
	

}
