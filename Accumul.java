import java.lang.StringBuilder;

/**
 * Transforms text specified by description
 * @author Jeremi R Frazier
 * @Version 1.0
 **/
public class Accumul {
    /**
     * a method that takes a word and extends it by its length turning the first character into a lowercase
     * @param s - The word
     * @return String - the accumul
     */ 
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
