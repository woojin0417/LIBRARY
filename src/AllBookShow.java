
public class AllBookShow {

	public String borrowInfo;
	
	public AllBookShow()
	{
		System.out.println(" 모든책 LIST ");
		for (int i = 0; i < constants.allBookList.size(); i++) 
		{
			if(constants.allBookList.get(i).isBorrowed() == true)
			{
				borrowInfo = "(대여 불가)";		// 대여가능 
			}
			else 
			{
				borrowInfo = "(대여가능)";		// 대여불가
			}
			System.out.println("" + (i+1) + ". " + constants.allBookList.get(i).getBookTitle() + borrowInfo);
		}
		System.out.println("모든책 조회 완료");
	}
}
