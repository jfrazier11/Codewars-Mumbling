import java.lang.StringBuilder;
public class Accumul {
    
    public static String accum(String s) {
    StringBuilder strb = new StringBuilder("");
     for(int i=0; i < s.length();i++)
     {
       int appendNum = i;
       strb.append(Character.toUpperCase(s.charAt(i)));
       while(appendNum > 0){ 
       strb.append(Character.toLowerCase(s.charAt(i)));
       appendNum--;
       }
       strb.append('-');
       
       
       
     }
     strb.deleteCharAt(strb.length()-1);
     return strb.toString();
    }
}
