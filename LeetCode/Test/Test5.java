package Test;
import java.util.*;
import java.io.*;

public class Test5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        int[] nu = new int[n];
        for(int i = 0;i<k;i++){
          a[i] = sc.nextInt();
        }
        for(int j = 1;j<n;j++){
          nu[j-1] = j;
        }
        int[] enumb = new int[k];
        for(int i = 0;i<k;i++){
          enumb[i] = jsp(n,a[i]);  
        }
        for(int i = 0;i<k;i++){
          System.out.println(enumb[i]);
        }
        
      }
      public int jsp(int n,int e){
        int id = 0;
        for(int i = 2;i<=n;i++){
          id = (id + e)%i;
        }
        return id;
      }
      
}
