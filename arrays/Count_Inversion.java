package arrays;

public class Count_Inversion {

	public static void main(String[] args) {
		
		int arr[] = {2, 4, 1, 3, 5};
		
		System.out.println(countInversion(arr, 0, arr.length-1));
	}
	static int merge(int arr[], int l, int m, int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];


		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		
		int i = 0, j = 0;
		
		int count = 0;
		
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				count = (n1-i);
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}


		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		return count;
	}

	static int countInversion(int arr[], int l, int r)
	{
		if (l < r) {
		
			int m =l+ (r-l)/2;
			int count = 0;
			count += countInversion(arr, l, m);
			count+=countInversion(arr, m + 1, r);
			count+=merge(arr, l, m, r);
			return count;
		}
		return 0;
		
	}
	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
