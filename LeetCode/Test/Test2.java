package Test;

public class Test2 {
        private void reverseString(char[] s) {
            int n = s.length;
            char tmp;
            for(int i=0;i< n/2 ; i++){
                    tmp = s[i];
                    s[n-i] = s[i];
                    s[n-i] = tmp;  
            }
        }
        public static void main(String[] args){
            char[] s = new char[5];
            s[0] = 'h';

        }
}
