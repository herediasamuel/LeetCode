/**
 * MajorityElement:
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array.
 * https://leetcode.com/problems/majority-element/
 * Author: Samuel Heredia. heredia.samuel@gmail.com
 * Date: 02-05-2021
 * Note: If you find something in the algorithm that can be improved,
 * I would like to receive your comments. Thanks
 */
public class MajorityElement {
    public static void  main (String arg[]){
        int[] test = {6,5,5};
        System.out.println("Result is: " + majorityElement(test));
    }

    static public int majorityElement(int[] nums) {
        int result = nums[0];
        int counTemp;
        int countMax = (nums.length%2==0)? nums.length/2: nums.length/2+1;
        for(var i=0; i < nums.length ; i++){
            counTemp = 0;
            for(var j=0; j < nums.length; j++){
                if(j!=i && nums[i] == nums[j] ){
                    counTemp++;
                }
            }
            if( counTemp >= countMax - 1 ) {
                return nums[i];
            }
        }
        return result;
    }
}