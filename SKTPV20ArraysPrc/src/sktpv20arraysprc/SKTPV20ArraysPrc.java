/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktpv20arraysprc;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class SKTPV20ArraysPrc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] nums;
        nums = new int[5];
        nums [0]=1;
        nums [1]=2; 
        nums [2]=3; 
        nums [3]=4; 
        nums [4]=5; 
        System.out.println("nums = "+Arrays.toString(nums));
        
        int nums2[];
        nums2 = Arrays.copyOf(nums, 7);
        
        System.out.println("nums2 = "+Arrays.toString(nums2));
        System.out.println("nums2 = "+Arrays.toString(nums2));
        System.out.print("nums2 = [");
        for(int i=0;i<nums2.length;i++){
            System.out.printf("%d",nums2[i]);
            if(i < nums2.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println("Двухмерный массив");
        Random random = new Random();
        int[][] nums3;
        nums3 = new int[5][5];
        for (int[] nums31 : nums3) {
            for (int j = 0; j < nums31.length; j++) {
                nums31[j] = random.nextInt(10);
            }
        }
        System.out.println("nums3 = ");
        //System.out.println(Arrays.toString(nums3));
        for (int[] nums31 : nums3) {
            for (int j = 0; j < nums31.length; j++) {
                System.out.printf("%3d", nums31[j]);
            }
            System.out.println();
        }
    }
}
