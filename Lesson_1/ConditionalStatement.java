public class ConditionalStatement {
	public static void main (String[] args) {
		int yourAge = 35;
		if (yourAge > 20) {
			System.out.println ("you are grownup now");
		} 

		boolean isMale = false;
		if (isMale) {
			System.out.println("you are a man");
		} 
		if (!isMale) {
			System.out.println("you are a woman");
		}

		double yourHeight = 1.62;
		if (yourHeight < 1.80) {
			System.out.println ("you are not tall");
	 	} else if (yourHeight >= 1.80) {
			System.out.println ("you are tall");
		}

		char firstLetterName = 'L';
		if (firstLetterName == 'M') {
			System.out.println ("your name starts from letter М");
		} else if (firstLetterName == 'E') {
			System.out.println ("your name starts from letter E");
		} else {
			System.out.println ("your name starts from another letter");
		}
	}
} 
