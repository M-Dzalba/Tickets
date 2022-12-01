package model;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.List;

public class Root {
    private List<Flight> flights;
    @JsonGetter("tickets")
    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Root{" +
                "flights=" + flights +
                '}';
    }
}
