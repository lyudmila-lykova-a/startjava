public class ConditionalStatement {
	public static void main (String [] args){
		int yourAge = 35;
		if (yourAge > 20){
			System.out.println ("you are grownup now");
		} 

		boolean isYourFemail = true;
		if (isYourFemail == false) {
			System.out.println("you are man");
		} else if (isYourFemail == true){
			System.out.println("you are woman");
		}

		double yourHeight = 1.62;
		if (yourHeight < 1.80){
			System.out.println ("you are not tall");
	 	} else if (yourHeight >= 1.80){
			System.out.println ("you are tall");
		}

	    String firstLetterName = "L";
		if (firstLetterName.charAt (0) == 'M'){
			System.out.println ("your name starts from letter М");
		} else if (firstLetterName.charAt (0) == 'E'){
			System.out.println ("your name starts from letter E");
		} else {
			System.out.println ("your name starts from another letter");
		}
}
} 
