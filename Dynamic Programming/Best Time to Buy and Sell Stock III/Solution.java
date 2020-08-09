class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n<2 || prices==null)
            return 0;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        right[n-1]=0;
        int lmin=prices[0];
        int rmin=prices[n-1];
        for(int i=1;i<n;i++){
            lmin=Math.min(lmin,prices[i]);
            left[i]=Math.max(left[i-1], prices[i]-lmin);
            if(n-i>=1){
                rmin=Math.max(rmin,prices[n-i-1]);
                right[n-i-1]=Math.max(right[n-i], rmin-prices[n-i-1]);
            }
        }
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            if(left[i]+right[i]>profit)
                profit=left[i]+right[i];
        
        return profit;
    }
}
