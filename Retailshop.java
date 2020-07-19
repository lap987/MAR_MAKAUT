import java.util.Scanner;

public class Retailshop 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int itemid[]=new int[5];
		int p=5001;
		double itemprice[]=new double[5];
		for(int i=0;i<5;i++,p++)
		{
			itemid[i]=p;
			System.out.println("itemprice of item "+itemid[i]);
			itemprice[i]=sc.nextDouble();
		}
		
		System.out.println("the item Id and item Price are");
		for(int i=0;i<5;i++)
		{
			System.out.println(itemid[i]+"::"+itemprice[i]);
		}
		
		System.out.println("enter the item id");
		int n=sc.nextInt();
		searchingitem(itemid,itemprice,n);
		
		
	}
	
	static void searchingitem(int itemid[],double itemprice[],int k)
	{
		int p=0;
		Scanner qt=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			if(itemid[i]==k)
			{
				p=1;
			}
		}
		if(p==1)
		{
			System.out.println("the item is found");
			System.out.println("enter the quantity purchased");
			int qty=qt.nextInt();
			ComputeBill(itemid,itemprice,qty);
		}
		else System.out.println("the item is not found");
	}
	
	static void ComputeBill(int itemid[],double itemprice[],int qty)
	{
		int i=0;
		double bill=qty*itemprice[i];
		System.out.println("the bill id is 8893");
		System.out.println("the customer id is 1233");
		System.out.println("the purchase id is 9845");
		System.out.println("the discount on the item is 0.0");
		System.out.println("the bill amount is "+bill);
		
	}

}
