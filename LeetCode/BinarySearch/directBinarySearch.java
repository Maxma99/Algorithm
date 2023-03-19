package BinarySearch;
import java.util.*;
import java.io.*;

class directBinarySearch{
    public int dBS(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (high - low)/2 + low;
            if(nums[mid] > target){
                high = mid;
            }
            else if(nums[mid] < target){
                low = mid;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        
    }
}