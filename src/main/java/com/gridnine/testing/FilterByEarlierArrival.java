package com.gridnine.testing;
import java.util.List;
/**
 * Interface FilterByEarlierArrival.
 * @author Vovk Alexander  vovk.ag747@gmail.com
 * @version $Id$
 * @since 0.1
 */
public interface FilterByEarlierArrival {
    /**
     * Method  infiltrates flights where there are segments
     * with an arrival date earlier than the departure date.
     * @param flights - list of all flights.
     * @return list of 	filtered flights.
     */
    List<Flight> arrivalEarlierThanFlyout(List<Flight> flights);
}
