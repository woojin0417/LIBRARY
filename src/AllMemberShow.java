public class AllMemberShow {

	public AllMemberShow()
	{
		System.out.println();
		System.out.println(" ��� ȸ�� LIST ");				
		for (int i = 0; i < constants.allMemberList.size(); i++) 	// �� Column�� �ش��ϴ� ��
		{

			System.out.println("" + (i+1) + ". "+  constants.allMemberList.get(i).getMemberName() + " "+ constants.allMemberList.get(i).getmemberId() );
		}
		System.out.println("��� ȸ�� ��ȸ �Ϸ�");	
	}
}
