package rough;

public class While_Loop {

	public static void main(String[] args) {
		
		int arr []= {5 , 4 , 3 , 2 , 1,7,8,9};
		
		int min = arr[0];
		
		int i = 0;
		
		while(arr[i]<=min)i++;
		
		System.out.println(arr[i]);
			

	}

}
