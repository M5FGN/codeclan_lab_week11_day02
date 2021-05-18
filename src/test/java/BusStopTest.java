import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("City Centre");
    }

    @Test
    public void canCountPassengersInQueue(){
        assertEquals(0, busStop.countPassengersInQueue());
    }


    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.countPassengersInQueue());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.countPassengersInQueue());
    }

}
