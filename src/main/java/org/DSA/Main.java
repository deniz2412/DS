package org.DSA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(nums)));

    }

    //Sorting
    public static int[] sortedSquares(int[] nums) {

        //square

        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];

        }

        //Sort using quicksort
        int k = nums.length;
        for(int i=0;i<k-1;i++){
            for (int j=0;j<k-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;

                }

            }
        }


        return nums;

    }

    /*public int findNumbers(int[] nums) {
        int evenCount=0;
        int counter = 0;
        for(int num: nums){


            while(num!=0){
                num = num/10;
                counter++;
            }


            if(counter%2==0){
                evenCount++;
            }

            counter = 0;
        }

        return evenCount;
    }*/
  /*  public int findMaxConsecutiveOnes(int[] nums) {

        int oneCount=0;
        int result=0;

        for(int i = 0; i<nums.length;i++){
            if (nums[i]==0){
                oneCount = 0;
            }
            else {
                oneCount++;
                if (result>oneCount) {
                    continue;
                }
                else{
                    result = oneCount;
                }

            }

        }
        return result;
    }
*/


}