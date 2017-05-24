import java.util.Iterator;
import java.util.Scanner;


public class BooksBorrow {
	private Scanner sc = new Scanner(System.in);
	private int borrowBookIdx;
	private int allBookNum;
	
	private String borrowBookTitle;
	private String lenderId;
	
	
	public BooksBorrow()
	{
		System.out.println(" BOOK �뿩 ");
		System.out.println("�뿩�� id �Է� : ");
		lenderId = sc.nextLine();
		if(constants.isRegistId(lenderId))		
		{
			System.out.println("��ϵ� ����ڳ׿�!");		// ��ϵ� ����� �˸� �޽��� 
		}
		else 
		{
			System.out.println("��ϵ��� ���� ����� �Դϴ�! \n ȸ�������� ���� �ϼ���");	// ��ϵ��� ���� ����� �˸� �޽���
			return;
		}
		System.out.println("���� å ��ȣ : ");
		try
		{
			borrowBookIdx = sc.nextInt()-1;					// �뿩�Ϸ��� å ��� ��ȣ
			allBookNum = constants.allBookList.size();		// ���� ��ϵ� å�� �� �Ǽ�
		} catch(Exception e) { System.out.println("���� å�� Index�� �Է��ϼ���."); }
		
		if(allBookNum <= borrowBookIdx)
		{
			System.out.println("�������� �ʴ� ��ȣ �Դϴ�");		// �������� �ʴ� ��Ϲ�ȣ �޽���
			return;
		}
		else if(constants.allBookList.get(borrowBookIdx).isBorrowed())
		{
			System.out.println("�뿩���̿��� �̹�");			// �ش� å �뿩 �� �޽���
			return;
		}
		else 												// �ش� å �뿩 ���� & �뿩 ������ ����� ���
		{
			try 
			{
				borrowBookTitle = constants.allBookList.get(borrowBookIdx).getBookTitle();		// �뿩�Ϸ��� å ����
				constants.allBookList.get(borrowBookIdx).setBookLender(lenderId);				// å ������ �뿩�� �̸� ����
				constants.allBookList.get(borrowBookIdx).setBorrowed(true);						// å �뿩�� ǥ��
				constants.borrowBookList.put(borrowBookTitle, lenderId);						// (key:å����, value:�뿩��)
			} catch(Exception e) 
			{
				System.out.println("�������� �ʴ� ��ȣ �Դϴ�.");		// �������� �ʴ� ��Ϲ�ȣ �޽���
				return;
			}
		}
		System.out.println("å �뿩 ����!");	// �뿩 �Ϸ� �޽���
	}



}
