package greedyAlgorithm;
import java.util.*;
public class Minimum_Platform {
	public static void main(String args[]) {
		
		int[] arr ={900,945,955,1100,1500,1800};
		int[] dep={920,1200,1130,1150,1900,2000};
		int n=arr.length;
		int totalCount=findPlatform(arr,dep,n);
		System.out.println("Minimum number of Platforms required "+totalCount);
		
	}
	
	static int findPlatform(int arr[], int dep[], int n) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i = 1, j = 0;
		int result = 1, plat_needed = 1;
		
		while(i<n && j<n) {
			if(arr[i]<=dep[j]) {
				plat_needed++;
				i++;
			}else {
				plat_needed--;
				j++;
			}
			
			result = Math.max(result, plat_needed);
		}
		
		return result;
	}
}

