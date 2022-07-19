class Solution {
public int search(int[] nums, int target) {
    int i=0, j=nums.length-1, mid=0;
    while(i<=j){
        mid = i+(j-i)/2;
        if (nums[mid]==target){
            return mid;
        }
        if (nums[mid]>target){
            j=mid-1;
        }
        if (nums[mid]<target){
            i=mid+1;
        }
    }
    return -1;
}
}
