
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class BooksReturn 
{
	private Scanner sc = new Scanner(System.in);
	private String bookBorrower;
	private int selectNum;
	private ArrayList<String> bookList = new ArrayList<String>();
	public BooksReturn()
	{
		String bookTitle;
		String retrunBookTitle;
		System.out.println(" BOOK �ݳ� ");
		System.out.println("id �Է�");
		bookBorrower = sc.nextLine();		// �뿩�� �̸�
		System.out.println("�ݳ��� å ����");
		Iterator<String> keySet = constants.borrowBookList.keySet().iterator();

		for (int i = 0; i < constants.borrowBookList.size(); i++) 
		{
			bookTitle = keySet.next();
			System.out.println("" + (i+1) + ". " + bookTitle);
			bookList.add(bookTitle);
		}
		System.out.print("å ���� : ");
		try 
		{
			selectNum = (sc.nextInt() - 1);
			if( selectNum > constants.borrowBookList.size() ) 
			{
				System.out.println("�߸� ���� �߾��");		// ����Ʈ�� ���� index ����
				return;
			} 
			else		// �ݳ� ����
			{
				retrunBookTitle = bookList.get(selectNum);
				if(bookBorrower.equals(constants.borrowBookList.get(retrunBookTitle)))	// �ݳ��Ϸ��� ����� ���� �ش�å�� �ݳ��� ����� ��ġ�ϸ�
				{
					constants.borrowBookList.remove(retrunBookTitle);
					for (int i = 0; i < constants.allBookList.size(); i++) 
					{
						if(constants.allBookList.get(i).getBookTitle().equals(retrunBookTitle))
						{
							constants.allBookList.get(i).setBorrowed(false);
						}
					}
					System.out.println("�ݳ��� �Ϸ�Ǿ����ϴ�");
				}
				else 
				{
					System.out.println("�ش�å�� ���� ����� �ƴϿ���");		// �ݳ��Ϸ��� å�� �뿩�ڰ� �ƴϾ �ݳ� �Ұ�
					return;
				}
			}
		} 
		catch(Exception e) { System.out.println("������ ������ å�� �ε����� �Է��ϼ���"); return; }		// ���ڰ� �ƴ� �� �Է����� ��
	}
}

