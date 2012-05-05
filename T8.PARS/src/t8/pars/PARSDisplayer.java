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
    
    public void printRequestEmployeeID(){System.out.print("Enter Employee ID: ");}
    public void printRequestEmployeePass(){System.out.print("Enter password: ");}
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
    
    public void printMainMenu(){
        System.out.println("Type the numberal of the desired action:");
        System.out.println("1. Reserve a Seat");
        System.out.println("2. Print an Existing Receipt");
        System.out.println("3. Show Available Flights");
        System.out.println("4. Print All Reservations");
        System.out.println("5. Logout");
        System.out.println("6. Quit Aplication");
    }
    public void printMainMenuErrorMessage(){
        System.out.println("That is not a valid option.");
    }
    
}