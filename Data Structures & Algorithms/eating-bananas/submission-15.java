class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = piles[0];
        for(int p : piles){
            r = Math.max(r, p);
        }
        int res = r;

        while(l<=r){
            int m = (l+r)/2;
            double time = 0;
            for(int p : piles){
                time += Math.ceil((double)p/m);
            }
            if(time <=h){
                res = m;
                r = m -1;
            } else {
                l = m +1;
            }
        }
        return res;

    }
}
