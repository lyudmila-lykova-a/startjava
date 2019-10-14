public class Cycle {
	public static void main (String[] args) {
	// 	for (int i = 0; i <=20; i++) {
	// 		System.out.println(i + " ");
	// 	} 
	// }
	// }	

		// int i = 6; 
		// while (i >= -6) {
		// System.out.println(i + " ");
	 // 		i = i - 2;
	 // 	}
	 // }
	 // }

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


