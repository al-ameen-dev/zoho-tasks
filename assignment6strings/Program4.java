package assignment6string;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a email to check its format:");
        String email = scanner.next();
        scanner.close();
        if(email.length()<7){
            System.out.println("It is not a valid email!");
            return;
        }
        if(email.contains("@") && email.endsWith(".com")) {
            if(email.substring(email.indexOf('@'),email.indexOf('.')).length()>1) {
                System.out.println("It is valid email Address");
            }
        }
    }
}
