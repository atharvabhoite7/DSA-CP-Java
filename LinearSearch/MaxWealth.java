public class MaxWealth {
    public static void main(String[] args) {
        int [][]accounts={
            {26, 78},
            {56, 8, 90},
            {45, 12, 26},
        };
    
        System.out.println(maximumWealth(accounts));
    }



static int maximumWealth(int [][] accounts){
    //person = rol
    //account = col
    int ans = 0;
    for (int person = 0; person < accounts.length; person++){
        int sum =0;
        for(int account = 0; account < accounts[person].length; account++){
             sum = sum + accounts[person][account];
        }
        if (sum >ans ){
            ans = sum;
        }
    }
    return ans ;
}
}

