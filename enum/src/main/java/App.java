public class App {

    public static void main(String[] args) {

        ColorEnum red = ColorEnum.RED;
        ColorEnum green = ColorEnum.GREEN;
        System.out.println(red.compareTo(green));

        new  Driver().actions(ColorSimple.GREEN);

    }
}
