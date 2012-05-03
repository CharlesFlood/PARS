package t8.pars;

import java.util.Date;

public class Flight {

    private String departureLocation;
    private String arrivalLocation;
    private String arrivalTime;
    private String departureTime;
    private Date departureDate;
    private Ticket ticket;
    private SeatClass seatClass = SeatClass.FIRST;
    private int flightNumber;
    private int numbOfSeatsTaken;
    private int numbOfAvailSeats;

    /**
     * Get the value of flightNumber
     *
     * @return the value of flightNumber
     */
    public int getFlightNumber() {
        return flightNumber;
    }

    public boolean hasOpenSeats() {
        boolean hasOpenSeats = false;
        if (numbOfAvailSeats > 0) {
            hasOpenSeats = true;
        }
        return hasOpenSeats;
    }

    private void incNumbOfOpenSeats() {
        numbOfSeatsTaken++;
    }

    public int getNextAvailableSeat() {
        //if full
        if (numbOfAvailSeats == 30) {
            return -1;
        } else {
            return (numbOfSeatsTaken + 1);
        }
    }

    public void makeReservation(Customer cust) {
        validateCustomer(cust);
        int seatNumb = getNextAvailableSeat();
        incNumbOfOpenSeats();
        // Code to add to text file:
        /**
         * *****************************
         * new line + seatNum: \t Customer name, age, etc...
         ******************************
         */
        validateReservation();
    }

    /**
     * Get the value of arrivalLocation
     *
     * @return the value of arrivalLocation
     */
    public String getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * Get the value of departureTime
     *
     * @return the value of departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Get the value of departureDate
     *
     * @return the value of departureDate
     */
    public Date getDepartureDate() {
        return departureDate;
    }

    /**
     * Get the value of numbOfAvailSeats
     *
     * @return the value of numbOfAvailSeats
     */
    public int getNumbOfAvailSeats() {
        return numbOfAvailSeats;
    }

    /**
     * Get the value of arrivalTime
     *
     * @return the value of arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Get the value of seatCapacity
     *
     * @return the value of seatCapacity
     */
    public int getNumbOfSeatsTaken() {
        return numbOfSeatsTaken;
    }

    /**
     * Get the value of seatClass
     *
     * @return the value of seatClass
     */
    public SeatClass getSeatClass() {
        return seatClass;
    }

    /**
     * Get the value of ticket
     *
     * @return the value of ticket
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * Get the value of departureLocation
     *
     * @return the value of departureLocation
     */
    public String getDepartureLocation() {
        return departureLocation;
    }

    private void validateCustomer(Customer cust) {
        String error = null;
        if (cust == null) {
            error = "Variable customer is set to null";
        } else {
            if (cust.getName() == null) {
                error = "Customer name required.";
            }
            if (cust.getFullAddress() == null) {
                error += System.getProperty("line.seperator") + "Customer address required.";
            }
            if (cust.getPhoneNumber() == null) {
                error += System.getProperty("line.seperator") + "Customer phone number required.";
            }
            if (cust.DOB() == null) {
                error += System.getProperty("line.seperator") + "Customer date of birth required.";
            }
            if (cust.getGender() == null) {
                error += System.getProperty("line.seperator") + "Customer gender required.";
            }
        }
        if (!(error == null)) {
            throw new NullPointerException(error);
        }
    }

    private void validateReservation() {
        //should check textfile to see if the last line is the reservation
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private Ticket makeTicket(ConfirmationNumb cn) {
        if (cn == null) {
            throw new NullPointerException("Confirmation Number not valid.");
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
