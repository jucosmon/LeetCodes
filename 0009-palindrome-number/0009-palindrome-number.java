class Solution {
    
    public boolean isPalindrome(int x) {
        
        String reversed ="";
        String number = String.valueOf(x);
        
        int j =0, i, size = number.length();

        j = number.length() - 1;
        for(i = (size - 1); i >= 0 ; i--) {
            reversed += number.charAt(i);
        }
        if(number.equals(reversed)){
            return true;
        }
        return false;
    }
}