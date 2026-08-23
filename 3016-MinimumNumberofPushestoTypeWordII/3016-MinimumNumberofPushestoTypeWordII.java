// Last updated: 8/23/2026, 10:47:04 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        double ans=0;
4        int count=-1;
5        int n=nums1.length;
6        int m=nums2.length;
7        int len=(n+m);
8        
9        double x=0;
10        double y=0;
11        int i=0;
12        int j=0;
13        while(i<n&&j<m){
14            if(nums1[i]<nums2[j]){
15                count++;
16                if(count==(len-1)/2){
17                    x=nums1[i];
18                }
19                else if(count==(len/2)){
20                    y=nums1[i];
21                }
22                i++;
23            }
24            else {
25                count++;
26                if(count==(len-1)/2){
27                    x=nums2[j];
28                }
29                else if(count==(len/2)){
30                    y=nums2[j];
31                }
32             j++;
33            }
34        }
35        while(i<n){
36            count++;
37            if(count==(len-1)/2){
38                x=nums1[i];
39            }
40            else if(count==len/2){
41                y=nums1[i];
42            }
43            i++;
44        }
45
46         while(j<m){
47            count++;
48            if(count==(len-1)/2){
49                x=nums2[j];
50            }
51            else if(count==len/2){
52                y=nums2[j];
53            }
54            j++;
55        }
56        if(len%2==1) return x;
57        return (x+y)/2;
58
59
60    }
61}