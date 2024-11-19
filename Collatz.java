// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args [1];
		boolean verbose = mode.equals("v");
		
		for (int num = 1; num <= seed; num ++){
			int collatz = num;
			int count = 0;

			if (verbose){
				System.out.print(num + " ");
			}
			
			while (true) {
				
				if (collatz == 1) {
                    if (verbose) {
                        System.out.print("4 2 1 "); 
                    }
                    count += 3; 
                    break;
                }


				if (collatz % 2 == 0 ){
					collatz = collatz/2;
				}
				else{
					collatz = collatz * 3 + 1;
				}
				if (verbose){
					System.out.print(collatz + " ");
				}
				count ++;

				if (collatz == 1) {
                    break; 
                }
				
			}
		
			if (verbose){
				System.out.println("(" + (count + 1) + ")");
			}

		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
