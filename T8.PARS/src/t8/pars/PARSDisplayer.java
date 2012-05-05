package t8.pars;

/**
 *
 * @author
 */
public class PARSDisplayer {
    
    private Customer customer;
    private Flight flight;
    private ConfirmationNumber confirmation;

    public PARSDisplayer() {
    }

    public PARSDisplayer(Customer customer, Flight flight) {
        this.customer = customer;
        this.flight = flight;
    }

    public PARSDisplayer(Customer customer, Flight flight, ConfirmationNumber confirmation) {
        this.customer = customer;
        this.flight = flight;
        this.confirmation = confirmation;
    }
    
    public void printRequestDepartureLocation(){}
    public void printRequestDepartureDate(){}
    public void printRequestReturnDate(){}
    public void printRequestCustomerName(){}
    public void printRequestAddress(){}
    public void printRequestPhoneNumber(){}
    public void printRequestDateOfBirth(){}
    public void printRequestCreditCardNumber(){}
    public void printRequestGender(){}
    //not entirely sure this next one is needed
    public void printConfirmationNumber(ConfirmationNumber confirmation){}
    public void printConfirmationNumber(){}
    public void printAvailableFlights(){}
    public void printTicket(){}
    public void printConfirmAllInformation(){}
}