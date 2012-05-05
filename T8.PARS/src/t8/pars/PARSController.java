package t8.pars;
import java.util.Scanner;
public class PARSController {

    private static PARSDisplayer display;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instantiate objects
        display = new PARSDisplayer();
        boolean loggedIn = false;
        Scanner in = new Scanner(System.in);
        
        while(true){
            //employee login
            display.printRequestEmployeeID();
            String employeeID = in.nextLine();
            display.printRequestEmployeePass();
            String employeePass = in.nextLine();
            //main menu
            loggedIn = Employee.validateEmployee(employeeID, employeePass);
            
            while(loggedIn){
                display.printMainMenu();
                String action = in.nextLine();
                
            }
        }
    }
    
    private static void reserveSeat(){
        
    }
    private static void getReceipt(){
        
    }
    private static void getAvailableFlights(){
        
    }
    private static void printAllReservations(){
        
    }
    private static void logout(){
        
    }
    private static void quit(){
        //save all data
        System.exit(0);
    }
}
