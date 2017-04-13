public class FlightControl {
    private Queue queue = new Queue( );

    public Integer watingQueueSize( ) {
        return this.queue.getSize( );
    }

    public String authorizeTakeOff( ) {
        if( this.queue.getSize( ) == 0 )
            return "There's no flight wating to take off.";

        else {
            Flight takeOff = ( Flight ) this.queue.remove( );
            return "Authorizing taking off:\n" + takeOff.data( );
        }
    }

    public void addFlight( String name, String id, String origin,
                           String destination, String model, Integer passengers,
                           Integer capacity ) {
        Flight flight = new Flight( name, id, origin, destination, model,
                                    passengers, capacity );
        this.queue.add( flight );
    }

    public void showWatingQueue( ) {
        this.queue.iterateOver( );
    }

    public String showFirstContent( ) {
        if( 0 != this.queue.getSize() )
            return queue.showFirst( );
        else
            return "There's no flight.";
    }
}