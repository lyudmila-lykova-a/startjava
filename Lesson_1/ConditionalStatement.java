public class ConditionalStatement {
	public static void main (String [] args) {
		int yourAge = 35;
		if (yourAge > 20) {
			System.out.println ("you are grownup now");
		} 

		boolean isYouMale = false;
		if (isYouMale) {
			System.out.println("you are a man");
		} 
		if (!isYouMale) {
			System.out.println("you are a woman");
		}

		double yourHeight = 1.62;
		if (yourHeight < 1.80) {
			System.out.println ("you are not tall");
	 	} else if (yourHeight >= 1.80) {
			System.out.println ("you are tall");
		}

		String firstLetterName = "L";
		if (firstLetterName.charAt (0) == 'M') {
			System.out.println ("your name starts from letter М");
		} else if (firstLetterName.charAt(0) == 'E') {
			System.out.println ("your name starts from letter E");
		} else {
			System.out.println ("your name starts from another letter");
		}
	}
} 
