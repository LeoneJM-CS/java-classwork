package ClassWork;

public class function {
	
	public int max(int [] values) {
		int max = 0;
		for(int i=0; i<values.length; i++) {
			if(values[i] > max) {
				max = values[i];
			}
		}
		return max;
	}
	
	public int min(int [] values) {
		int max = 0;
		for(int i=0; i<values.length; i++) {
			if(values[i] > max) {
				max = values[i];
			}
		}
		int min = max;
		for(int i=0; i<values.length; i++) {
			if(values[i] < min) {
				min = values[i];
			}
		}
		return min;
	}
	
	public double avg(int [] values) {
		double avg = 0;
		for(int i=0; i<values.length; i++) {
			avg = avg + values[i];
		}
		avg = avg/values.length;
		return avg;
	}
}
