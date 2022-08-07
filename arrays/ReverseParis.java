package arrays;

public class ReverseParis {

	public static void main(String[] args) {
		int arr[]={1,3,2,3,1};
        System.out.println("The Total Reverse Pairs are "+reversePairs(arr));
	}
	
	//l = starting index   r = ending index
	static int merge(int arr[], int l , int m , int r) {
		
		//Step 1: Define the array Sizes
		int n1 = m - l + 1;
		int n2 = r-m;
		
		//Step 2: Initialize a left and right array
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//Step 3: Insert Elements in the Array
		for(int i = 0 ; i<n1; i++) {
			L[i]=arr[l+i];
		}
		
		for(int i = 0; i<n2; i++) {
			R[i]= arr[m+ 1 + i];
		}
		
		int j = 0, count = 0;
		for(int i = 0; i<n1; i++) {
			while(j<n2 && L[i]>(2*(long)R[j])) {
				j++;
			}
			count+=(j);
		}
		
		//Step 4: Merge L and R array
		// Initial indexes of first and second subarrays
				int i = 0; j = 0;

				// Initial index of merged subarray array
				int k = l;
				while (i < n1 && j < n2) {
					if (L[i] <= R[j]) {
						arr[k] = L[i];
						i++;
					}
					else {
						arr[k] = R[j];
						j++;
					}
					k++;
				}

				/* Copy remaining elements of L[] if any */
				while (i < n1) {
					arr[k] = L[i];
					i++;
					k++;
				}

				/* Copy remaining elements of R[] if any */
				while (j < n2) {
					arr[k] = R[j];
					j++;
					k++;
				}
		
		return count;
		
	}
	
	static int merge_sort(int arr[] , int l , int r) {
		if(l>=r)return 0;
		int m = (l + (r))/2;
		int inv = merge_sort(arr , l , m);
		inv+= merge_sort(arr, m+1 , r);
		inv+= merge(arr , l , m , r);
		return inv;
	}
	
	static int reversePairs(int[] arr) {
		return merge_sort(arr, 0 , arr.length-1);
	}

}
