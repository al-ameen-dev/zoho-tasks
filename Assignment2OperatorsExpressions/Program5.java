package Assignment2OperatorsExpressions;
import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the seconds:");
        int inputSeconds = sc.nextInt();
        sc.nextInt();
        int hours = inputSeconds/3600;
        int minutes = (inputSeconds%3600)/60;
        int seconds = inputSeconds%60;
        System.out.printf("Seconds in 'HH:mm:ss' is '%02d:%02d:%02d'",hours,minutes,seconds);
    }
}
