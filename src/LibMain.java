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
			System.out.println("   ====================================도서관리 프로그램=====================================");		
			System.out.println();
			System.out.println("   ========================================메뉴=========================================");
			System.out.println(" <<1.회원가입, 2.모든회원보기, 3.책등록, 4.모든 책 보기, 5.대여, 6.대여리스트, 7.반납, 8.회원탈퇴  9. EXIT>> ");
			System.out.println("   ====================================================================================");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			try 
			{
				System.out.print("항목을 선택하세요 : ");
				selectMenuNum = br.readLine();		
				int numSelec = Integer.parseInt(selectMenuNum);		// String -> Integer 캐스팅

				// 메뉴 선택에 따른 분기
				if		(numSelec == 1) { new MembersRegi(); 	}		// 회원가입
				else if	(numSelec == 2) { new AllMemberShow();	}		// 모든 멤버 리스트 보기
				else if	(numSelec == 3) { new BookRegi();   	}		// 책등록
				else if	(numSelec == 4) { new AllBookShow();  	}		// 모든책 리스트
				else if	(numSelec == 5) { new BooksBorrow();	}		// 책 대여
				else if	(numSelec == 6) { new BorrBookShow(); 	}		// 책 대여 리스트
				else if	(numSelec == 7) { new BooksReturn();	}		// 책 반납
				else if (numSelec == 8) { new MembersWithDraw();}		// 회원탈퇴
				else if	(numSelec == 9)									// BookManager Exit
				{
					temp = true;
					System.out.println("Exit BookManager");		// BookManager 종료 메시지
					System.exit(0);
				}
				else { System.out.println("없는 메뉴입니다"); }		// 메뉴에 없는 것을 선택했을 때
			} 
			catch(IOException e) { e.printStackTrace(); }
			catch(NumberFormatException e) { System.out.println("숫자를 입력해주세요!"); }		// 숫자가 아닌 값 입력했을 때
		}
	}

}

