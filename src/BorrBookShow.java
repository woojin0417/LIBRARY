import java.util.Iterator;



public class BorrBookShow {


	public BorrBookShow() 
	{
		System.out.println(" 대여중인 책 LIST ");

		Iterator<String> keys = constants.borrowBookList.keySet().iterator();
		while( keys.hasNext() ){
			String key = keys.next();
			System.out.println( String.format("책 제목 : %s, 빌린사람id : %s", key, constants.borrowBookList.get(key)) );
		}

	}


}
