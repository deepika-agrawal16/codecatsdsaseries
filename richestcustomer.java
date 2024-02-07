public class richestcustomer {
    
        public int maximumWealth(int[][] accounts) {
            int result = Integer.MIN_VALUE;
            for(int i=0;i<accounts.length;i++){
                int rowsum = 0;
                for(int j=0;j<accounts[i].length;j++){
                    rowsum += accounts[i][j];
                }
                if(rowsum > result){
                    result = rowsum;
                }
            }
            return result;
        }
    
}
