package com.gridnine.testing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

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
        try(BufferedReader reader = new BufferedReader(new FileReader("icons/swear.txt"))) {
         String line;
         while ((line = reader.readLine()) != null) {
             System.out.println(line);
         }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
