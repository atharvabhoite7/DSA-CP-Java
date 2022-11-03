import java.util.ArrayList;

// In this we return an ArrayList

public class Subsequences2 {
    public static void main(String[] args) {
        
        System.out.println(subseq("", "bcd"));
    }

    static ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left= subseq(p + ch, up.substring(1));
        ArrayList<String> right= subseq(p, up.substring(1));
        
        left.addAll(right);
        return left;
    }
}
