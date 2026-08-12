# Last updated: 8/12/2026, 10:17:21 PM
class Solution:
    def maximumValue(self, n: int, s: int, m: int) -> int:
        if n==1:
            return s
        ups=n//2
        return s+ups*m-max(0,ups-1)
        