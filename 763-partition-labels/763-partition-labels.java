class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int maxIndex = Integer.MIN_VALUE;
        int index =-1;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    maxIndex = Math.max(maxIndex, j);
                }
            }
            if(i==maxIndex){
                res.add(maxIndex-index);
                index=i;
                maxIndex=i;
            }
        }
        return res;
    }
}