package com.gridnine.testing;
/**
 * Main.
 * @author Vovk Alexander (vovk.ag747@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Main {
    public static void main(String[] args) {
        FilterBuilding filter = new FilterBuilding();
        filter.displayAllFlights(FlightBuilder.createFlights());
        filter.untilCurrentTime(FlightBuilder.createFlights());
        filter.arrivalEarlierThanFlyout(FlightBuilder.createFlights());
        filter.timeOnGroundMoreTwoHours(FlightBuilder.createFlights());
    }

}
