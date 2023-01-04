// Solution to problem number 763 of Leetcode

class Solution {
    public List<Integer> partitionLabels(String s) {
        int last = s.lastIndexOf(s.charAt(0));
        int count=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<s.length(); i++){
            count++;
            if(s.lastIndexOf(s.charAt(i)) > last){
                last = s.lastIndexOf(s.charAt(i));
            }
            if(i==last){
                
                list.add(count);
                count=0;
                if(i!=s.length()-1){
                    last = s.lastIndexOf(s.charAt(i));
                }
                
            }
        }

        return list;
    }
}