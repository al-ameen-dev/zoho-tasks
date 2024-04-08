package assignment6string;
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String:");
        String string = scanner.nextLine();
        scanner.close();
        int vowelCount = 0;
        for(int i=0;i<string.length();i++){
            char c = string.charAt(i);
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelCount++;
            }
        }
        System.out.println("The total number of vowels present is "+vowelCount);
    }
}
