package t8.pars;
import java.util.Date;
public class Customer {

    private String name;
    private String address;
    private int phoneNumber;
    private Date dateOfBirth;
    private CreditCard creditCard;
    private Flight flight;
    private char gender;//we assume that this will not change
    private ConfirmationNumber confirmationNumber;
    

    public Customer(String name, String fullAddress, int phoneNumber, Date dateOfBirth, CreditCard creditCard, Flight flight, char gender, ConfirmationNumber confirmationNumber) {
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

    public ConfirmationNumber getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(ConfirmationNumber confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public char getGender() {
        return gender;
    }
    
    
    public void change(String type, String value){
        //I'm not sure what this is supposed to do.
    }

}
