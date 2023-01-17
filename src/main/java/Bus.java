import java.util.ArrayList;

public class Bus {
//    public int passengerCount;
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, Integer capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }
    public int passengerCount(){
        return this.passengers.size();
    }
    public String getDestination(){
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Person> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Person> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Person person){
        int peopleOnBus = this.passengerCount();

        if (this.capacity> peopleOnBus){
            this.passengers.add(person);
        }
    }

    public  void removePassenger(Person person){
        this.passengers.remove(person);
    }

}
