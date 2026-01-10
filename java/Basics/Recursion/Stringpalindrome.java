
class Solution {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Optional main method for local testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        String test = "A man, a plan, a canal: Panama";
        System.out.println(sol.isPalindrome(test) ? "Palindrome" : "Not Palindrome");
    }
}
