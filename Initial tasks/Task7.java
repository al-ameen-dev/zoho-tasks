public class Task7 {
    public static void main(String[] args) {
        int a = 28;
        a += a++ + ++a + --a + a--;
        System.out.printf("a = 28%n");
        System.out.printf("a += a++ + ++a + --a + a-- is  %d",a);
    }
}
