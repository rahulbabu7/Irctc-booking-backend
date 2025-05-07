package ticket.booking.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.HashMap;

public class Train {
    private String trainId;
    private String trainNo;
    private Date departureTime;
    private List<List<Integer>> seats;
    private HashMap<String,Time> stationTomes;
    private List<String> stations;

}
