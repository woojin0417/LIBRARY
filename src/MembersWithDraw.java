import java.util.Scanner;

public class MembersWithDraw {

	private String memberId;
	private String memberPw;

	public MembersWithDraw()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		while(true)
		{
			memberId=sc.nextLine();	
			if(!constants.isRegistId(memberId) )
			{
				System.out.println("���� ���̵� �Դϴ� �ٽ� �Է��ϼ��� : ");
			}
			else
			{
				System.out.print("��й�ȣ�Է� : ");
				memberPw=sc.nextLine();
				for(int i=0 ; i<constants.allMemberList.size();i++)
				{
					if(constants.allMemberList.get(i).getmemberId().equals(this.memberId))
					{
						constants.allMemberList.remove(i);
					}
				}
				System.out.println("ȸ�� Ż�� �Ϸ� ");

				break;				
			}
		}


	}
}
