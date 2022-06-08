class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int N=nums.length,front=0,back=0;
    
    
    int target2=0,target3=0;
    List<List<Integer>> b = new ArrayList<>();
    if (N == 0)
        return b;
    
    Arrays.sort(nums);
    
    for(int i =0;i<N;i++){
        target3=target-nums[i];
        for(int j=i+1;j<N;j++){
            // there is a reson -a-b
            target2=target3-nums[j];
            front=j+1;
            back=N-1;
            
            while(front<back){
                int sumtwo= nums[front]+nums[back];
                if(sumtwo>target2){
                    back--;
                }
                else if(sumtwo<target2){
                    front++;
                }
                else if (sumtwo==target2){
                    List <Integer> in = new ArrayList<>();
                    // wo khudi add kr dega index
                    // much time >25 minutes here
                    in.add(nums[i]);
                    in.add(nums[j]);
                    in.add(nums[front]);
                    in.add(nums[back]);
                    
                    b.add(in);
                while(front<back && in.get(2)==nums[front])
                ++front;
                while(front<back && in.get(3)==nums[back])
                --back;
                }
            
            }
            
            while((j+1)<N && nums[j]==nums[j+1])
            ++j;
            
        }
        while((i+1)<N && nums[i]==nums[i+1])
            ++i;
    }
    return b;

    }
}