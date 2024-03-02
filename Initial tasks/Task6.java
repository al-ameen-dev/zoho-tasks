public class Task6 {
    public static void main(String[] args) {
        int a = 10, b = 5, x;
        System.out.printf("a = %d and b = %d%n",a,b);
        System.out.printf("++a - b-- is '%d'%n",++a - b--);
        a = 10;
        b = 5;
        System.out.printf("a %% b++ is '%d'%n",a % b++);
        a = 10;
        b = 5;
        a *= b+5;
        System.out.printf("a*=b+5 is '%d'%n", a);
        x = 69 >>> 2;
        System.out.printf("x = 69 >>> 2 is '%d'", x);
    }
}
