class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        l=len(s1)
        s1="".join(sorted(s1))
        i=0
        l_s2=list(s2)
        for i in range(len(s2)-l+1):
            sub_s2=l_s2[i:i+l]
            sub_s2="".join(sorted(sub_s2))
            if sub_s2==s1:
                return True
        return False 
