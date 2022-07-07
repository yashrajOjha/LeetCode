class Solution {
    public boolean check(String s1, String s2, String s3, int i, int j, Boolean [][]mem){
        //base case;
        if(i==s1.length() && j==s2.length()){
            return mem[i][j]=true;
        }
        if(mem[i][j] != null){
            return mem[i][j];
        }
        if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j)){
            mem[i][j] = check(s1, s2, s3, i+1,j,mem);
            if(mem[i][j]==true){
                return true;
            }
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(i+j)){
            mem[i][j] = check(s1, s2, s3, i,j+1,mem);
            if(mem[i][j]==true){
                return true;
            }
        }
        mem[i][j]=false;
        return mem[i][j];
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length()+s2.length()!=s3.length()){
            return false;
        }
        Boolean mem[][] = new Boolean[s1.length()+1][s2.length()+1];
        return check(s1,s2,s3,0,0,mem); 
    }
}