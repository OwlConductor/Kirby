package Übungsaufgabe1;

public class Lennart {
	
	/*
	 * Entrance to program
	 */
	public static void main(String args[]) {
		
		/*
		 * Check for input parameters
		 */
		if(args.length == 0) {
			System.out.println("no parameters.");
		} else {

			// Try catch for irrigular input
			try {

				/*
				 * looping through input pararameters and displaying them on cli
				 */
				for (int i = 0; i < args.length; i++)
					System.out.println("Parameter " + i + ": " + args[i]);

			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		System.out.println("Leben");
	}
}
