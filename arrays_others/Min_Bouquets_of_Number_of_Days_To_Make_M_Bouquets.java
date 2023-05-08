package arrays_others;

public class Min_Bouquets_of_Number_of_Days_To_Make_M_Bouquets {

	public static void main(String[] args) {
		int bloomDay1[] = {1, 10, 3, 9, 10, 2}; int m1 = 3, k1 = 2;
		int bloomDay2[] = {1,10,3,10,2}; int m2 = 3, k2 = 1;
		
		
		System.out.println(minDays(bloomDay1, m1, k1));
		
		System.out.println(minDays(bloomDay2, m2, k2));
		
	}
	
	public static int minDays(int[]bloomDay, int m , int k) {
		
		/* 
		 	m  = min no. of bouquet required
		 	k = min no. of flowers needed to make a bouquet
		*/
		
		//--> Edge Case
		if(m*k > bloomDay.length)return -1;
		/*
		 * Example
		 * 
		 * Arr->[2, 5, 3] 
		 * 
		 * boq - 3, flowers - 2
		 * 
		 * Not possible to make 3 boq out of this array, so output will be -1
		 */
		
		
		int lowerLimit = Integer.MAX_VALUE;
		int upperLimit = Integer.MIN_VALUE;
		
		for(int e:bloomDay) {
			lowerLimit = Math.min(lowerLimit, e);
			upperLimit = Math.max(upperLimit,e);
		}
		
		int res = -1;
		
		
		//Binary Search
		while(lowerLimit <= upperLimit) {
			int mid = (lowerLimit+upperLimit)/2;
			
			if(isPossibleSoln(bloomDay, mid, k, m)==true) {
				res = mid;
				upperLimit = mid-1;
			}else {
				lowerLimit = mid+1;
			}
		}
		
		return res;

	}
	

	public static boolean isPossibleSoln(int arr[],int m, int flowers, int boq) {
		
		//m = the mth day
		
		int adj = 0;
		int bouqCount = 0;
		
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i]<=m) {  //Flower has Bloomed
				adj++;
				if(adj == flowers) { //Is the adj value is equal to the min of flowers needed to make a bouquet
					bouqCount++;
					if(bouqCount == boq) {  //Is the bouqCount is equal to the number of bouquet needed to make
						return true;
					}
					adj=0;
				}
			}else {
				adj = 0;
			}
		}
		
		return false;
	}

}
