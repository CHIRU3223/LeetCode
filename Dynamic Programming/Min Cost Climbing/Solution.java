class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] a=new int[n];
        a[0]=cost[0];
        a[1]=cost[1];
        for(int i=2;i<n;i++){
            a[i]=Math.min(cost[i]+a[i-1],cost[i]+a[i-2]);
        }
        return Math.min(a[n-1],a[n-2]);
    }
}
