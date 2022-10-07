class Solution {
    public int func(int i, int n){
        if(n==0) return 1;
        if(i<=0) return 0; //considering a vowel string has just 5 letters
        
        int pick = func(i,n-1);
        int notpick = func(i-1,n);
        
        return pick+notpick;
    }
    public int countVowelStrings(int n) {
        return func(5,n);
    }
}