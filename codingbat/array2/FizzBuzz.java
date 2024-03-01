package array2;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {

        int size = Math.abs(start - end);
        String[] arr = new String[size];
        int count = 0;
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                arr[count++] = "Fizz";
            } else if (i % 5 == 0 && i % 3 != 0) {
                arr[count++] = "Buzz";
            } else if (i % 3 == 0 && i % 5 == 0) {
                arr[count++] = "FizzBuzz";
            } else {
                arr[count++] = String.valueOf(i);
            }
        }
        return arr;
    }

}
