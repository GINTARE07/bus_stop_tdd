import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    @Before
    public void before(){
        bus = new Bus("Edinburgh", 10);
        person = new Person();

    }
    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void hasDestination(){
        assertEquals("Edinburgh", bus.getDestination());
    }
    @Test
    public void hasCapacity(){
        assertEquals(10, bus.getCapacity());
    }
    @Test
    public void canAddPassengerIfEnoughCapacity(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void canRefusePassengerIfNotEnoughCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(10, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.passengerCount());
    }

}
