package Test;
import java.util.*;
import java.io.*;

public class test{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
            //int N = sc.nextInt();
            //int A = sc.nextInt();
            //int B = sc.nextInt();
            //int[][] SP = new int[N][2];
            //for(int i = 0; i < N;i++){
            //    SP[i][0] = sc.nextInt();
            //    SP[i][1] = sc.nextInt();
            //}
            int N = 5;
            int A = 1;
            int B = 2;
            int[][] SP = new int[N][2];
            SP[0][0] = 1;
            SP[0][1] = 1;
            SP[1][0] = 2;
            SP[1][1] = 2;
            SP[2][0] = 3;
            SP[2][1] = 3;
            SP[3][0] = 1;
            SP[3][1] = 3;
            SP[4][0] = 1;
            SP[4][1] = 4;
            int maxcount = 0;
            for(int k=0;k<N;k++){
            int mxc = 0;
            int mxc1 = 0, mxc2 = 0, mxc3 = 0, mxc4 = 0;
                for(int i=0;i<N;i++){
                    

                    if((SP[k][0]-SP[i][0])<= A && (SP[k][1]-SP[i][1])<= B){
                        mxc1++;
                        if(k==i){mxc1--;}
                    if((SP[k][0]-SP[i][0])<= -A && (SP[k][1]-SP[i][1])<= B){
                        mxc2++;
                        if(k==i){mxc2--;}} 

                    if((SP[k][0]-SP[i][0])<= A && (SP[k][1]-SP[i][1])<= -B){
                        mxc3++;
                        if(k==i){mxc3--;}}
            
                    if((SP[k][0]-SP[i][0])<= -A && (SP[k][1]-SP[i][1])<= -B){
                        mxc4++;
                        if(k==i){mxc4--;}}
                    }
                
                }
                mxc = Math.max(mxc1,Math.max(mxc2,Math.max(mxc3,mxc4)));
                maxcount = Math.max(mxc,maxcount);
                }
            System.out.println(maxcount);
        }
        
    }
