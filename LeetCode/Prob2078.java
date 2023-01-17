// Solution to problem number 2078 of Leetcode

class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;
        int dist1=0;
        int dist2=0;
        while(i<=j){
            if(colors[i]!=colors[j]){
               dist1 = Math.abs(i-j);
               break;
            }
            j--;
        }

        int p=0;
        int q=colors.length-1;
        
        while(p<=q){
            if(colors[p]!=colors[q]){
               dist2 = Math.abs(p-q);
               break;
            }
            p++;
        }

        return Math.max(dist1,dist2);
    }
}