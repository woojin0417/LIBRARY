import java.util.Scanner;


public class MembersInfor {
	
	private String memberName;			// ȸ�� �̸�
	private String memberPhoneNum;		// ȸ�� ��ȭ��ȣ
	private String memberId;			// ȸ�� id
	private String memberPw;			// ȸ�� pW
	
	
	public MembersInfor(String memberName, String phoneNum, String memberId,String memberPw)
	{
		this.memberName = memberName;
		this.memberPhoneNum = phoneNum;
		this.memberId = memberId;
		this.memberPw= memberPw;
	}
	public String getMemberName() 
	{
		return memberName;
	}

	public void setMemberName(String memberName) 
	{
		this.memberName = memberName;
	}

	public String getMemberPhoneNum() 
	{
		return memberPhoneNum;
	}

	public void setMemberPhoneNum(String memberPhoneNum) 
	{
		this.memberPhoneNum = memberPhoneNum;
	}
	public String getmemberId() 
	{
		return memberId;
	}

	public void setmemberId(String memberId) 
	{
		this.memberId = memberId;
	}
	
	public String getmemberPw() 
	{
		return memberPw;
	}

	public void setmemberPw(String memberPw) 
	{
		this.memberPw = memberPw;
	}

}

