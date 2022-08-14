package pyramid;

public class Example {
	public static void main(String args[]) {
		boolean succuess = false;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				if (i == 70) {
					System.out.println("Success");
					succuess = true;
					break;
				}
			}
			System.out.println();
			if (succuess) {
				break;
			}
		}
		
		
		System.out.println("Done");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
