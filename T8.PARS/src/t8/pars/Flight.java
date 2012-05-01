package t8.pars;

import java.util.Date;

public class Flight {

    private String departureLocation;
    private String arrivalLocation;
    private String arrivalTime;
    private String departureTime;
    private Date departureDate;
    private Ticket ticket;
    private SeatClass seatClass;
    private int flightNumber;
    private int numbOfSeatsTaken = 30;
    private int numbOfAvailSeats;

    private void incrementNumberOfAvailSeats() {
        numbOfSeatsTaken++;
    }

    public String getNextAvailableSeat() {
        return null;
    }

    public void makeReservation(Customer cust) {
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
     * Get the value of flightNumber
     *
     * @return the value of flightNumber
     */
    public int getFlightNumber() {
        return flightNumber;
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
}
