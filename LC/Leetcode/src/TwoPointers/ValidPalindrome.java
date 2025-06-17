package TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome1(String s) {
        int i = 0;
        int j = s.length() -1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*
    string reverse
     */
    public boolean isPalindrome2(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
