package com.gridnine.testing;
import java.util.List;
/**
 * Interface FilterByCurrentTime.
 * @author Vovk Alexander  vovk.ag747@gmail.com
 * @version $Id$
 * @since 0.1
 */
public interface FilterByCurrentTime {
    /**
     * Method  infiltrates flights by departing until the current time.
     * @param flights - list of all flights.
     * @return list of 	filtered flights.
     */
    List<Flight> untilCurrentTime(List<Flight> flights);
}
