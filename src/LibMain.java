import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LibMain {

	public static void main(String[] args) 
	{	
		
		boolean temp = false;
		BufferedReader br;
		String selectMenuNum;
		while(!temp)
		{
			System.out.println("   ====================================�������� ���α׷�=====================================");		
			System.out.println();
			System.out.println("   ========================================�޴�=========================================");
			System.out.println(" <<1.ȸ������, 2.���ȸ������, 3.å���, 4.��� å ����, 5.�뿩, 6.�뿩����Ʈ, 7.�ݳ�, 8.ȸ��Ż��  9. EXIT>> ");
			System.out.println("   ====================================================================================");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			try 
			{
				System.out.print("�׸��� �����ϼ��� : ");
				selectMenuNum = br.readLine();		
				int numSelec = Integer.parseInt(selectMenuNum);		// String -> Integer ĳ����

				// �޴� ���ÿ� ���� �б�
				if		(numSelec == 1) { new MembersRegi(); 	}		// ȸ������
				else if	(numSelec == 2) { new AllMemberShow();	}		// ��� ��� ����Ʈ ����
				else if	(numSelec == 3) { new BookRegi();   	}		// å���
				else if	(numSelec == 4) { new AllBookShow();  	}		// ���å ����Ʈ
				else if	(numSelec == 5) { new BooksBorrow();	}		// å �뿩
				else if	(numSelec == 6) { new BorrBookShow(); 	}		// å �뿩 ����Ʈ
				else if	(numSelec == 7) { new BooksReturn();	}		// å �ݳ�
				else if (numSelec == 8) { new MembersWithDraw();}		// ȸ��Ż��
				else if	(numSelec == 9)									// BookManager Exit
				{
					temp = true;
					System.out.println("Exit BookManager");		// BookManager ���� �޽���
					System.exit(0);
				}
				else { System.out.println("���� �޴��Դϴ�"); }		// �޴��� ���� ���� �������� ��
			} 
			catch(IOException e) { e.printStackTrace(); }
			catch(NumberFormatException e) { System.out.println("���ڸ� �Է����ּ���!"); }		// ���ڰ� �ƴ� �� �Է����� ��
		}
	}

}

