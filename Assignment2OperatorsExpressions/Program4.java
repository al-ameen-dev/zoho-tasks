package Assignment2OperatorsExpressions;
import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Weight:");
        float weight = sc.nextFloat();
        System.out.print("Enter the Height:");
        float height = sc.nextFloat();
        sc.close();
        height /=100; 
        float bmi = weight/(height*height);
        System.out.println("BMI value is:"+bmi);
        if(bmi>=30)
            System.out.println("BMI Remark : Obese");
        else if(bmi >= 25 && bmi <= 29)
            System.out.println("BMI Remark : Overweight");
        else if(bmi >=18.5 && bmi <=24.9)
            System.out.println("BMI Remark : Normal");
        else
        System.out.println("BMI Remark : Underweight");
    }
}
