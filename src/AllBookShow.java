
public class AllBookShow {

	public String borrowInfo;
	
	public AllBookShow()
	{
		System.out.println(" ���å LIST ");
		for (int i = 0; i < constants.allBookList.size(); i++) 
		{
			if(constants.allBookList.get(i).isBorrowed() == true)
			{
				borrowInfo = "(�뿩 �Ұ�)";		// �뿩���� 
			}
			else 
			{
				borrowInfo = "(�뿩����)";		// �뿩�Ұ�
			}
			System.out.println("" + (i+1) + ". " + constants.allBookList.get(i).getBookTitle() + borrowInfo);
		}
		System.out.println("���å ��ȸ �Ϸ�");
	}
}
