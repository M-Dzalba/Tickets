package service;

import model.Flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class TimeConverter {
    public static long differenceInTime(Flight flight) throws ParseException {
        SimpleDateFormat format=new SimpleDateFormat("HH:mm");
        Date departure_Time=format.parse(flight.getDeparture_time());
        Date arrival_Time=format.parse(flight.getArrival_time());
        long diff = arrival_Time.getTime()-departure_Time.getTime();
        return (diff / 1000)  / 60;
    }


}
