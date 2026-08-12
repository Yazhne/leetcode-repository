# Last updated: 8/12/2026, 10:17:30 PM
class Solution:
    def rearrangeString(self, s: str, x: str, y: str) -> str:
        others=[]
        ys=[]
        xs=[]
        for ch in s:
            if ch==y:
                ys.append(ch)
            elif ch==x:
                xs.append(ch)
            else:
                others.append(ch)
        return "".join(others+ys+xs)
        