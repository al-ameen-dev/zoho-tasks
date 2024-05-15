package assignment6string;

import java.util.Scanner;

/*
Write a program to reverse the words in a sentence.
 */
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence:");
        String sentence = scanner.nextLine();
        scanner.close();
        sentence = sentence.trim();
        String[] words = sentence.split(" ");
        int i = 0, j = words.length-1;
        while(i < j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        String result = "";
        for(String word:words){
            result += word +" ";
        }
        System.out.println("The reverse sentence is:'"+result.toString().trim()+"'");
    }
}
