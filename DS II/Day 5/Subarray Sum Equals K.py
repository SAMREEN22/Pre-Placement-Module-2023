class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        s=0
        d={0:1}
        c=0
        for i in range(len(nums)):
            s=s+nums[i]
            if (s-k) in d:
                c=c+d[s-k]
            if s in d:
                d[s]+=1
            else:
                d[s]=1
        return c
                
            
