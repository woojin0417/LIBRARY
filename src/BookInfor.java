import java.util.Scanner;

public class BookInfor {

	private String bookTitle;		// å ����
	private String bookLender;		// å �뿩�� 
	private String borrowDate;		// å �뿩����	
	private boolean isBorrowed;		// å �뿩 ����
	
	public BookInfor(String bookTitle)
	{
		this.bookTitle = bookTitle;
		this.borrowDate= borrowDate;
		this.bookLender=bookLender;
		isBorrowed = false;			// å�� ���� ����� ���� ������ �뿩������ �ʴ�.
	}

	public boolean isBorrowed() 
	{
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) 
	{
		this.isBorrowed = isBorrowed;
	}
	
	public String getBookTitle() 
	{
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) 
	{
		this.bookTitle = bookTitle;
	}

	public String getBookLender() 
	{
		return bookLender;
	}

	public void setBookLender(String bookLender) 
	{
		this.bookLender = bookLender;
	}
/*
	public String getBorrowDate() 
	{
		return borrowDate;
	}

	public void setLendDate(String borrowDate) 
	{
		this.borrowDate = borrowDate;
	}
*/

}



