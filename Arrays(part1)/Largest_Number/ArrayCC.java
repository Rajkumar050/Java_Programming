import java.util.*;

public class ArrayCC {
    public static int largestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,7,4,8,5,10};
        System.out.println("largest value is :" + largestNumber(numbers));
    }
}
