```
public void func(int num, List<Integer> res, String val, int n, int k){
if(val.length()==n){
res.add(Integer.valueOf(val));
return;
}
for(int i=0;i<=9;i++){
if(Math.abs(num-i)==k){
func(i,res,val+String.valueOf(i),n,k);
}
}
}
```