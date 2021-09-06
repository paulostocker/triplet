import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TripletTest {

	@Test
	public void shouldCountThreeTriplets() {
		
		Triplet triplet = new Triplet();
		
		long assertCount = 3l;
		int threshold = 8;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(3);
	    
		long count = triplet.countTriplesWithSumMinorEqualsThanThreshold(list, threshold);
		assertEquals(assertCount, count);
	}
	
	@Test
	public void shouldCountOneTriplets() {
		
		Triplet triplet = new Triplet();
		
		long assertCount = 1l;
		int threshold = 6;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(3);
	    
		long count = triplet.countTriplesWithSumMinorEqualsThanThreshold(list, threshold);
		assertEquals(assertCount, count);
	}
}
