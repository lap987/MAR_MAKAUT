import java.util.Scanner;

public class Customers {
	String Name;
	String MobileNo;
	double feedBackRating;
	
	public Customers()
	{
		Name="";
		MobileNo="";
		feedBackRating=0.0;
	}
	
	public Customers(String Name,String MobileNo,double feedBackRating)
	{
		this.Name=Name;
		this.MobileNo=MobileNo;
		this.feedBackRating=feedBackRating;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
		
	}
	
	public void setMobileno(String MobileNo)
	{
		this.MobileNo=MobileNo;
		
	}
	
	public void setfeedBackRating(double feedBackRating)
	{
		this.feedBackRating=feedBackRating;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String getMobileNo()
	{
		return MobileNo;
	}
	
	public double getfeedBackRating()
	{
		return feedBackRating;
	}
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no of customer for the fedback:");
		int n=sc.nextInt();
		
		String mob;
		
		Customers[] cust=new Customers[n];
		
		for(int i=0;i<cust.length;i++)
		{
			System.out.println("enter the customer mobile no");
			mob=sc.next();
			cust[i]=new Customers();
			cust[i].setMobileno(mob);
			System.out.println("enter the name of the customer");
			String nam=sc.next();
			cust[i].setName(nam);
			System.out.println("enter the rating(out of 5)");
			double rat=sc.nextDouble();
			cust[i].setfeedBackRating(rat);
			
			
			
		}
		for(int i=0;i<cust.length;i++)
		{
			System.out.println(cust[i].getMobileNo()+" "+cust[i].getName()+" "
					+cust[i].getfeedBackRating());
		}
	}
	

}
