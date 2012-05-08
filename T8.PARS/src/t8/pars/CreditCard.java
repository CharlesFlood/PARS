package t8.pars;

import java.util.Date;
/**
 *
 * @author Charles Flood
 */
public class CreditCard {
    private Date expirationDate;
    private String nameOnCard;
    private int cardNumber;
    private int securityNumber;

    public CreditCard(Date expirationDate,
            String nameOnCard,
            int cardNumber,
            int securityNumber) throws IllegalArgumentException
    {
        boolean validInfo =  validateCreditCardNumber(cardNumber)
                && validateSecurityNumber(securityNumber)
                && validateCreditCardInformation();
        if (validInfo)
        {
            this.expirationDate = expirationDate;
            this.nameOnCard = nameOnCard;
            this.cardNumber = cardNumber;
            this.securityNumber = securityNumber;            
        }
        else
        {
            throw new IllegalArgumentException("Credit Card Information are not valid");
        }
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public String getHiddenCardNumber()
    {
        String numberString = Integer.toString(cardNumber);
        numberString = "xxxxxxxx" + numberString.substring(12, 16);
        return numberString;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }
    public String getNameOnCard() {
        return nameOnCard;
    }
    public int getSecurityNumber() {
        return securityNumber;
    }
    
    private boolean validateCreditCardNumber(int creditCardNumber)
    {
        String number = creditCardNumber + "";
        return number.length()== 16;       
    }

    private boolean validateSecurityNumber(int securityNumber)
    {
        String number = securityNumber + "";
        return number.length()== 3;
    }

    private boolean validateCreditCardInformation()
    {
        return true;
    }
    
    private boolean chargeCreditCard()
    {
        return true;
    }
}
