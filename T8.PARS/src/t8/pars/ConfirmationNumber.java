package t8.pars;

/**
 *
 * @author
 */
public class ConfirmationNumber {
    
    private String confirmationNumber;
    private Customer customer;
    private Flight flight;

    public ConfirmationNumber() {
    }

    
    public ConfirmationNumber(String confirmationNumber, Customer customer, Flight flight) {
        this.confirmationNumber = confirmationNumber;
        this.customer = customer;
        this.flight = flight;
    }
    
    public String generateConfirmationNumber(){
        return null;
    }
    
    public String generateConfirmationNumber(Customer cust, Flight flt){
        
        return null;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }
    
}
