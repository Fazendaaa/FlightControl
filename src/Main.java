import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner( System.in );
    private static FlightControl control = new FlightControl( );

    public static void main( String []args ) {
        Integer input = 0;

        while( 6 != input ) {
            System.out.println( "\n-- Flight Management --\n" +
                                "Options:\n" +
                                "1. Show queue size;\n" +
                                "2. Authorize take off;\n" +
                                "3. Add a new flight;\n" +
                                "4. Show all flights;\n" +
                                "5. Show first flight manifest;\n" +
                                "6. Exit.\n" );

            if( 6 != ( input = scanner.nextInt( ) ) ) {
                switch( input ) {
                    case 1:
                        queueSize( );
                        break;
                    case 2:
                        authorizeFlight( );
                        break;
                    case 3:
                        addFlight( );
                        break;
                    case 4:
                        showFlights( );
                        break;
                    case 5:
                        showFirstFlight( );
                        break;
                    default:
                        System.out.println( "Invalid option. Type again\n" );
                }
            }
        }
    }

    private static void queueSize( ) {
        System.out.println( "Queue size: " + control.watingQueueSize( ) );
    }

    private static void addFlight( ) {
        String name, id, origin, destination, model;
        Integer passengers, capacity;

        System.out.println( "-- Type the flight info --" );

        System.out.print( "Name: " );
        name = scanner.next( );
        
        System.out.print( "ID: " );
        id = scanner.next( );
        
        System.out.print( "Origin: " );
        origin = scanner.next( );
        
        System.out.print( "Destination: " );
        destination = scanner.next( );

        System.out.print( "Model: " );
        model = scanner.next( );

        System.out.print( "Passengers: " );
        passengers = scanner.nextInt( );
        
        System.out.print( "Capacity: " );
        capacity = scanner.nextInt( );

        control.addFlight( name, id, origin, destination, model, passengers,
                           capacity );

        System.out.println( );
    }

    private static void authorizeFlight( ) {
        System.out.println( control.authorizeTakeOff( ) );
    }

    private static void showFlights( ) {
        control.showWatingQueue( );
    }

    private static void showFirstFlight( ) {
        System.out.println( control.showFirstContent( ) );
    }
}