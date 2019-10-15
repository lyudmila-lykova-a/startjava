public class Calculator {
	// javac Calculator.java
	// java Calculator 2 ^ 3
	// args = ["2", "^", "3"]
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]); 
		}
		System.out.println("=");
		int x = Integer.valueOf(args[0]);

		//operation (+, -, * etc.)
		String operation = args[1];

		String arg2 = args[2];
		int y = Integer.valueOf(arg2);

		if(operation.equals("+")) {
			System.out.println(x + y);
		} else if(operation.equals("-")) {
			System.out.println(x - y);
		} else if(operation.equals("x")) {
			System.out.println(x * y);
		} else if(operation.equals("/")) {
			System.out.println(1.0 * x / y); // преобразуем int в double при помощи умножения на 1.0.
		} else if(operation.equals("%")) {
			System.out.println(x % y);
		} else if(operation.equals("^")) {
			int result = 1;
			for(int i = 0; i < y; i++) {
				result *= x;
			} 
			System.out.println(result);
		} else {
			System.out.println("mistake");
		}
	}
}