package org.gfg.thread.flightSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class FlightClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AirlineFlightSearchInterface airlineFlightSearchInterface1 = new AirIndia();
        AirlineFlightSearchInterface airlineFlightSearchInterface2 = new Indigo();
        List<AirlineFlightSearchInterface> list = new ArrayList<>();
        list.add(airlineFlightSearchInterface1);
        list.add(airlineFlightSearchInterface2);
        AggregatorService aggregatorService = new AggregatorService(list);
        System.out.println(aggregatorService.getAllFlights("delhi", "goa" ));
    }
}
// 1) abstract -> Runnable interface
// 2) see the time difference sequential order , parallel order