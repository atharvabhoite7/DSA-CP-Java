class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (char ch : map.keySet()) {
            int val = map.get(ch);

            if (!set.contains(val)) {
                set.add(val);
            } else {
                while (val > 0 && set.contains(val)) {
                    val--;
                    count++;
                }
            }

            if (val > 0) {
                set.add(val);
            }
        }
        return count;
    }
}

      
                 
            

              
                
              
                    
                    
                    
                
            

                
                
            