package arrays;

public class Merge_Two_Sorted_Arrays {

	public static void main(String[] args) {
//		int arr1[] = {1,4,7,8,10,0};
//		int arr2[] = {2,3,9};
//		
		int arr1[] = {1,2,4,5,6};
		int arr2[] = {3};
		
		merge_Two_Sorted_Arrays(arr1, arr1.length, arr2, arr2.length);
		
		for(int e:arr1) {
			System.out.print(e+" ");
		}
		
		System.out.println();
		
		for(int e:arr2) {
			System.out.print(e+" ");
		}

	}
	
	public static void merge_Two_Sorted_Arrays(int a[] , int m , int b[] , int n) {
		
//
//        int mid = 0;
//        if(m+n %2 ==1 ) mid = (m+n+1)/2 ;
//        
//        else mid = (m+n)/2;
		int mid =(int) Math.ceil((double)(n + m) / 2.0);
		
		while(mid>0) {
			int i = 0 , j = mid;
			while(j< m+n ) {
				if(i < m && j< m) {
					if(a[i]>a[j])sameArraySwap(a , i , j);
					i++;j++;
					
				}else if(i<m && j>= m) {
					if(a[i]>b[j-m])diffArraySwap(a ,b , i , j-m);
					i++;j++;
					
				}else if(i>=m && j>=m) {
					if(b[i-m]>b[j-m])sameArraySwap(b , i-m , j-m);
					i++;j++;
				}
				
			}
			if (mid == 1) {
			      mid = 0;
			 } else {
			      mid =(int) Math.ceil((double) mid / 2.0);
			}
		}
		
		
	}
	
	static void sameArraySwap(int a[] , int i , int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j] = temp;
	}
	
	static void diffArraySwap(int a[] , int b[] , int i , int j) {
		int temp = a[i];
		a[i]=b[j];
		b[j]=temp;
	}
	
	
	
	

}
