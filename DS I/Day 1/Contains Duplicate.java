class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        HashMap<Integer,Integer> old= new HashMap<>();
        boolean duplicate = false;
        int j = 0;
        while(j<nums.length && !duplicate)
        {
            if(old.containsKey(nums[j]))
            {
                duplicate = true;
            }
            old.put(nums[j], j);
            j++;
        }
        
        return duplicate;
    }
}
