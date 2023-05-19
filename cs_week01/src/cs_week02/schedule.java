package cs_week02;

public class schedule implements Comparable<schedule>{
	int start;
	int end;
	
	public schedule() {}
	
	public schedule(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(schedule o) {
		if(end > o.end)
			return 1;
		else if(end < o.end)
			return -1;
		else
			return 0;
	}
}
