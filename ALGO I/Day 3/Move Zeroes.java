class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]==0)
                c++;
        }
        int g=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]!=0)
            {
                nums[g]=nums[i];
                g++;
            }
            else if(nums[i]==0)
            {
                continue;
            }
        }
        for(int i=g;i<=nums.length-1;i++)
        {
            nums[i]=0;
        }
    }
}
