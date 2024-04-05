



import java.util.HashMap;
public class ClassExample {
    public static void main(String[] args){
        System.out.println(countingCharacters(str));
    }
    public static HashMap<Character, Integer> countingCharacters(String str) {
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : charArray) {
        if(charMap.containsKey()){

        }else{
            // new entry in our hashmap
        }

            charMap.put(c, 1);
            charMap.get(c);

        }
        return charMap;
    }
}