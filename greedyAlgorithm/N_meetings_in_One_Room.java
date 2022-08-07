package greedyAlgorithm;
import java.util.*;
public class N_meetings_in_One_Room {
	
	

	public static void main(String[] args) {
		
		int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        MaxMeetings(start,end,n);

	}
	
	static void MaxMeetings(int start[], int end[] , int n) {
		ArrayList<meeting> meet = new ArrayList<>();
		
		//Store the meetings in form of (start time, end time, position) in the meet arraylist
		for(int i = 0; i<start.length; i++) 
			meet.add(new meeting(start[i], end[i], i+1));
		
		// Sort the meetings in meet according to the ending time
		meetingComparator mc = new meetingComparator();
		Collections.sort(meet, mc);
		
		//Look for the possible meetings that can be conducted
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(meet.get(0).pos);
		int limit = meet.get(0).end;
		
		
		for(int i = 1; i<start.length; i++) {
			if(meet.get(i).start>limit) {
				limit = meet.get(i).end;
				ans.add(meet.get(i).pos);
			}
		}
		System.out.println("The order in which the meetings will be performed is ");
        for(int i = 0;i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
	}

}
	class meeting{
		int start; //Meeting start time
		int end;   //Meeting end time
		int pos;  //position
		
		meeting(int start , int end , int pos){
			this.start = start;
			this.end = end;
			this.pos = pos;
		}
	}
	
	class meetingComparator implements Comparator<meeting>{

		@Override
		public int compare(meeting o1, meeting o2) {
			if(o1.end < o2.end)return -1;
			else if( o1.end >o2.end) return 1;
			else if(o1.pos<o2.pos)return -1;  //if ending time of both the meeting are same
			return 1;
		}
		
	}