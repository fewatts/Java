package codewars;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean isIsogram(String str) {
        String lower = str.toLowerCase();

        Set<Character> chr = new HashSet<>();
        for(var c : lower.toCharArray()){
            if(chr.contains(c))
                return false;
            
            chr.add(c);
        }
        return true;        
    }

}
