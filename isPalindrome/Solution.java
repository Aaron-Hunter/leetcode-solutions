/**
 * Solution for the 'isPalindrome' problem on leetcode.com
 *
 * @author Aaron Hooper
 * @version 1.0
 * @since 2021.01.21
 */

public class Solution {
    /**
     * Uses a StringBuilder to reverse the integer and string comparison to check if its a palindrome
     * @param x the potential palindrome
     * @return true if the integer is a palindrome
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        String rev = new StringBuilder().append(x).reverse().toString();
        return rev.equals(String.valueOf(x));
    }
}
