import java.util.Scanner;

	public class BookRegi 
	{
		private String bookTitle;
		private Scanner sc = new Scanner(System.in);
		public BookRegi()
		{
			System.out.println(" BOOK Register ");
			System.out.println("등록할 책 제목 : ");
			bookTitle = sc.nextLine();		// 책제목
			
			BookInfor bookInfo = new BookInfor(bookTitle);	
			constants.allBookList.add(bookInfo);		// 새로운 책 등록
			
			System.out.println("새로운 책 등록이 완료 ");		// 새로운 책 등록 완료 메시지
		}
	}

