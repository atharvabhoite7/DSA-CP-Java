class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();

        String[] arr = s.split(":", -2);

        String startStr = arr[0];
        String endStr = arr[1];

        char startCh = startStr.charAt(0);
        char endCh = endStr.charAt(0);

        int startNum = startStr.charAt(1) - '0';
        int endNum = endStr.charAt(1) - '0';

        char currCh = startCh;
        int currNum = startNum;
        while(currCh <= endCh){
            currNum = startNum;
            while(currNum <= endNum){
                String currStr = currCh + String.valueOf(currNum);
                list.add(currStr);
                currNum++;
            }
            currCh++;
        }
          return list;
    }
}