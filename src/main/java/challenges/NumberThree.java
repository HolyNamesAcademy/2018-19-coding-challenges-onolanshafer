package challenges;


/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 *
 * The method should return a new string representing the input time in 24 hour format.
 *
 * timeConversion has the following parameter(s):
 *
 * Example:
 * s: 07:05:45AM
 * return: 07:05:45
 *
 * Example:
 * s: 07:05:45PM
 * return: 19:05:45
 // @param s a string representing time in 12 hour format
 // @return the string s in 24 hour format
 */

public class NumberThree {

    public String timeConversion(String s) {
    String military = "";
    String [] time = s.split(":");
    String hour, minute, second;
    hour = time[0];
    minute = time[1];
    second = time[2].substring(0, 2);
    boolean night = "PM".equals(time[2].substring(2));
    if (night) {
        if (! (hour.equals("12"))) {
            hour = Integer.parseInt(hour) + 12 + "";
        }
    }
    else {
        if (hour.equals("12")){
            hour = "00";
        }
    }

    military = hour + ":" + minute + ":" + second;
    return military;
    }
}
