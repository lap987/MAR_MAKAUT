
public class Employee 
{
	int empId;
	String empName;
	String empDesig;
	String empDept;
	
	public void setempName(String empName)
	{
		if(empName.isEmpty())
		{
			throw new NullPointerException("name is not entered");
		}
		else this.empName=empName;
	}
	
	public void setEmpDesig(String empDesig)
	{
		this.empDesig=empDesig;
	}
	
	
	
	public String getempName()
	{
		return empName;
	}
	
	public String getempDesig()
	{
		return empDesig;
	}
	
	public static void main(String[] args)
	{
		Employee Emp=new Employee();
		Emp.setempName("");
		System.out.println(Emp.getempName());
		//Emp.setEmpDesig("lead");
		//System.out.println(Emp.getempDesig());
	}

}
