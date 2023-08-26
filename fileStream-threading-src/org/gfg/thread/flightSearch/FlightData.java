package org.gfg.thread.flightSearch;

import java.util.Date;

public class FlightData {
    private String src;

    private String dest;

    private Date dateOfFlight;

    private double durationOfFlight;

    private int cost;
    private String airlineName;

    public FlightData(String src, String dest, Date dateOfFlight, double durationOfFlight, int cost, String airlineName) {
        this.src = src;
        this.dest = dest;
        this.dateOfFlight = dateOfFlight;
        this.durationOfFlight = durationOfFlight;
        this.cost = cost;
        this.airlineName =airlineName;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Date getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(Date dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public double getDurationOfFlight() {
        return durationOfFlight;
    }

    public void setDurationOfFlight(double durationOfFlight) {
        this.durationOfFlight = durationOfFlight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "FlightData{" +
                "src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                ", dateOfFlight=" + dateOfFlight +
                ", durationOfFlight=" + durationOfFlight +
                ", cost=" + cost +
                ", airlineName='" + airlineName + '\'' +
                '}';
    }
}
