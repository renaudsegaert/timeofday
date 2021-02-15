package timeofday;
/**
 * Elke instantie van deze klasse stelt een tijdstip van gehele getallen voor.
 
 */



public class TimeOfDay {
	private int uur;
	private int minuten;
	
	
	public int getUur() {
		return uur;
	}
	public int getMinuten() {
		return minuten;
	}
	
	/**
	 * Stelt de ondergrens van dit tijdstip-object in.
	 * 
	 * @post De ondergrens van dit tijdstip-object is gelijk aan de gegeven ondergrens.
	 *     | getUur() == Uur
	 
	 */
	public void setUur(int Uur) {
		if (Uur>23)
			throw new IllegalArgumentException("PAS OP:te veel uur gegeven"); 
		if (Uur<0)
			throw new IllegalArgumentException("PAS OP:te weinig uur gegeve");
		this.uur = Uur;
	}
	/**
	 * Stelt de ondergrens van dit tijdstip-object in.
	 * 
	 * @post De ondergrens van dit tijdstip-object is gelijk aan de gegeven ondergrens.
	 *     | getMinuten() == Minuten
	 
	 */	
	public void setMinuten(int Minuten) {
		if (Minuten>59)
			throw new IllegalArgumentException("PAS OP :te veel minute gegeven") ;
			
		if (Minuten<0)
			throw new IllegalArgumentException("PAS OP :te weinig minute gegeve");
		this.minuten = Minuten;
	}

}
