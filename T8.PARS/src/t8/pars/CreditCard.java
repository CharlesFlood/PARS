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

    public CreditCard(Date expirationDate, String nameOnCard, int cardNumber, int securityNumber) {
        this.expirationDate = expirationDate;
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }
    public int getCardNumber() {
        return cardNumber;
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
}
