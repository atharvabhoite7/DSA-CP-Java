public class Nto1 {
    public static void main(String[] args) {
        funcStraightRev(5);
    }

    static void func(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        func(n - 1);
    }
    
    static void funcRev(int n) {
        if (n == 0) {
            return;
        }
        funcRev(n - 1);
        System.out.println(n);
    }

    static void funcStraightRev(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funcStraightRev(n - 1);
        System.out.println(n);
    }



}
