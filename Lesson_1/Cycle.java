public class Cycle {
	public static void main (String[] args) {
		int i = 10;
		int result = 1;
		do {
			result = result + i;
	        int mod = result % 2; 
				if(mod == 1){
					System.out.println("number" + result);
				}
				i++;
		} while(i <= 20);
	}
} 