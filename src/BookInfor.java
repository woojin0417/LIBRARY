import java.util.Scanner;

public class BookInfor {

	private String bookTitle;		// 책 제목
	private String bookLender;		// 책 대여자 
	private String borrowDate;		// 책 대여일자	
	private boolean isBorrowed;		// 책 대여 여부
	
	public BookInfor(String bookTitle)
	{
		this.bookTitle = bookTitle;
		this.borrowDate= borrowDate;
		this.bookLender=bookLender;
		isBorrowed = false;			// 책을 최초 등록할 때는 무조건 대여중이지 않다.
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



