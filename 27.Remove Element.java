//My submission for Leetcode

import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        if (nums.length == 0 || (nums.length == 1 && nums[0] != val)){
            k = 1;
        }
        for (int b = 0; b<nums.length-1; b++){
           for (int i = 0; i<nums.length-1; i++){
                if (nums[i] == val){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
           }
       }
    } 

       
       
        for (int j = 0; j<nums.length; j++){
           
           if (nums[j] != val){
               k+=1;
           }

       }
       return k;
    }
}
