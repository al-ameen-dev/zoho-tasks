package combinedAssignments1;

import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        List<BMI> bmilist = new ArrayList<>();
        String name;
        float weight,height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons to compare:");
        int numPeoples = sc.nextInt();
        for(int i=1;i<=numPeoples;i++)
        {
            System.out.printf("Enter the name of person %d:",i);
            name = sc.next();
            System.out.printf("Enter the weight of person %d in kg:",i);
            weight = sc.nextFloat();
            System.out.printf("Enter the Height of person %d in cm:",i);
            height = sc.nextFloat();
            BMI bmi = new BMI(name, weight, height/100);
            bmi.calcBMI();
            bmilist.add(bmi);
        }
        sc.close();
        for(int i=0;i<numPeoples;i++)
        {
            for(int j=i+1;j<numPeoples;j++)
            {
                if(bmilist.get(i).getBMI() < bmilist.get(j).getBMI())
                {
                    Collections.swap(bmilist, i, j);
                }
            }
        }
        System.out.println("Name    |BMI    |Remark");
        for(int i=0;i<numPeoples;i++)
        {
            bmilist.get(i).print();
        }
    }
}

class BMI
{
    String name;
    float weight;
    float height;
    float bmi;
    String remarkString;
    Scanner sc;
    BMI(String name,float weight,float height)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    void calcBMI()
    {
        this.bmi = weight/(height*height);
        if(bmi>=30)
            this.remarkString = "Obese";
        else if(bmi >= 25 && bmi <= 29)
            this.remarkString = "Overweight";
        else if(bmi >=18.5 && bmi <=24.9)
            this.remarkString = "Normal";
        else
            this.remarkString = "Underweight";
    }
    float getBMI()
    {
        return this.bmi;
    }
    void print()
    {
        System.out.printf("%s|%5.1f|%10s%n",this.name,this.bmi,this.remarkString);
    }
}