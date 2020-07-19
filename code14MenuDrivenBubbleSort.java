import java.util.Scanner;

public class code14MenuDrivenBubbleSort {
	public static void main(String[] args)
	{
		
		System.out.println("1.Binary search for int");
		System.out.println("2.Binary search for strings");
		System.out.println("3.exit");
		System.out.println("enter the choice");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		switch(n)
		{
		case 1:
			System.out.println("enetr the no of elements");
			int no=sc.nextInt();
			int arr[]=new int[no];
			for(int i=0;i<no;i++)
				arr[i]=sc.nextInt();
			System.out.println("enter the element to be searched");
			int key=sc.nextInt();
			int res=intBinary(arr,key);
			System.out.println(res);
			break;
			
		case 2:
			System.out.println("enter the number of strings");
			int s=sc.nextInt();
			String str1[]=new String[s];
			for(int i=0;i<s;i++)
			{
				str1[i]=sc.next();
			}
			System.out.println("enter the string to searched");
			String kit=sc.next();
			boolean r1=strBinary(str1,kit);
			System.out.println(r1);
			break;
			
		case 3:
			System.exit(0);
		}
		
		
	}
		

	
	static int intBinary(int arr[],int key)
	{
		InsertValue(arr);
		int low=0;
		int high=arr.length-1;
		int mid=(high+low)/2;
		while(low<=high)
		{
			
			if(arr[mid]==key)
				return mid+1;
			else if(arr[mid]>key)
				high=mid-1;
			else 
				low=mid+1;
			mid=(high+low)/2;
			
		}
		return 0;
	}
	
	static boolean strBinary(String str1[],String kit)
	{
		insertionSort(str1);
		int li=0;
		int hi=str1.length-1;
		int mi=(hi+li)/2;
		while(li<=hi)
		{
			int res=kit.compareTo(str1[mi]);
			if(res==0)
				return true;
			else if(res>0)
				hi=mi-1;
			else
				li=mi+1;
			mi=(hi+li)/2;
		}
		return false;
	}
	
	private static void InsertValue(int[] arr) {
		// TODO Auto-generated method stub
		int temp,j;
		for(int i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print( arr[i]+" ");
		}
		
	}
	
	static void insertionSort(String[] arr)
	{
		int j;
		String temp;
		for(int i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			if(j>0 && arr[j-1].compareTo(temp)>0)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		System.out.println("the insertion sort is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

	
