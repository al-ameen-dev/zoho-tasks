package Assignment1DataTypes;
import java.util.*;
/*
Write a program to print a random number
 */
public class Program3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.printf("The Random Number is:%d",random.nextInt(500));
    }
}
