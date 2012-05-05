package t8.pars;
import java.util.Date;
public class Customer {

    private String name;
    private String fullAddress;
    private int phoneNumber;
    private Date dateOfBirth;
    private CreditCard creditCard;
    private Flight flight;
    private char gender;//we assume that this will not change
    private ConfirmationNumb confirmationNumber;

    public Customer(String name, String fullAddress, int phoneNumber, Date dateOfBirth, CreditCard creditCard, Flight flight, char gender, ConfirmationNumb confirmationNumber) {
        this.name = name;
        this.fullAddress = fullAddress;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.creditCard = creditCard;
        this.flight = flight;
        this.gender = gender;
        this.confirmationNumber = confirmationNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public ConfirmationNumb getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(ConfirmationNumb confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
    
    public void change(String type, String value){
        //I'm not sure what this is supposed to do.
    }

}
