// Last updated: 8/12/2026, 10:18:21 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int md=0;
        int a=0;
        for(int[] d:dimensions){
            int l=d[0],w=d[1];
            int di=l*l+w*w;
            int area=l*w;
            if(di>md || (di ==md&&area >a)){
                md=di;
                a=area;
            }
        }return a;
    }
}