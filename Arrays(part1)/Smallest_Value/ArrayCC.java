import java.util.*;

public class ArrayCC {
    public static int smallestNumber(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,7,4,8,5,10};
        System.out.println("smallestt value is :" + smallestNumber(numbers));
    }
}
