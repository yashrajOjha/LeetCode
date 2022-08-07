```
class Solution {
//need map to introduce memoization
int MOD = (int) Math.pow(10,9) +7;
Map<String, Long> map = new HashMap<>();
public long func(int remainChar, char prevChar){
if(remainChar==0) return 1;
String key = "" + remainChar + prevChar; //calculated any pervios permutation
if(map.containsKey(key)) return map.get(key);
long total=0;
switch(prevChar){
case 'a': total = (func(remainChar-1,'e'))%MOD;
break;
case 'e': total = (func(remainChar-1,'e') + func(remainChar-1,'i')) %MOD;
break;
case 'i': total = (func(remainChar-1,'a') + func(remainChar-1,'e') + func(remainChar-1,'o')+func(remainChar-1,'u')) %MOD;
break;
case 'o': total = (func(remainChar-1,'i') + func(remainChar-1,'u')) %MOD;
break;
case 'u': total = (func(remainChar-1,'a')) %MOD;
break;
}
map.put(key,total);
return total;
}
public int countVowelPermutation(int n) {
long total =0;
char []charSet = {'a','e','i','o','u'};
for(char c:charSet){
total = (total + func(n-1,c))%MOD;//length of string reduces
}
return (int)total;
}
}
```