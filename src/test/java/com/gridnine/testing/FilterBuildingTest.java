package com.gridnine.testing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * FilterBuildingTest.
 * @author Vovk Alexander (vovk.ag747@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FilterBuildingTest {
    @Test
    public void test1() {
        List<Flight> flight = FlightBuilder.createFlights();
        List<Flight> filter = new ArrayList<>(new FilterBuilding().untilCurrentTime(flight));
       assertThat(flight.indexOf(filter.get(0)), is(2));
    }
    @Test
    public void test2() {
        List<Flight> flight = FlightBuilder.createFlights();
        List<Flight> filter = new ArrayList<>(new FilterBuilding().arrivalEarlierThanFlyout(flight));
        assertThat(flight.indexOf(filter.get(0)), is(3));
    }

    @Test
    public void test3() {
        List<Flight> flight = FlightBuilder.createFlights();
        List<Flight> filter = new ArrayList<>(new FilterBuilding().timeOnGroundMoreTwoHours(flight));
        assertThat(flight.indexOf(filter.get(0)), is(4));
    }
}
