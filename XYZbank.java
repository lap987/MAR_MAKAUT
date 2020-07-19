

class Customer
{
	int custId;
	String custName;
	String custAddress;
	String custState;
	String accType;
	double custBalance;
	
	
	
	public Customer(int custId, String custName, String custAddress, String custState) {
		// TODO Auto-generated constructor stub
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
		this.custState=custState;
	}

	public Customer(int custId, String custName) {
		// TODO Auto-generated constructor stub
		this.custId=custId;
		this.custName=custName;
	}

	public Customer(int custId, String custName, String custAddress, String custState,String accType,double custBalance) {
		// TODO Auto-generated constructor stub
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
		this.custState=custState;
		this.accType=accType;
		this.custBalance=custBalance;
	}

	public void setcustId(int custId)
	{
		this.custId=custId;
	}
	
	public void setcustName(String custName)
	{
		this.custName=custName;
	}
	
	public void setcustAddress(String custAddress)
	{
		this.custAddress=custAddress;
	}
	public void setcustState(String custState)
	{
		this.custState=custState;
	}
	
	public void setcustType(String accType)
	{
		this.accType=accType;
	}
	
	public void setcustBalance(double custBalance)
	{
		this.custBalance=custBalance;
	}
	
	public int setcustId()
	{
		return custId;
	}
	
	public String setcustName()
	{
		return custName;
	}
	
	public String setcustAddress()
	{
		return custAddress;
	}
	
	public String setcustState()
	{
		return custState;
	}
	
	public String setaccType()
	{
		return accType;
	}
	
	public double setcustBalance()
	{
		return custBalance;
	}
}
public class XYZbank 
{
	public static void main(String[] args)
	{
		Customer customer1=new Customer(1001,"Kumar","Rajajinagar","Banglore-10");
		Customer customer2=new Customer(1002,"Raja");
		Customer customer3=new Customer(1003,"Shanti","Jayanagar","Banglore-20","SB",1500);
		
		System.out.println(customer1.setcustId()+" "+customer1.setcustName()+" "+customer1.setcustAddress()+" "
		+customer1.setcustState());
		
		System.out.println(customer2.setcustId()+" "+customer2.setcustName());
		
		System.out.println(customer3.setcustId()+" "+customer3.setcustName()+" "+customer3.setcustAddress()+" "
		+customer3.setcustState()+" "+customer3.setaccType()+" "+customer3.setcustBalance());
	}

}


