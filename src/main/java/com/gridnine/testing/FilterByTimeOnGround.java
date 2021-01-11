package com.gridnine.testing;
import java.util.List;
/**
 * Interface FilterByTimeOnGround.
 * @author Vovk Alexander  vovk.ag747@gmail.com
 * @version $Id$
 * @since 0.1
 */
public interface FilterByTimeOnGround {
    /**
     * Method  infiltrates flights where the total time spent on the ground exceeds two hours.
     * @param flights - list of all flights.
     * @return list of 	filtered flights.
     */
    List<Flight> timeOnGroundMoreTwoHours(List<Flight> flights);
}
