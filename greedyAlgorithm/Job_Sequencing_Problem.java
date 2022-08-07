package greedyAlgorithm;
import java.util.*;
public class Job_Sequencing_Problem {

	public static void main(String[] args) {
		
		Job job[] = {new Job(1,4,20),
				new Job(2, 5, 60),
				new Job(3, 6, 70),
				new Job(4, 6, 65),
				new Job(5,4,25),
				new Job(6, 2, 80),
				new Job(7,2,10),
				new Job(8,2,22),
				}; 
		
		int res[] = JobScheduling(job, job.length);
		
		for(int e:res)System.out.print(e+" ");

	}
	
	static int[] JobScheduling(Job arr[], int n){
		
		Arrays.sort(arr, (a,b)->(b.profit - a.profit));
		
	     int maxi = 0;
	     for (int i = 0; i < n; i++) {
	        if (arr[i].deadline > maxi) {
	           maxi = arr[i].deadline;
	        }
	     }		
		
		int result[] = new int[maxi+1];
		
		Arrays.fill(result, -1);
		int maxProfit = 0;
		int countJob = 0;
		
		for(int i = 0 ; i< n ; i++) {
			
			for(int j = arr[i].deadline; j>0; j--) {
				
				if(result[j]==-1) {
					result[j]=i;
					countJob++;
					maxProfit += arr[i].profit;
					break;
					
				}
			}
			
		}
		
        return new int[] {countJob, maxProfit};
    }
	
}

class Job{
	int id, profit, deadline;
	Job(int x , int y, int z){
		this.id = x;
		this.deadline = y;
		this.profit = z;
	}
}


	
