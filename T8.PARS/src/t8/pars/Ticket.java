package t8.pars;

/** walid
 *
 * @author Charles Flood
 */
public class Ticket {
    
    private Customer customer;
    private Flight flight;
    private String ticket;

    public Ticket(Customer aCustomer, Flight aFlight)
    {
        customer = aCustomer;
        flight = aFlight;
    }
    
    public void printReciept()
    {
        System.out.println(customer.getName()
// credit card  + flight number +  confermation number + price                    
                    + customer.getConfirmationNumber());
    }

    @Override
    public String toString()
    {
        ticket = "Name: " + customer.getName() + "/n"
                + flight.getFlightNumber() + "/n"
                + flight.getDepartureLocation() + "/tto/t" + flight.getArrivalLocation() + "/n"
                + flight.getDepartureDate() + " " + flight.getDepartureTime() + "/t" 
 //               + flight.getArrivalDate() + " " + flight.getArrivalTime()
                + customer.getConfirmationNumber();
        
        return ticket;
    }
    
}
