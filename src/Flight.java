public class Flight implements Node {
    String name, id, origin, destination, model;
    Integer passengers, capacity;

    public Flight( String name, String id, String origin, String destination,
                   String model, Integer passengers, Integer capacity ) {
        this.name = name;
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.model = model;
        this.passengers = passengers;
        this.capacity = capacity;
    }

    public String getName( ) {
        return this.name;
    }

    public String getId( ) {
        return this.id;
    }

    public String getOrigin( ) {
        return this.origin;
    }

    public String getDestination( ) {
        return this.destination;
    }

    public String getModel( ) {
        return this.model;
    }

    public Integer getPassengers( ) {
        return this.passengers;
    }

    public Integer getCapacity( ) {
        return this.capacity;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public void setOrigin( String origin ) {
        this.origin = origin;
    }

    public void setDestination( String destination ) {
        this.destination = destination;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public void setPassengers( Integer passengers ) {
        this.passengers = passengers;
    }

    public void setCapacity( Integer capacity ) {
        this.capacity = capacity;
    }

    public String info( ) {
        return "Flight name: " + this.name + "\tID: " + this.id;
    }

    public String data( ) {
        return "-- Flight manifest --" + "\n" +
               "Name: " + this.name + "\n" +
               "ID: " + this.id + "\n" +
               "Origin: " + this.origin + "\n" +
               "Destination: " + this.destination + "\n" +
               "Model: " + this.model + "\n" +
               "Passengers: " + this.passengers + "\n" +
               "Capacity: " + this.capacity;
    }
}