package Assignment1DataTypes;

/*
Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short
*/

public class Program1 {
    public static void main(String[] args) {

        float a = 45.5f;
        int b = (int)a;
        System.out.printf("float(%f) to int(%d) conversion%n",a,b); 
        double c = 50.54555;
        float d =(float)c;
        System.out.printf("double(%f) to float(%f) conversion%n",c,d);
        short s = (short)b;
        System.out.printf("int(%d) to short(%d) conversion%n",b,s);

    }
}
