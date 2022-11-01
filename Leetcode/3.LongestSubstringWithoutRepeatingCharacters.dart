class Solution {
  int lengthOfLongestSubstring(String s) {
    int longestSubstring = 1;
    int currLength;
    for (int i = 0; i <= s.length - 2; i++) {
      currLength = 1;
      if (s[i + 1] != s[i]) {
        for (int j = i + 1; j <= s.length - 1; j++) {
          currLength++;
          if (j != s.length - 1) if (s.substring(i, j + 1).contains(s[j + 1]))
            break;
        }
      }
      longestSubstring =
          currLength > longestSubstring ? currLength : longestSubstring;
    }

    return longestSubstring;
  }
}
