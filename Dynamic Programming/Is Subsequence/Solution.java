class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        for(int i=0;i<t.length();i++){
            if(count<s.length() && t.charAt(i)==s.charAt(count) ){
                count++;
            }
        }
        return count==s.length() ? true: false;
    }
}
