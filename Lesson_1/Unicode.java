public class Unicode{
	public static void main (String[] args){

		for (int i = 33; i <= 126; i++){
			String symbol = Character.toString((char)i);
			System.out.println(symbol);
		}
	}
}




/*
public class Unicode{
	public static void main (String[] args){

		for (int i = 33; i <= 126; i++){
			System.out.println((char)i);
		}
	}
}
*/