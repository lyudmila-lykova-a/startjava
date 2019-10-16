import java.util.Scanner;

public class GuessNumber {
	public static void main (String[] args) {
		int randomNum = 90;

		while(true) {
			System.out.println("enter number from 0 to 100: ");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			
			if(number > randomNum) {
				System.out.println("your number is bigger");
			} else if (number < randomNum) {
				System.out.println("your number is smaller");
			} else {
				System.out.println("correct! You win!");
				break;
			}
		}
	}
}