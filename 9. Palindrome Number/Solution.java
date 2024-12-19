class Solution {
    public boolean isPalindrome(int x) {
       
        if (x < 0) {
            return false;
        }

        
        String numberStr = String.valueOf(x);

        
        String reversedNumber = "";
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            char reversedChar = numberStr.charAt(i);
            reversedNumber += reversedChar;
        }

      
        return numberStr.equals(reversedNumber);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(121); 
        System.out.println(result);  
    }
}


