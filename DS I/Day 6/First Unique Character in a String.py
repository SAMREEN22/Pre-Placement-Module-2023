class Solution:
    def firstUniqChar(self, s: str) -> int:
        d={i: s.count(i) for i in set(s) if s.count(i)==1} #creating dictionary of all non repeative words in string
        for i in s:
            if i in d:
                return s.index(i)
        return -1
