// Solution to problem number 131 of Leetcode

class Solution {
    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public void solve(String s, int i, List<List<String>> mainList, List<String> list) {
        if (i == s.length()) {
            mainList.add(new ArrayList<>(list)); // on rewching end of the string
            return;
        }

        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(s, i, j)) {
                list.add(s.substring(i, j + 1));
                solve(s, j + 1, mainList, list); // recur
                list.remove(list.size() - 1); // backtrack to remove additional possibilties of partition
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> mainList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(s, 0, mainList, list);

        return mainList;
    }
}