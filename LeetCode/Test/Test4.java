package Test;
import java.util.*;

public class Test4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            char[] ch = s.toCharArray();
            int mx = 0;
            for(int i = 0; i<ch.length-1; i++){
                mx = Math.max(mx,ch[i]-ch[i+1]);
            }
                for(int i = 0; i<ch.length-1; i++){
                if(mx ==ch[i]-ch[i+1]){
                    char tmp = ch[i];
                    ch[i] = ch[i+1];
                    ch[i+1] = tmp;
                    }
            }
            System.out.println(ch);
        }
    
    
}
