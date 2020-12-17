package utils;

import java.util.regex.Pattern;

public class TimeValidator {
    private static String TIME_PATTERN = "-?[0-9]";
    private static int ZERO = 0;

    public static boolean isBelowZero(String time) {
        return Integer.valueOf(time) <= ZERO;
    }

    public static boolean isInteger(String time) {
        return !Pattern.matches(TIME_PATTERN, time);
    }
}
