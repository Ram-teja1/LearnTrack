package com.airtribe.learntrack.util;

public class InputValidator {

    public static boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isValidEmail(String email) {
        if (email == null) return false;
        return email.contains("@") && email.contains(".");
    }

    public static boolean isInRange(int choice, int min, int max) {
        return choice >= min && choice <= max;
    }

    public static int parseIntSafe(String value) throws NumberFormatException {
        return Integer.parseInt(value.trim());
    }
}
