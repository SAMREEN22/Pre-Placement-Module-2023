class Solution
{
    public int maxSubArray(int[] nums) {
        int sumss=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum=max(nums[i],nums[i]+sum);
            if(sumss<sum)
            {
                sumss=sum;
            }
        }
        return sumss;
    } 
    public int max(int a, int b)
    {
        if (a>b) 
            return a;
        return b;
    }
}
