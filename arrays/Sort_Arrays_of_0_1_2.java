package arrays;

public class Sort_Arrays_of_0_1_2 {

	public static void main(String[] args) {
		int nums[] = {2,0,2,1,1,0};
		sortArray(nums);
		
		for(int e:nums) {
			System.out.print(e+" ");
		}

	}
	
	static void sortArray(int arr[]) {
		
		int n = arr.length;
		
		int i = 0 , j = n-1;
		int k = 0;
		while(k<=j) {
			switch(arr[k]) {
			case 0:
				swap( arr , k , i);
				k++;
				i++;
				break;
			
			case 1:
				k++;
				break;
			
			case 2:
				swap( arr , k , j);
				j--;
				break;
			
			
		}
		}
		
		
	}
	
	static void swap(int arr[] , int i , int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
