package t8.pars;

import java.util.UUID;
/**
 *
 * @author
 */
    
public class ConfirmationNumber
{
    private String confirmationNumber;
	
    public ConfirmationNumber()
    {
    	generateConfirmationNumber();
    }

    private void generateConfirmationNumber()
    {
		UUID uniqueString;
		String uniqueConfirmationNumber;

		uniqueString = UUID.randomUUID();
		uniqueConfirmationNumber = uniqueString.toString();
		confirmationNumber = id.substring(0, 8);
    }
    
    public String getConfirmationNumber()
    {
        return confirmationNumber;
    }
}
