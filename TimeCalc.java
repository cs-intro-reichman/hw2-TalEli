public class TimeCalc {
    public static void main(String[] args) {
        int timeHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int timeMinutes = Integer.parseInt("" + args[0].charAt(3)  + args[0].charAt(4) + "");
        int minutesToAdd = Integer.parseInt(args[1]); 

        int hoursToAdd = minutesToAdd/60;
        timeHours = timeHours + hoursToAdd; 
        timeMinutes = timeMinutes + minutesToAdd%60;

        if (timeMinutes > 59 ){
            timeMinutes = timeMinutes%59;
            timeHours ++;
         }

        if (timeHours > 23)
        {
            timeHours = timeHours%24;
        }


        String minS = (timeMinutes < 10) ? "0" + String.valueOf(timeMinutes) : String.valueOf(timeMinutes); 
        String hourS = ( timeHours < 10) ? "0" + String.valueOf(timeHours) : String.valueOf(timeHours); 

        System.out.println(hourS + ":" + minS);



    }
}
