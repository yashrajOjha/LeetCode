class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }

        int len = s.length();
        if (len <= 1) {
            return len;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < len; end++) {
            char eChar = s.charAt(end);
            if (map.containsKey(eChar)) {
                start = Math.max(start, map.get(eChar) + 1);
            }
            map.put(eChar, end);
            // System.out.println(eChar+" "+map.get(eChar));
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}