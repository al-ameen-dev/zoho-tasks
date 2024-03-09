package Assignment2OperatorsExpressions;
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the celcius:");
        float celcius = sc.nextFloat();
        sc.close();
        float fahrenheit = (celcius * 9/5)+32;
        System.out.printf("The converted fahrenheit is:%.2f",fahrenheit);

    }
}
