public enum Direction {
    LEFT{
        @Override
        void message() {
            System.out.println("Налево пойдешь - коня потеряешь");
        }
    },
    RIGHT{
        @Override
        void message() {
            System.out.println("Направо пойдешь - жизнь потеряешь");
        }
    },
    STRAIGHT{
        @Override
        void message() {
            System.out.println("Прямо пойдешь – счастье найдешь (или жив будешь, да себя позабудешь).");
        }
    };

    abstract void message();
}
