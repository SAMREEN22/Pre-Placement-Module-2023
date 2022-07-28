class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] right=new int[nums.length];
        int p=1;	
        for(int i=nums.length-1;i>=0;i--){
            p=p*nums[i];
            right[i]=p;
        }
        p=1;
        int[] res=new int[nums.length];
        for(int j=0;j<nums.length-1;j++){
            int rightp=right[j+1];
            int ans=p*rightp;
            res[j]=ans;
            p=p*nums[j];
        }
        res[nums.length-1]=p;
        return res;
    }
}
