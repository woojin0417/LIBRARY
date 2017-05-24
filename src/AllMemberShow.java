public class AllMemberShow {

	public AllMemberShow()
	{
		System.out.println();
		System.out.println(" 모든 회원 LIST ");				
		for (int i = 0; i < constants.allMemberList.size(); i++) 	// 각 Column에 해당하는 값
		{

			System.out.println("" + (i+1) + ". "+  constants.allMemberList.get(i).getMemberName() + " "+ constants.allMemberList.get(i).getmemberId() );
		}
		System.out.println("모든 회원 조회 완료");	
	}
}
