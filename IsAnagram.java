package hashMap;

import java.util.*;

public class IsAnagram {
    // This is a functional problem. You have to complete this function.
    // It takes as input the String s ant t. It should return true if t is
    // and anagram of s, else should return false.

    public static boolean isAnagram(String s, String t) {
        // write your code here.
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> fms = new HashMap<>();//fmap of s
        for(int i = 0; i < s.length();i++){
            char c =  s.charAt(i);
            if(fms.containsKey(c)){
                fms.put(c,fms.get(c)+1);
            }else{
                fms.put(c,1);
            }
        }
        
        
        for(int i  = 0; i < t.length();i++){
            char c = t.charAt(i);
            if(fms.containsKey(c)){
                fms.put(c,fms.get(c)-1);
                if(fms.get(c)==0){
                    fms.remove(c);
                }
            }else{
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (isAnagram(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
