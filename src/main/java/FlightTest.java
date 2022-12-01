import model.Flight;
import model.Root;
import service.TimeConverter;

import java.text.ParseException;


public class FlightTest {
    public static void main(String[] args) throws ParseException {

        int sumMinutes=0;
        int valueOfFlights=1;

        Root root=JsonParser.jsonParse();

        for (Flight flight : root.getFlights()) {
            sumMinutes += TimeConverter.differenceInTime(flight);
            valueOfFlights++;
        }
        float avgFlightInMinutes=sumMinutes/valueOfFlights;
        System.out.println("Average flight time in minutes: "+avgFlightInMinutes);


    }
}
