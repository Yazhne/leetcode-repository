# Last updated: 8/12/2026, 10:17:19 PM
class Solution:
    def maxPairStrength(self, nums: list[int]) -> int:
        max_strength=0
        for a,b in combinations(nums,2):
            g=math.gcd(a,b)
            strength=(a*b)//(g*g)
            if strength>max_strength:
                max_strength=strength
        return max_strength
        