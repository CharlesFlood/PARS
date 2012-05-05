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
        boolean errorExists = false;
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
                int act = 0;
                do{
                    String action = in.nextLine();
                    try{act = Integer.parseInt(action);errorExists = false;}
                    catch(NumberFormatException e){
                        errorExists = true;
                        display.printMainMenuErrorMessage();
                    } 
                }while(errorExists);
                
                

                switch(act){
                    case 1:
                        System.out.println("Reserve");
                        reserveSeat();break;
                    case 2:
                        System.out.println("receipt");
                        getReceipt();break;
                    case 3:
                        System.out.println("available flights");
                        getAvailableFlights();break;
                    case 4:
                        System.out.println("all reservations");
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
    
    private static void reserveSeat(){
        
    }
    private static void getReceipt(){
        
    }
    private static void getAvailableFlights(){
        
    }
    private static void printAllReservations(){
        
    }
}
