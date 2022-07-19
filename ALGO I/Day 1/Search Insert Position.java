class Solution {
    public int searchInsert(int[] nums, int target) {
     int len=nums.length;
     int l=0;
     int r=len-1;
     while(l<=r)   
     {
         int mid=(l+r)/2;
         if(nums[mid]==target)
         {
             return mid;
         }
         if(nums[mid]<target)
         {
             l=mid+1;
         }
         else {
             r=mid-1;
         }
     }
     return Math.max(l,r);   
    }
}
