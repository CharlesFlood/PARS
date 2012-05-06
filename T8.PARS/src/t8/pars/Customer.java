package t8.pars;

import java.util.Date;

public class Customer
{
    private String name;
    private String address;
    private int phoneNumber;
    private Date dateOfBirth;
    private CreditCard creditCard;
    private ConfirmationNumber confirmationNumber;

    public Customer(String name,
                    String address,
                    int phoneNumber,
                    Date dateOfBirth,
                    CreditCard creditCard)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.creditCard = creditCard;
        confirmationNumber = new ConfirmationNumber();    
    }

    public String getName()
    {
        return name;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public CreditCard getCreditCard()
    {
        return creditCard;
    }

    public ConfirmationNumber getConfirmationNumber()
    {
        return confirmationNumber;
    }

    public void setConfirmationNumber(ConfirmationNumber confirmationNumber)
    {
        this.confirmationNumber = confirmationNumber;
    }

    public String getFullAddress()
    {
        return address;
    }
}
