package t8.pars;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class PARSController {

    private static PARSDisplayer display;
    public static ArrayList<Flight> flightList = new ArrayList();
    private static String db = "flightDataBase.db";
    private static final int MAX_NUMBER_FLIGHTS = 60;
    private static final File FILE = new File(db);
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //instantiate objects
        display = new PARSDisplayer();
        boolean loggedIn = false;
        boolean errorExists = false;
        Scanner in = new Scanner(System.in);
        
        
        
        while(true){
            
            //load database
            load();

            //employee login
            display.printRequestEmployeeID();
            String employeeID = in.nextLine();
            display.printRequestEmployeePass();
            String employeePass = in.nextLine();
            //main menu
            loggedIn = Employee.validateEmployee(employeeID, employeePass);
            
            while(loggedIn)
            {
                display.printMainMenu();
                int act = 0;
                do
                {
                    String action = in.nextLine();
                    try
                    {
                        act = Integer.parseInt(action);errorExists = false;
                    }
                    catch(NumberFormatException e)
                    {
                        errorExists = true;
                        display.printMainMenuErrorMessage();
                    } 
                }while(errorExists);

                switch(act)
                {
                    case 1:
                        reserveSeat();break;
                    case 2:
                        getReceipt();break;
                    case 3:
                        getAvailableFlights();break;
                    case 4:
                        printAllReservations();break;
                    case 5:
                        loggedIn = false;break;
                    case 6:
                        System.exit(0);break;
                    default:
                        display.printMainMenuErrorMessage();
                }
            }
        }
    }
    
    private static void reserveSeat()
    {
        System.out.println("Reserve");
        //ask for route
        getAvailableFlights();
        //ask for departure and return dates
        //get the flights associated with each
        //get customer details
            //validate customer details
        //get credit card information
            //validate credit card info
        //create new customer
        //add this to the two flights
        //create new ticket (attach to customer and print)
        //create new reciept (attach to customer and print)
        //save data to file
        
    }
    private static void getReceipt()
    {
        System.out.println("receipt");
        
    }
    private static void getAvailableFlights()
    {
        //for each flight
        for(Flight flight:flightList)
        {
            if(flight.hasOpenSeats())
            {
                //we already know that the flight is not empty
                
                //print out Flight#, Date, and seats remaining
                display.printFlightInfo(flight);
            }
        }
    }
    
    private static void getAllFlightsInfo()
    {
        //for each flight
        for(Flight flight:flightList)
        {
            //we already know that the flight is not empty

            //print out Flight#, Date, and seats remaining
            display.printFlightInfo(flight);
        }
    }   
    
    private static void printAllReservations()
    {
        for(Flight flight:flightList)
        {//print basic flight info            
            display.printManifest(flight);
        }
    }

    public static void save()
    {
        try
        {//use buffering
            OutputStream file = new FileOutputStream( db );
            OutputStream buffer = new BufferedOutputStream( file );
            ObjectOutput output = new ObjectOutputStream( buffer );
            try
            {// Writes to an object
                output.writeObject(new ArrayList<Flight>()); 
            }
            finally
            {
                output.close();
            }
        }  
        catch(IOException ex)
        {
            System.out.println("Error in updating database");
            System.exit(0);
        }    
    }
    
    public static void load()
    {// Create the data objects for us to restore.

        // Wrap all in a try/catch block to trap I/O errors.
        try
        {
            if (!FILE.exists())
            {
                FILE.createNewFile();
            }           
                System.out.println(flightList.size());
                updateFlights();
                System.out.println(flightList.size());
                save();
            // Open file to read from, named SavedObjects.sav.
            FileInputStream file = new FileInputStream(db);
            // Create an ObjectInputStream to get objects from load file.
            ObjectInputStream load = new ObjectInputStream(file);

            // Now we do the restore.
            // readObject() returns a generic Object, we cast those back
            // into their original class type.
            // For primitive types, use the corresponding reference class.
            flightList = (ArrayList<Flight>) load.readObject();
            // Close the file.
            load.close(); // This also closes saveFile.
            
            updateFlights();
        }
        catch(Exception exc){
        exc.printStackTrace(); // If there was an error, print the info.
        }

        // All done.
    }
  
    private static void updateFlights()
    {
        int i =0;
        Date date;
         
        while (flightList.size() < MAX_NUMBER_FLIGHTS)
        {
            i++;
            date = new Date(System.currentTimeMillis() + i*(24*60*60*1000) );
            Flight newFlight1 = new Flight("SJC", "LAS" , date);
            flightList.add(newFlight1);
            Flight newFlight2 = new Flight("LAS", "SJC" , date);
            flightList.add(newFlight2);
        }
    }
}