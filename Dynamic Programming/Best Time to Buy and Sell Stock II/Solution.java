class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)
                min=prices[i];
            
            else if(prices[i]-min>0){
                profit=profit+prices[i]-min;
                min=prices[i];
            }
        }
        return profit;
        
    }
}
