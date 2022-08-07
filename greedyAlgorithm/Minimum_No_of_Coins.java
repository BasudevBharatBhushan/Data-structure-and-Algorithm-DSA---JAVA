package greedyAlgorithm;
import java.util.*;
public class Minimum_No_of_Coins {

	public static void main(String[] args) {
		int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		
		System.out.println(MinCoins(coins, 49));

	}
	
	static int MinCoins(int coins[] , int v) {
		
		List<Integer> ans = new ArrayList<>();
		
		int n = coins.length;
		int change = 0;
		
		for(int i = n-1 ; i>=0; i--) {
			while(v>=coins[i]) {
				v-=coins[i];
				ans.add(coins[i]);
			}
		}
		
		
		return ans.size();
	}

}
