# Last updated: 8/12/2026, 10:17:41 PM
class Solution:
    def minAdjacentSwaps(self, nums: list[int], a: int, b: int) -> int:
        MOD=10**9+7
        c0=0
        c1=0
        c2=0
        s=0
        for num in nums:
            if num<a:
                s+=c1+c2
                c0+=1
            elif num<=b:
                s+=c2
                c1+=1
            else:
                c2+=1
        return s%MOD
        