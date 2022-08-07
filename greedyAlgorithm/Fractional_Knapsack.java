package greedyAlgorithm;
import java.util.*;
public class Fractional_Knapsack {

	public static void main(String[] args) {
		int n = 3, weight = 50;
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println("The maximum value is "+ans);

	}
	
    static double fractionalKnapsack(int W, Item arr[], int n) {
        
    	Arrays.sort(arr, new itemComparator());
    	
    	double finalValue = 0.0;
    	
    	for(int i = 0 ; i<n ; i++) {
    		if(arr[i].weight <= W) {
    			finalValue += arr[i].value;
    			W -= arr[i].weight;
    		}else {
    			if(W!=0){
    				double unitValue = ((double)arr[i].value/(double)arr[i].weight)*(double)W;
    				finalValue += unitValue;
    				return finalValue;
    			}else {
    				return finalValue;
    			}
    		}
    	}
    	
    	return finalValue;
    }
	
	

}

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class itemComparator implements Comparator<Item>{
	public int compare(Item o1, Item o2) {
		double r1 = (double)(o1.value)/(double)(o1.weight);
		double r2 = (double)(o2.value)/(double)(o2.weight);
		if(r1>r2)return -1;
		else if(r1<r2)return 1;
		else return 0;
		
	}
}