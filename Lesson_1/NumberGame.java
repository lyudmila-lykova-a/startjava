import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class NumberGame{
	public static void main (String[] args){
		int randomNum = ThreadLocalRandom.current().nextInt(101);
		System.out.println(randomNum);

		while(true){
			System.out.println("enter number from 0 to 100: ");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			
			if(number > randomNum){
				System.out.println("your number is bigger");
			}else if (number < randomNum){
				System.out.println("your number is smaller");
			}else{
				System.out.println("correct! You win!");
				break;
			}
		}

	}
}