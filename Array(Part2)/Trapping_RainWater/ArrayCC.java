import java.util.*;

public class ArrayCC {
    public static int trappedRainWater(int height[]) {

        // calculate left max boundary - array

        int leftmax [] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // calculate right max boundary - array

        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for ( int i = height.length-2; i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapedWater = 0;
        
        // loop
        for (int i=0; i<height.length; i++) {
            // waterLevel = min(leftmax boundary - rightmax boundary)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water = waterLevel - height[i]
            trapedWater += waterLevel - height[i];

        }
        return trapedWater;
       
    }
    public static void main(String args[]) {
        int height [] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}
