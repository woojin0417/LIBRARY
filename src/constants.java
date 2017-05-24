import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class constants {

	//  책 리스트 관리
	public static ArrayList<BookInfor> allBookList  = new ArrayList<BookInfor>();			// 모든 책 리스트
	public static Map<String, String> borrowBookList = new HashMap<String, String>();	// 대여된 책 (key : 책제목, value : 대여자)	
	//회원 관리 
	public static ArrayList<MembersInfor> allMemberList  = new ArrayList<MembersInfor>();	// 모든 회원 리스트

	public static boolean isRegistMember1(String memberName)
	{
		for (int i = 0; i < allMemberList.size(); i++) 
		{
			if(allMemberList.get(i).getMemberName().equals(memberName)) { return true; }
		}
		return false;
	} // 이름으로 등록된 회원인지 확인


	public static boolean isRegistMember(String lenderName) {
		return false;
	}
	
	public static boolean isRegistId(String memberId)
	{
		for (int i = 0; i < allMemberList.size(); i++) 
		{
			if(allMemberList.get(i).getmemberId().equals(memberId)) { return true; }
		}
		return false;
	}// id 검사
	
}


