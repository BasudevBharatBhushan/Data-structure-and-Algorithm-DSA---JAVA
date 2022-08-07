package arrays;

public class Best_Time_To_BuyNSell_Stock_II {

	public static void main(String[] args) {
		
//		int prices[] = {7 , 1 , 5 , 3 , 6 , 4 , 1 , 11, 3 , 2};
		
		int prices[] = {7 , 1 , 4 , 3 , 3, 2, 10, 7 , 6 , 5, 11, 13 , 15};
		
//		int prices[] = {7 , 6 , 4 , 3 , 2 , 1};
		
		System.out.println(maxProfit(prices));

	}
	
    public static int maxProfit(int[] prices) {
    	
    	int n = prices.length;
    	int Profit = 0;
    		
    	int i = 0;
    	while(i<n) {
    				
    		int min = prices[i];
    		while( i<n && prices[i]<=min  ) {
    		    min = prices[i];
    			i++;
    		}
            if(i==n)break;
    		min = prices[i-1];
			
    		int max = prices[i];
    		while(i<n && prices[i]>=max ) {
    			max = prices[i];
    			i++;
			}
    		max = prices[i-1];
    				
    		Profit += (max - min);
    		
    }
    	
    	
        return Profit;
    }

}
