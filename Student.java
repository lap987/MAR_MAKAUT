
public class Student 
{
	int StudentId;
	String StudentName;
	float marks;
	boolean secondChance;
	
	public Student(int StudentId,String StudentName,boolean secondChance)
	{
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.secondChance=secondChance;
	}
	
	public int getStudentId()
	{
		return StudentId;
	}
	
	public String getStudentName()
	{
		return StudentName;
	}
	
	public float getMarks()
	{
		return marks;
	}
	
	public boolean getsecondChance()
	{
		return secondChance;
		
	}
	
	public void identifyMarks(float marks)
	{
		if(secondChance=false)
		{
			this.marks=marks;
		}
		
		else
			this.marks=(float) 0.0;
		
	}
	
	public void identifyMarks(float marks, float marks)
	{
		if(secondChance=true)
		{
			
		}
	}
}
