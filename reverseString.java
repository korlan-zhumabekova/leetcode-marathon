class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        if (size!=0){
            for (int i=0; i<size/2; i++ ){
                char temp = s[i];
                s[i]=s[size-1-i];
                s[size-1-i]=temp;
        }
        }
        
    }
}
