package Test;
import java.util.*;
import java.io.*;

public class Test3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        int[][] pos = new int[times][2];
        int[][] ans = new int[times][2];
        for(int i = 0;i<times;i++){
            pos[i][0] = in.nextInt();
            pos[i][1] = in.nextInt();
            int[] a,b = new int[2];
            a = numcomma(pos[i][1]);
            b = numcomma(pos[i][0]);
            ans[i][0] = b[0]-a[0];
            ans[i][1] = b[1]-a[1];
        }
        for(int i = 0;i<times;i++){
            System.out.printf("%d %d",ans[i][1],ans[i][0]);
        }
    }
    private static int[] numcomma(int pos){
        int[] nums = new int[2];
        nums[0] = (int) Math.floor(pos/6);
        nums[1] = (int)Math.floor(pos/2)-nums[0];
        return nums;
        }

    }