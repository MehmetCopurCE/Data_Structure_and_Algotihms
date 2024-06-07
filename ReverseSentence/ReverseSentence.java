package ReverseSentence;/*
Problem:
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.


Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

 */

public class ReverseSentence {

    // Reverse the letters of the word
    static void reverse(char str[], int start, int end) {
        char temp;

        while (start <= end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    // Function to reverse words
    static char[] reverseWords(char[] s) {
        // Reversing individual words as
        // explained in the first step

        int start = 0;
        for (int end = 0; end < s.length; end++) {
            // If we see a space, we
            // reverse the previous
            // word (word between
            // the indexes start and end-1
            // i.e., s[start..end-1]

            if (s[end] == ' ') {
                reverse(s, start, end);
                start = end + 1;
            }

        }
        //reverse the last word
        reverse(s, start, s.length - 1);

        //reverse the entire string
        reverse(s, 0, s.length - 1);

        return s;
    }

    public static void main(String[] args) {
        String s = "i like this program very much ";
        System.out.println(s);

        // Function call
        char[] p = reverseWords(s.toCharArray());
        System.out.println(p);

    }
}

/*
Time complexity: O(N)  because we go through all elements in the string once.
Auxiliary Space: O(N) because we store all elements in an data structrure.
 */
