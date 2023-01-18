// Solution to problem number 1291 of Leetcode

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        String str = "123456789";

        for(int i=1; i<=9; i++){
            for(int j=0;i+j<=str.length(); j++){
                String subStr = str.substring(j,i+j);
                int value = Integer.parseInt(subStr);

                if(value>=low && value<=high){
                    list.add(value);
                }
            }
        } 
        return list;
    }
}