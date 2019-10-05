package homework;

public class Utils {

    public static void print(String test) {
        System.out.println(test);
    }

    public static void print(String test, TextColor color) {
        System.out.println(color.getValue() + test + "\u001B[0m");
    }
}
