import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 4);
        busStop = new BusStop("City Centre");
        person = new Person();
    }

    @Test
    public void canCountPassengers(){
        assertEquals(0, bus.getPassengersCount());
    }

    @Test
    public void canAddPassengerIfEnoughCapacity(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengersCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getPassengersCount());
    }

    @Test
    public void canPickUpPassenger(){
        busStop.addPersonToQueue(person);
        bus.pickUpPassengerFromBusStop(busStop);
        assertEquals(1, bus.getPassengersCount());

    }





}
