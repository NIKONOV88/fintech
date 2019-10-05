package homework;

import java.util.Random;

public enum TextColor {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private String value;

    TextColor(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TextColor getRandom() {
        return TextColor.values()[new Random().nextInt(TextColor.values().length)];
    }
}
