public class TimeCalc {
    public static void main(String[] args) {
        int timeHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int timeMinutes = Integer.parseInt("" + args[0].charAt(3)  + args[0].charAt(4) + "");
        int minutesToAdd = Integer.parseInt(args[1]); 

        timeMinutes = timeMinutes + minutesToAdd;
        timeHours += timeMinutes/60; 
        timeMinutes %= 60;
      
        timeHours = timeHours%24;

        String minS = (timeMinutes < 10) ? "0" + String.valueOf(timeMinutes) : String.valueOf(timeMinutes); 
        String hourS = (timeHours < 10) ? "0" + String.valueOf(timeHours) : String.valueOf(timeHours); 

        System.out.println(hourS + ":" + minS);

    }
}
