package timeofday;
/**
 * Elke instantie van deze klasse stelt een tijdstip van gehele getallen voor.
 
 */



public class TimeOfDay {
	
	private int minuten=0;
	
	
	public int getUur() {
		return minuten/60;
	}
	public int getMinuten() {
		return minuten%60;
	}
	
	
	public void setUur(int uur) {
		if (uur>23)
			throw new IllegalArgumentException("PAS OP:te veel uur gegeven"); 
		if (uur<0)
			throw new IllegalArgumentException("PAS OP:te weinig uur gegeve");
		this.minuten = (minuten%60)+(60*uur);
	}
	
	public void setMinuten(int Minuten) {
		if (Minuten>59)
			throw new IllegalArgumentException("PAS OP :te veel minute gegeven") ;
			
		if (Minuten<0)
			throw new IllegalArgumentException("PAS OP :te weinig minute gegeve");
		this.minuten = (minuten/60)*60+ Minuten ;
	}

}
