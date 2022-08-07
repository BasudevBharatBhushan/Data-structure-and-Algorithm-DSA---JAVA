package rough;

public class Combination {

	public static void main(String[] args) {
		System.out.println(combination(18,9));
	}
    static long combination(int i , int j){
        if(j<= (i/2)){
            j = (i -j);
        }
        long den = factorial(i-j);
  
        long num = 1;
        while(i>j){
            num*=i;
            i--;
        }
        System.out.println(num);
        long comb = (num/den);
        
        return comb;
        
    }
    
    static long factorial(int x){
        long fact=1;
        
        for(int i = 1; i<=x; i++){
            fact*=i;
        }
        return fact;
    }	

}
