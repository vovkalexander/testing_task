package com.gridnine.testing;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
/**
 * Interface FilterBuilding.
 * @author Vovk Alexander  vovk.ag747@gmail.com
 * @version $Id$
 * @since 0.1
 */
public class FilterBuilding implements FilterByCurrentTime,
        FilterByEarlierArrival, FilterByTimeOnGround, Display {

    @Override
    public void displayAllFlights(List<Flight> flights) {
        System.out.println("___Display of all flights___");
        for (Flight flight : flights ) {
            this.printFlight(flights.indexOf(flight), flight);
        }
        System.out.println(System.lineSeparator());
    }

    @Override
    public   List<Flight> untilCurrentTime(List<Flight> flights) {
        List<Flight> filter = new ArrayList<>();
        LocalDateTime localTime = LocalDateTime.now();
        for (Flight flight : flights) {
            for (Segment seg : flight.getSegments()) {
                if (seg.getDepartureDate().isBefore(localTime)) {
                    filter.add(flight);
                    System.out.println("___filter by flight where departing  " +
                            "was until current time:___ ");
                    this.printFlight(flights.indexOf(flight), flight);
                    System.out.println(System.lineSeparator());
                }
            }
        }
        return filter;
    }

    @Override
    public List<Flight> arrivalEarlierThanFlyout(List<Flight> flights) {
        List<Flight> filter = new ArrayList<>();
        for (Flight flight : flights) {
            for (Segment seg : flight.getSegments()) {
                if (seg.getDepartureDate().isAfter(seg.getArrivalDate())) {
                    filter.add(flight);
                    System.out.println("___filter by flight where arrival is earlier  " +
                            "than departing:___ ");
                    this.printFlight(flights.indexOf(flight), flight);
                    System.out.println(System.lineSeparator());
                }
            }
        }
        return filter;
    }

    @Override
    public List<Flight> timeOnGroundMoreTwoHours(List<Flight> flights) {
        Segment first;
        Segment second;
        List<Flight> filter = new ArrayList<>();
        for (Flight flight : flights) {
            List<Segment> segments = flight.getSegments();
            for (int i = 0; i < (segments.size() - 1); i++) {
                first = segments.get(i);
                if (first != segments.get(segments.size() - 1)) {
                    second = segments.get(i + 1);
                    if (second.getDepartureDate().getHour() -
                            first.getArrivalDate().getHour() > 2) {
                        filter.add(flight);
                        System.out.println("___filter by flight where Time on ground exceeds two hours:___");
                        this.printFlight(flights.indexOf(flight), flight);

                    }

                }
            }
        }
        return filter;
    }
    /**
     * Method  displays filtered flight.
     * @param number - flight's position in list.
     * @param flight - filtered flight
     */
    public void printFlight(int number, Flight flight) {
        System.out.println("Flight № " + number);

        flight.getSegments().stream().forEach(segment -> {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM YYYY, HH:mm ");
            System.out.println("Departure date: " + dtf.format(segment.getDepartureDate()));
            System.out.println("Arrival date: " + dtf.format(segment.getArrivalDate()));
        });

    }
}
