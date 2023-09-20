class Solution {
    public String reorderSpaces(String text) {
        int ct =0;
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch == ' ') ct++;
        }
        if(ct == 0) return text;
String ans = "";
        String[] str = text.trim().split("\\s+");
        if(str.length == 1) {
            ans+=str[0];
            while(ct-->0){
                ans+=" ";
            }
            return ans;
        }
        int extra = ct%(str.length-1);
        int space = ct/(str.length-1);
        
        
        for(int i=0; i<str.length-1; i++){
            ans+=str[i].trim();
            int n = space;
            while(n-->0){
                ans+=" ";
            }
            
        }
        ans+=str[str.length -1];
        if(extra > 0){
            while(extra-->0){
                 ans+=" ";
            }
        }
        return ans;
    }
}