class Solution {
    public boolean halvesAreAlike(String s) {
        int l=0,r=s.length()-1;
        int countleft=0;
        int countright=0;
        char lc,rc;
        while(l<r){
            lc = s.charAt(l);
            rc = s.charAt(r);
            if(lc=='a' || lc=='e' || lc=='i' || lc=='o' || lc=='u' ||
               lc=='A' || lc=='E' || lc=='I' || lc=='O' || lc=='U') countleft++;
            if(rc=='a' || rc=='e' || rc=='i' || rc=='o' || rc=='u' ||
               rc=='A' || rc=='E' || rc=='I' || rc=='O' || rc=='U') countright++;
            l++;
            r--;
        }
        return countleft==countright;
    }
}