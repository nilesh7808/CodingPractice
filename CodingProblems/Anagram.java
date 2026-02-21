package CodingProblems;
import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        // sorting string to lowercase, converting and storing them to array
        char[] newS1 = s1.toLowerCase().toCharArray();
        char[] newS2 = s2.toLowerCase().toCharArray();
        Arrays.sort(newS1);
        Arrays.sort(newS2);

       // string comparison
       return Arrays.equals(newS1, newS2);
    }
    
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("rat","act"));
    }
}
