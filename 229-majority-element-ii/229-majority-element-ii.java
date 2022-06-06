class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1,num2=-1,c1=0,c2=0;
        for(int ele:nums){
            if(ele==num1) c1++;
            else if(ele==num2) c2++;
            else if(c1==0){
                c1=1;
                num1=ele;
            }else if(c2==0){
                c2=1;
                num2=ele;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        ArrayList<Integer> res= new ArrayList<>();
        for(int ele:nums){
            if(ele==num1){
                c1++;
            }else if(ele==num2){
                c2++;
            }
        }
        if(c1>(nums.length/3)) res.add(num1);
        if(c2>(nums.length/3)) res.add(num2);
        return res;
    }
}