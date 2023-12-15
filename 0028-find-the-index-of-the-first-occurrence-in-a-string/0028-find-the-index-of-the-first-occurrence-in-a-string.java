class Solution {
    public int strStr(String haystack, String needle) {
        
        int needleSize = needle.length();
        int i,j;
        boolean result;

        for(i = 0; i <= (haystack.length() - needleSize); i++){
            int x = i;
            result = true;
            for(j = 0; j < needleSize; j++){
                if(needle.charAt(j) != haystack.charAt(x)){
                    result = false;
                    break;
                }
                x++;
            }
    
            if(result){
                 return i;
            }
            
        }
        return -1;
    }
}