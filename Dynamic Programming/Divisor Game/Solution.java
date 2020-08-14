class Solution {
    public boolean divisorGame(int N) {
        int[] a=new int[N+1];
        a[0]=0;
        a[1]=0;
        for(int i=2;i<=N;i++)
            for(int j=1;j<i;j++)
                if(i%j==0 && a[i-j]==0){
                    a[i]=1;
                    break;
                }
        return a[N]==1 ? true :false;
    }
}
