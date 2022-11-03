// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Patterns{
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern1(int n){
        for (int row=1; row<=n;row++){
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row=1; row<=n;row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row=n; row>=1;row--){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row=1; row<=n;row++){
            for(int col=1; col<=row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row=1; row<2*n;row++){
          int c= row>n? 2*n-row: row;

            for(int col=1; col<=c; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <=n; row++ ){

            for (int space = 0; space < n -row; space++){
                System.out.print(" ");
            }
            for(int col = row; col >=1; col --){
                System.out.print(col);
            }

            for (int col=2; col<=row; col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }

    
}