// Solution to problem number 1833 of Leetcode

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;

         if(costs[0]>coins){
                return 0;
            } 

        for(int i = 0; i<costs.length; i++){
            if(coins >= costs[i]){
                coins -= costs[i];
                count++;
            }      
        }
        return count;
    }
}