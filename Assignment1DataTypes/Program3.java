package Assignment1DataTypes;
import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.printf("The Random Number is:%d",random.nextInt(500));
    }
}
