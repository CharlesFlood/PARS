package t8.pars;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public final class Flight
{
    private String departureLocation;
    private String arrivalLocation;
    private String ARRIVAL_TIME = "3:00 PM PST";
    private static final String DEPARTURE_TIME = "12:00 PM PST";
    private Date departureDate;
    private SeatClass seatClass = SeatClass.FIRST;
    private static final int FLIGHT_CAPACITY = 30;
    private int numbOfSeatsTaken;
//    private int numbOfAvailSeats;
    private ArrayList<Customer> passengers;
//    private String date;
    private static final int price = 150;
    private String flightNumber;
        
/*    public Flight()
    {
        setFlightNumber();
    }
*/    
    public Flight(String departure, String arrival, Date date)
    {
        departureLocation = departure;
        arrivalLocation = arrival;
        departureDate = date;
        setFlightNumber();
        passengers = new ArrayList<Customer>();
    }
    
    /**
     * Gets the list of customers reserved on the flight
     * @return the list of customers 
     */
    public ArrayList<Customer> getPassengers() {
        return passengers;
    }
    /**
     * Get the value of flightNumber
     *
     * @return the value of flightNumber
     */
    public boolean hasOpenSeats() {
        boolean hasOpenSeats = false;
        if (numbOfSeatsTaken < FLIGHT_CAPACITY) {
            hasOpenSeats = true;
        }
        return hasOpenSeats;
    }

    private void incNumbOfTakenSeats() {
        numbOfSeatsTaken++;
    }

    public int getNextAvailableSeat()
    {
        //if full
        if (numbOfSeatsTaken == FLIGHT_CAPACITY)
            return -1;
        else
            return (numbOfSeatsTaken + 1);  
    }

    public void makeReservation(Customer cust)
    {
        //validateCustomer(cust);
//        int seatNumb = getNextAvailableSeat();
        incNumbOfTakenSeats();
        passengers.add(cust);
        // Code to add to text file:
        /**
         * *****************************
         * new line + seatNum: \t Customer name, age, etc...
         ******************************
         */
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
        return DEPARTURE_TIME;
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
        return FLIGHT_CAPACITY - numbOfSeatsTaken;
    }

    
    /**
     * Get the value of departureDate
     *
     * @return the value of departureDate
     */
/*    public Date getArrivalDate() {
        return arrivalDate;
    }
*/    
    
    /**
     * Get the value of arrivalTime
     *
     * @return the value of arrivalTime
     */
    public String getArrivalTime() {
        return ARRIVAL_TIME;
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
     * Get the value of departureLocation
     *
     * @return the value of departureLocation
     */
    public String getDepartureLocation() {
        return departureLocation;
    }
    
    
/*    public String getDate()
    {
        return date;
    }
*/    
    public void setFlightNumber()
    {
        Random rand = new Random();
        int x = 100 + rand.nextInt(99);
        flightNumber = Integer.toString(x);
    }
        
    public String getFlightNumber()
    {
        return flightNumber;
    }
    
    
    public int getPrice()
    {
        return price;
    }
    
    public ArrayList<Customer> costumerList()
    {
        return (ArrayList<Customer>) passengers.clone();
    }
    
//    public Flight addSjcLasFlight()
//    {
//        Flight newFlight = new Flight();
//        newFlight.setFlightNumber();
//        newFlight.setDestinationLocation();
//        newFlight.setArrivalLocation();
//
//        return newFlight;
//    }
    
    @Override
    public String toString()
    {
        return flightNumber + "\t" + departureDate + departureLocation + "-"
                + arrivalLocation +"-" + departureLocation+ " " + DEPARTURE_TIME
                + "\t" + ARRIVAL_TIME + "\t" + getNumbOfAvailSeats()
                + "\t" + price;
    }
    
  
//    private void validateCustomer(Customer cust) {
//        String error = null;
//        if (cust == null) {
//            error = "Variable customer is set to null";
//        } else {
//            if (cust.getName() == null) {
//                error = "Customer name required.";
//            }
//            if (cust.getFullAddress() == null) {
//                error += System.getProperty("line.seperator") + "Customer address required.";
//            }
//            if (cust.getPhoneNumber()<=0) {/*cust.getPhoneNumber() == null*/
//                error += System.getProperty("line.seperator") + "Customer phone number required.";
//            }
//            if (cust.getDateOfBirth() == null) {
//                error += System.getProperty("line.seperator") + "Customer date of birth required.";
//            }
//            if (cust.getGender() != 'm' && cust.getGender() != 'f') {
//                error += System.getProperty("line.seperator") + "Customer gender required.";
//            }
//        }
//        if (!(error == null)) {
//            throw new NullPointerException(error);
//        }
//    }

    private void setDestinationLocation()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void setArrivalLocation()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
