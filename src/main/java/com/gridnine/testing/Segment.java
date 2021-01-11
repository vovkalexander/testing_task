package com.gridnine.testing;
import java.time.LocalDateTime;
import java.util.Objects;
/**
 * Segment.
 * @author Vovk Alexander  vovk.ag747@gmail.com
 * @version $Id$
 * @since 0.1
 */
public class Segment {
    /**
     * Field - stores date and time of flyout.
     */
    private final LocalDateTime departureDate;
    /**
     * Field - stores date and time of arrival.
     */
    private final LocalDateTime arrivalDate;
    /**
     * Constructor for activation fields.
     */

    public Segment(final LocalDateTime dep, final LocalDateTime arr) {
        departureDate = Objects.requireNonNull(dep);
        arrivalDate = Objects.requireNonNull(arr);
    }
    /**
     * Method  returns date and time of flyout.
     * @return date and time of flyout.
     */

    LocalDateTime getDepartureDate() {
        return departureDate;
    }
    /**
     * Method  returns date and time of arrival.
     * @return date and time of arrival.
     */

    LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                '}';
    }
}
