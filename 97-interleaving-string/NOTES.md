**Recursion - Time Limit Exceeded - O(2^n+m)**
```
public boolean check(String s1, String s2, String s3, int i, int j, int n){
//base case;
if(n==s3.length() && i==s1.length() && j==s2.length()){
return true;
}
boolean res = false;
if(i<s1.length() && j<s2.length() &&
s1.charAt(i)==s3.charAt(n) &&
s2.charAt(j)==s3.charAt(n)){
res = res || check(s1,s2,s3,i+1,j,n+1) || check(s1,s2,s3,i,j+1,n+1);
}
else if(i<s1.length() && s1.charAt(i)==s3.charAt(n)){
res = res || check(s1,s2,s3,i+1,j,n+1);
}
else if(j<s2.length() && s2.charAt(j)==s3.charAt(n)){
res = res || check(s1,s2,s3,i,j+1,n+1);
}
return res;
}
```
​
**Recursion + Memoization (dont need to recalculate subproblems)**
```
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
```