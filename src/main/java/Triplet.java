import java.util.Collections;
import java.util.List;

public class Triplet {

	public long countTriplesWithSumMinorEqualsThanThreshold(List<Integer> list, int threshold) {
	    
		Collections.sort(list);
	    
	    long sumTriplets = 0;
	    int size = list.size() -1;
	    
	    for (int first = 0; first < size; first++) {
            for (int second = first+1; second < size; second++) {
                for (int third = second+1; third < size; third++) {
                    if ( (list.get(first) + list.get(second) + list.get(third)) <= threshold) {
                        sumTriplets++;
                    }
                }
            }
        }
	    return sumTriplets;
	}
	
}
