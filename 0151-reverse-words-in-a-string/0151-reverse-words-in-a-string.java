class Solution {
    public String reverseWords(String s) {
        if(s==null) return null;
        
        char a[] = s.toCharArray();
        int n = a.length;
        reverse(a,0,n-1); //reversing the entire string
        reverseWords(a,n); //reversing each word when a space is met
        return cleanSpaces(a,n);
    }
    void reverseWords(char[]a, int n){
        int r=0,l=0;
        while(r<n){
            while(r<l || r<n && a[r]==' ') r++; //spaces skipped
            while(l<r || l<n && a[l]!=' ') l++; //move on with non space characters
            reverse(a,r,l-1);
        }
    }
    
    String cleanSpaces(char[]a, int n){
        int i=0,j=0;
        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // skip spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
            while (j < n && a[j] == ' ') j++;             // skip spaces
            if (j < n) a[i++] = ' ';                      // keep only one space
    }
  
    return new String(a).substring(0, i);
    }
    
    void reverse(char[] a, int i, int j){
        while(i<j){
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
}