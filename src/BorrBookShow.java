import java.util.Iterator;



public class BorrBookShow {


	public BorrBookShow() 
	{
		System.out.println(" �뿩���� å LIST ");

		Iterator<String> keys = constants.borrowBookList.keySet().iterator();
		while( keys.hasNext() ){
			String key = keys.next();
			System.out.println( String.format("å ���� : %s, �������id : %s", key, constants.borrowBookList.get(key)) );
		}

	}


}
