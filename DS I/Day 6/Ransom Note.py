from collections import Counter
class Solution(object):
    def canConstruct(self, rNote, mag):
        rc=Counter(rNote)
        for k,v in rc.items():
            if k not in mag :
                return False
            elif v>mag.count(k):
                return False
        return True
