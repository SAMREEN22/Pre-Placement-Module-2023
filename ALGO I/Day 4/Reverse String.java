class Solution {
    public void reverseString(char[] s) {
        int size=s.length;
        if (size==1)
            return;
        int left=0;
        int right=size-1;
        char tempL;
        char tempR;
        while (left<=right) {
            tempL=s[left];
            tempR=s[right];
            s[left]=tempR;
            s[right]=tempL;
            left++;
            right--;
        }
    }
}
