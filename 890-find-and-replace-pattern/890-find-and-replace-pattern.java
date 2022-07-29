class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern)) res.add(word);
        }
        return res;
    }
    
    boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            // System.out.println(a.indexOf(a.charAt(i))+"--"+a.charAt(i));
            // System.out.println(b.indexOf(b.charAt(i))+"--"+b.charAt(i));
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }
}