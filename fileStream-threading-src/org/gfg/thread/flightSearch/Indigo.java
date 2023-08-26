package org.gfg.thread.flightSearch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Indigo implements AirlineFlightSearchInterface{
    @Override
    public List<FlightData> getAllFlightFromSrcToDest(String src, String dest) {
        List<FlightData> list  = new ArrayList<>();
        FlightData flightData1 = new FlightData("delhi", "goa", new Date(), 2.5 , 1200, "indigo");
        FlightData flightData2 = new FlightData("delhi", "goa", new Date(), 3 , 1100, "indigo");
        FlightData flightData3 = new FlightData("delhi", "goa", new Date(), 2 , 1300 ,"indigo");
        FlightData flightData4 = new FlightData("delhi", "goa", new Date(), 3.5 , 1400, "indigo");
        list.add(flightData1);
        list.add(flightData2);
        list.add(flightData3);
        list.add(flightData4);
        return list;
    }
}
