class Solution {
    public String getPermutation(int n, int k) {
        int fact =1;
        List<Integer> num = new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            num.add(i);
        }
        num.add(n);
        String ans="";
        k=k-1; //0th index
        while(true){
            //till list is not empty
            ans = ans+ num.get(k/fact);
            num.remove(k/fact); // remove the selected element
            if(num.size()==0){
                break;
            }
            k=k%fact; //next value of the set
            fact=fact/num.size(); //size of the new list
        }
        return ans;
    }
}