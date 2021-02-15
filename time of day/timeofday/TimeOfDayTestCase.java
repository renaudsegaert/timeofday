package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import timeofday.TimeOfDay;

class TimeOfDayTestCase {

	@Test
	void test() {
		TimeOfDay timeofday = new TimeOfDay();
		
		 
		timeofday.setUur(23);
		timeofday.setMinuten(0);
		int minuten = timeofday.getMinuten();
		int uur = timeofday.getUur();
		
		
		
		
		assertEquals(23, uur);
		assertEquals(0,minuten);
		
		
		
		
		
	}

}
