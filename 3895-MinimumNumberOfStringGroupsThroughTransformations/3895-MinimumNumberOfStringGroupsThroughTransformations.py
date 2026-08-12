# Last updated: 8/12/2026, 10:18:04 PM
from typing import List
class Solution:
    def minimumGroups(self, words: List[str]) -> int:
        def s_r(s):
            n=len(s)
            if n<=1:
                return s
            ss=s+s
            i,j,k=0,1,0
            while i<n and j<n and k<n:
                if ss[i+k]==ss[j+k]:
                    k+=1
                elif ss[i+k]>ss[j+k]:
                    i=i+k+1
                    if i<=j:
                        i=j+1
                    k=0
                else:
                    j=j+k+1
                    if j<=i:
                        j=i+1
                    k=0
            start=min(i,j)
            return ss[start:start+n]
        groups=set()
        for word in words:
            e=word[::2]
            o=word[1::2]
            key=(s_r(e),s_r(o))
            groups.add(key)
        return len(groups)
        