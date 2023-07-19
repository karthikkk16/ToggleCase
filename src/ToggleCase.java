import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
//        to change str to char arr
        String result=Toggle(s.toCharArray());
        System.out.println(result);
    }
    private static String Toggle(char[] c){
        for(int i=0;i<c.length;i++){
            if (c[i]>=65 && c[i]<=90){
                c[i]+=32;
            }
            else if (c[i]>=97 && c[i]<=122){
                c[i]-=32;
            }
        }
        String str=new String(c);
        return str;
    }
}
