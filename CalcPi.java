// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		double piAprox = 0.0;
		int denom = 1;

		for (int i = 0; i < n; i++)
		{
			if (i % 2 == 0){
				piAprox = piAprox + 1.0/denom;
			}
			else{
				piAprox = piAprox - 1.0/denom;
			}

			denom = denom+2;
		}

		piAprox = piAprox*4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piAprox);

		
}
}
