import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class constants {

	//  å ����Ʈ ����
	public static ArrayList<BookInfor> allBookList  = new ArrayList<BookInfor>();			// ��� å ����Ʈ
	public static Map<String, String> borrowBookList = new HashMap<String, String>();	// �뿩�� å (key : å����, value : �뿩��)	
	//ȸ�� ���� 
	public static ArrayList<MembersInfor> allMemberList  = new ArrayList<MembersInfor>();	// ��� ȸ�� ����Ʈ

	public static boolean isRegistMember1(String memberName)
	{
		for (int i = 0; i < allMemberList.size(); i++) 
		{
			if(allMemberList.get(i).getMemberName().equals(memberName)) { return true; }
		}
		return false;
	} // �̸����� ��ϵ� ȸ������ Ȯ��


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
	}// id �˻�
	
}


