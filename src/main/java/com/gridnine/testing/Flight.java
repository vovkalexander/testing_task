package com.gridnine.testing;
import java.util.List;
/**
 * Flight.
 * @author Vovk Alexander  vovk.ag747@gmail.com
 * @version $Id$
 * @since 0.1
 */
public class Flight {
    /**
     * Field - stores list of segments.
     */
    private final List<Segment> segments;
    /**
     * Constructor for activation fields.
     */

    public Flight(final List<Segment> segs) {
        this.segments = segs;
    }
    /**
     * Method  returns list of segments.
     * @return list of segments.
     */

    public List<Segment> getSegments() {
        return segments;
    }

}
