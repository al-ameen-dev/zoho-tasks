package assignment6string;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence:");
        String sentence = scanner.nextLine();
        scanner.close();
        String result = "";
        String[] words = sentence.split(" ");
        for(String word:words) {
            word = word.replaceFirst("" + word.charAt(0), "" + Character.toUpperCase(word.charAt(0)));
            result += word+" ";
        }
        System.out.println("The title case sentences is : '"+result.trim()+"'");
    }
}
