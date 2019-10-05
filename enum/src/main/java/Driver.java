public class Driver {

    public void actions(ColorSimple color) {
        switch (color) {
            case RED:
                System.out.println("Остановка");
                break;
            case GREEN:
                System.out.println("Поехали");
                break;
            case YELLOW:
                System.out.println("Внимание");
                break;
            default:
                System.out.println("К такому меня жизнь не готовила!!!");
        }
    }
}
