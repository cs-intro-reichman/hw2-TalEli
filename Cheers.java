// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheer = args [0];
            int n = Integer.parseInt(args[1]);

            cheer = cheer.toUpperCase();

            for ( int i = 0 ; i < cheer.length() ; i++ ) {
                char letter = cheer.charAt(i);
                String sletters = "AEFHILMNORSX" ;
                if (sletters.indexOf(letter) != -1) {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                }
                else {
                        System.out.println("Give me a " + letter + ": " + letter + "!");
                }
            }
            System.out.println("What does that spell?");

            for ( int i = 0 ; i < n ; i++ ){
                System.out.println(cheer + "!!!");
            }

        }
}
