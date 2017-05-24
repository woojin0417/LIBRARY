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
		System.out.println(" BOOK 대여 ");
		System.out.println("대여자 id 입력 : ");
		lenderId = sc.nextLine();
		if(constants.isRegistId(lenderId))		
		{
			System.out.println("등록된 사용자네요!");		// 등록된 사용자 알림 메시지 
		}
		else 
		{
			System.out.println("등록되지 않은 사용자 입니다! \n 회원가입을 먼저 하세요");	// 등록되지 않은 사용자 알림 메시지
			return;
		}
		System.out.println("빌릴 책 번호 : ");
		try
		{
			borrowBookIdx = sc.nextInt()-1;					// 대여하려는 책 등록 번호
			allBookNum = constants.allBookList.size();		// 현재 등록된 책의 총 권수
		} catch(Exception e) { System.out.println("빌릴 책의 Index를 입력하세요."); }
		
		if(allBookNum <= borrowBookIdx)
		{
			System.out.println("존재하지 않는 번호 입니다");		// 존재하지 않는 등록번호 메시지
			return;
		}
		else if(constants.allBookList.get(borrowBookIdx).isBorrowed())
		{
			System.out.println("대여중이에요 이미");			// 해당 책 대여 중 메시지
			return;
		}
		else 												// 해당 책 대여 가능 & 대여 가능한 사람인 경우
		{
			try 
			{
				borrowBookTitle = constants.allBookList.get(borrowBookIdx).getBookTitle();		// 대여하려는 책 제목
				constants.allBookList.get(borrowBookIdx).setBookLender(lenderId);				// 책 정보에 대여자 이름 저장
				constants.allBookList.get(borrowBookIdx).setBorrowed(true);						// 책 대여중 표시
				constants.borrowBookList.put(borrowBookTitle, lenderId);						// (key:책제목, value:대여자)
			} catch(Exception e) 
			{
				System.out.println("존재하지 않는 번호 입니다.");		// 존재하지 않는 등록번호 메시지
				return;
			}
		}
		System.out.println("책 대여 성공!");	// 대여 완료 메시지
	}



}
