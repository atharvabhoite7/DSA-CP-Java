// Solution to problem number 2244 of Leetcode

class Solution {
    public int minimumRounds(int[] tasks) {
        int count =0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<tasks.length; i++){
            if(map.containsKey(tasks[i])){
                int val = map.get(tasks[i]);
                val+=1;
                map.put(tasks[i], val);
            } else {
                map.put(tasks[i], 1);
            }2
        }

        for(int i: map.keySet()){
            int num = map.get(i);
           if(num<2){
            return -1;
           }
            if( num==2 || num==3){
               count++;
           } 
            if(num > 3){
               int div = num/3;
               int rem = num%3;

               if(rem > 0){
                   count+=div+1;
               } else {
                   count+=div;
               }
           }
        }
        return count;
    }
}