class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        initial=prices[0]
        mp=0
        for i in range(1,len(prices)):
            if initial<prices[i]:
                mp=max(mp,prices[i]-initial)
            else:
                initial=prices[i]
        return mp
