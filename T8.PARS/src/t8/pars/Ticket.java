package t8.pars;

/**
 *
 * @author Charles Flood
 */
public class Ticket {
    
    private ConfirmationNumber confirmation;
    private Customer customer;
    private Flight flight;
    private String ticket;
    private int ticketPrice;

    public Ticket(ConfirmationNumber confirmation, Customer customer, Flight flight) {
        this.confirmation = confirmation;
        this.customer = customer;
        this.flight = flight;
    }
    
    private ConfirmationNumber generateConfirmationNumber(){
        
        return null;
    }

    public ConfirmationNumber getConfirmation() {
        return confirmation;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
