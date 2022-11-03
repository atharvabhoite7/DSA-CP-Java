public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(0));
    }

      static int fact(int n){
        if(n ==0){
            return 1;
        }

      return n*fact(n-1);
    }
}


// using recursion
// int n=5;
// int fact =1;
// for (int i=1; i<=n;i++){
//     fact = fact*i;
// }
// System.out.println(fact);
