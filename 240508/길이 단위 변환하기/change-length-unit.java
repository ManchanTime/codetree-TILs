public class Main {
    public static void main(String[] args) {
        float f = 30.48f;
        int m = 160934;

        System.out.printf("9.2ft = %.1fcm\n", Math.round((9.2 * f * 10)) / 10.0);
        System.out.printf("1.3mi = %.1fcm", Math.round((1.3 * m * 10)) / 10.0);
    }
}