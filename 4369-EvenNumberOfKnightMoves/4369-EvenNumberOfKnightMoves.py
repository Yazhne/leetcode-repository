# Last updated: 8/12/2026, 10:17:14 PM
class Solution:
    def canReach(self, start: list[int], target: list[int]) -> bool:
        start_m=(start[0]+start[1])%2
        target_m=(target[0]+target[1])%2
        return start_m==target_m
        