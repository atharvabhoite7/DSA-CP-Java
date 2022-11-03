public class RemoveString {
    public static void main(String[] args) {
        String str = skip("hello atharva here. nice guy atharva");
        System.out.println(str);
    }

    static String skip(String str1){
        String str2 = str1.replace(" atharva","");
        return str2;
    }
}