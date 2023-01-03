// Solution to problem number 944 of Leetcode

class Solution {
    public int minDeletionSize(String[] strs) {
        String s = strs[0];
        int n = s.length();
        int count=0;

        for(int i=0; i<n; i++){
            char prev = s.charAt(i);
            for(int j=1; j<strs.length; j++){
                char next = strs[j].charAt(i);
                if(next < prev){
                    count++;
                    break;
                } 
                prev=next;           
            }
        }
        return count;
    }
}