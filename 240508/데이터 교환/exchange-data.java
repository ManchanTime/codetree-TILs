public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int tmp = c;
        c = b;
        b = a;
        a = tmp;
        System.out.println(a + "\n" + b + "\n" + c);
    }
}