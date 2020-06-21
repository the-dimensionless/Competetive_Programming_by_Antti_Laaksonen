package greedy_algorithms;

import java.util.Arrays;

/**
 * Let us now consider a problem where we are given n tasks with durations and deadlines and 
 * our task is to choose an order to perform the tasks. For each task, we earn d−x points 
 * where d is the task’s deadline and x is the moment when we ﬁnish the task. 
 * What is the largest possible total score we can obtain? 
 * 
 * @author sumitsingh
 *
 */
public class TasksAndDeadlines {
	
	static class Tasks implements Comparable<Tasks> {
		private int duration;
		private int deadlines;
		private char id;
		
		Tasks(int duration, int deadlines, char ch) {
			this.id = ch;
			this.deadlines = deadlines;
			this.duration = duration;
		}
		
		@Override
		public String toString() {
			return "id:"+this.id+" duration:"+this.duration+" deadline:"+this.deadlines;
		}

		@Override
		public int compareTo(Tasks arg0) {
			if (arg0.duration <= this.duration) {
				return 1;
			} else {
				return -1;
			}
		}

	}
	
	public static void main(String[] args) {
		
		int timeline = 0;
		int earnings = 0;
		Tasks tasks[] = {new Tasks(4,2,'A'), new Tasks(3,5,'B'), new Tasks(2,7,'C'), new Tasks(4,5,'D')};
		
		Arrays.sort(tasks);	// Simple trick
		
		for(Tasks t: tasks) {
			timeline += t.duration;
			System.out.println(t.toString());
			System.out.println("Points earned "+(t.deadlines-timeline));
			earnings += t.deadlines - timeline;
		}
		
		System.out.println("Total earnings: "+earnings);
	}
	

}
