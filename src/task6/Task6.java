package task6;

public class Task6 {
    public static void main(String[] args) {
        float el;
        float previousEl = 0f;

        for (int i = 1; i < 11; i++) {
            if (previousEl == 0) {
                el = 1 / (float) i;
            } else {
                el = previousEl + 1 / (float) i;
            }
            previousEl = el;
            System.out.printf("%d член гармонического ряда = %f\n", i, el);
        }
    }
}
