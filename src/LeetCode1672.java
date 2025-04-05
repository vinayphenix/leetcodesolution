public class LeetCode1672 {
    public int maximumWealth(int[][] accounts) {
        int highestBalance = 0;
        for (int i = 0;i< accounts.length;i++) {
            int balance = 0;
            for (int j= 0;j<accounts[i].length;j++) {
                
                balance += accounts[i][j];
            }
            if (balance>highestBalance) {
                highestBalance = balance;
            }
        }
       return highestBalance; 
    }
}
