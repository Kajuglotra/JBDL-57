package org.gfg.thread.flightSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class AggregatorService {

    // thread creation -> executor service
    // list of implentations

    private List<AirlineFlightSearchInterface> list;
    private ExecutorService executorService;

    public AggregatorService(List<AirlineFlightSearchInterface> list) {
        this.list = list;
        executorService = Executors.newFixedThreadPool(list.size());
    }
    public List<FlightData> getAllFlights(String src, String dest) throws ExecutionException, InterruptedException {
        // callable -> call method
        List<Callable> listOfCallables  = new ArrayList<>();
        List<FlightData> result = new ArrayList<>();
        for(AirlineFlightSearchInterface impl: list){
            listOfCallables.add(new Callable() {
                @Override
                public List<FlightData> call() throws Exception {
                    return impl.getAllFlightFromSrcToDest(src, dest);
                }
            });
            List<Future<FlightData>> listOfFutureOfFlightData = new ArrayList<>();
            for(Callable c: listOfCallables){
                listOfFutureOfFlightData.add(executorService.submit(c));
            }

            for(Future<FlightData> f:  listOfFutureOfFlightData) {
                result.add(f.get());
            }
        }
        executorService.shutdown();
        return result;
    }
}
