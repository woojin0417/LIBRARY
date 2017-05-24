import java.util.Scanner;

public class MembersWithDraw {

	private String memberId;
	private String memberPw;

	public MembersWithDraw()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		while(true)
		{
			memberId=sc.nextLine();	
			if(!constants.isRegistId(memberId) )
			{
				System.out.println("없는 아이디 입니다 다시 입력하세요 : ");
			}
			else
			{
				System.out.print("비밀번호입력 : ");
				memberPw=sc.nextLine();
				for(int i=0 ; i<constants.allMemberList.size();i++)
				{
					if(constants.allMemberList.get(i).getmemberId().equals(this.memberId))
					{
						constants.allMemberList.remove(i);
					}
				}
				System.out.println("회원 탈퇴 완료 ");

				break;				
			}
		}


	}
}
