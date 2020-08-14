class Solution {
    public int minSteps(int n) {
        int total=0,paste=2;
        while(n>1){
            while(n%paste==0){
                total+=paste;
                n/=paste;
            }
            paste++;
        }
        return total;
    }
}
