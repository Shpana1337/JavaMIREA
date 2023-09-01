package task6;

public class Task6 {
    public static void main(String[] args) {
        float el;
        float previous_el = 0f;

        for (int i = 1; i < 11; i++) {
            if (previous_el == 0) {
                el = 1 / (float) i;
            } else {
                el = previous_el + 1 / (float) i;
            }
            previous_el = el;
            System.out.printf("%d член гармонического ряда = %f\n", i, el);
        }
    }
}
