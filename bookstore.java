

class Book
{
	String BooksTitle;
	double Price;
	int yearOfpub;
	String authorName;
	
	public void SetBooksTitle(String BooksTitle)
	{
		this.BooksTitle=BooksTitle;
	}
	
	public void setPrice(double Price)
	{
		this.Price=Price;
	}
	
	
	public void setyearOfpub(int yearOfpub)
	{
		this.yearOfpub=yearOfpub;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	
	public double getPrice()
	{
		return Price;
	}
	
	public String getBooksTitle()
	{
		return BooksTitle;
	}
	
	public int getyearOfpub()
	{
		return yearOfpub;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}
}



public class bookstore 
{
	public static void main(String[] args)
	
	{
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		
		b1.setAuthorName("Daniel Defoe");
		b1.SetBooksTitle("Robinson Crusoe");
		b1.setPrice(15.50);
		b1.setyearOfpub(1719);
		
		b2.setAuthorName("Joseph Conrad");
		b2.SetBooksTitle("Heart of Darkness");
		b2.setPrice(12.80);
		b2.setyearOfpub(1902);
		
		
		b3.setAuthorName("Pat Conroy");
		b3.SetBooksTitle("Beach Music");
		b3.setPrice(9.50);
		b3.setyearOfpub(1996);
		
		System.out.println("Author Name:"+b1.getAuthorName()+" \nbooks Title:"+b1.getBooksTitle()+"\nprice of the book: $"
		+b1.getPrice()+"\n year of publication:"+b1.getyearOfpub());
		
		System.out.println("\n\n\nAuthor Name:"+b2.getAuthorName()+"\nbooks Title:"+b2.getBooksTitle()+
				"\nprice of the book: $"+b2.getPrice()+"\nyear of publication:"+b2.getyearOfpub());
		
		System.out.println("\n\n\nAuthor Name:"+b2.getAuthorName()+"\nbooks Title:"+b2.getBooksTitle()+
				"\nprice of the book: $"+b2.getPrice()+"\nyear of publication:"+b2.getyearOfpub());
		
		
	}

}


