package Transport;

import java.time.LocalDate;

public class validation {
    public static String validateString(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? " Данные не введены " : value;
    }

    public static int validateYear(int value) {
        return value > LocalDate.now().getYear() || value < 1900 ? 2000 : value;
    }

    public static int validateSpeed(int value) {
        return value < 0 || value > 300 ? 100 : value;
    }

    public static double validateRefiel(double value) {
        return value < 0 || value > 100 ? 0 : value;
    }
}
