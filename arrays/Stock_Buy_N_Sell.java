package arrays;


public class Stock_Buy_N_Sell {

	public static void main(String[] args) {
		int nums[] = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(nums));
		
		int prices []= { 2 , 30 , 15 , 10 , 8 , 25 , 80};
		System.out.println(buy_n_sell_Twice(prices));

	}

	public static int maxProfit(int[] prices) {
		
		int n = prices.length;
		
		int min = Integer.MAX_VALUE;
		int profit = 0;
		
		for(int i = 0 ; i< n ; i++) {
			
			min = Math.min(min, prices[i]);
			profit = Math.max(profit, prices[i]-min);
		}
		
		return profit;
	}
	
	public static int buy_n_sell_Twice(int [] prices) {
		int firstbuy = Integer.MIN_VALUE; 
		int firstsell = 0;
		
		int secondbuy = Integer.MIN_VALUE;
		int secondsell = 0;
		
		int n = prices.length;
		
		for(int i = 0 ; i< n ; i++ ) {
			
			firstbuy = Math.max( firstbuy, - prices[i]);
			firstsell = Math.max(firstsell, firstbuy+prices[i]);
			
			secondbuy = Math.max(secondbuy , firstsell- prices[i]);
			secondsell = Math.max(secondsell, secondbuy+prices[i]);
		}
		return secondsell;
		
		
	}
}
