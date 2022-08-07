package arrays;
import java.math.BigInteger;
import java.util.*;
//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

public class Pascal_Traingle_II {

	public static void main(String[] args) {
		System.out.println(getRow(33));

	}
    public static List<Integer> getRow(int rowIndex) {
        
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++) {
            res.add(1);
            for(int j = i-1; j > 0; j--) {
                res.set(j, res.get(j-1) + res.get(j));
            }
        }
        return res;
        
    }
    
        static BigInteger combination(int i , int j){
        	
        if(j<= (i/2)){
            j = (i -j);
        }
        BigInteger den = factorial(i-j);
  
        BigInteger num = new BigInteger("1");
        while(i>j){
            BigInteger k = new BigInteger(Integer.toString(i));
            BigInteger bigProduct = k.multiply(num);
            num = bigProduct;
        }
        
        BigInteger comb  = num.divide(den);
        
        return comb;
        
    }
    
    static BigInteger factorial(int x){
        BigInteger fact=new BigInteger("1");
        
        for(int i = 1; i<=x; i++){
        	BigInteger j = new BigInteger(Integer.toString(i));
            BigInteger bigProduct = j.multiply(fact);
            fact = bigProduct;
        }
        return fact;
    }	

}
