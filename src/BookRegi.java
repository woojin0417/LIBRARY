import java.util.Scanner;

	public class BookRegi 
	{
		private String bookTitle;
		private Scanner sc = new Scanner(System.in);
		public BookRegi()
		{
			System.out.println(" BOOK Register ");
			System.out.println("����� å ���� : ");
			bookTitle = sc.nextLine();		// å����
			
			BookInfor bookInfo = new BookInfor(bookTitle);	
			constants.allBookList.add(bookInfo);		// ���ο� å ���
			
			System.out.println("���ο� å ����� �Ϸ� ");		// ���ο� å ��� �Ϸ� �޽���
		}
	}

