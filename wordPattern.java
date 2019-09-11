import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> my_map = new HashMap<>();
        String[] arr = str.split(" ", 0);
        if (arr.length==1 && pattern.length()==1){
            return true;
        }
        if (arr.length!=pattern.length()){
            return false;
        }
        for (int i=0;i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if (!my_map.containsKey(c)){
                if (my_map.containsValue(arr[i])){
                    return false;
                }
                my_map.put(c,arr[i]);
            } else {
                if (!my_map.get(c).equals(arr[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
