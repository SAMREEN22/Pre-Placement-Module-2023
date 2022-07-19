class Solution:
    def longestPalindrome(self, s: str) -> str:
        res_len = 0
        res = ""
        for i in range(2*len(s)+1):
            l = r = i//2
            if i%2==1:
                r = r+1
            val = ""
            val_len = 0
            while l>=0 and r < len(s) and s[l]==s[r]:
                if l==r:
                    val = val + s[l]
                    val_len += 1
                else:
                    val = s[l] + val + s[r]
                    val_len += 2
                if val_len>=res_len:
                    res = val
                    res_len = val_len
                l = l - 1
                r = r + 1     
        return res
