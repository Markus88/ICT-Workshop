package workshop.basic.programming.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Patrick Lange
 * @version 1.0. Student - Hello World
 */
public class WorkshopBasicProgrammingI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // WARNING! SPAGHETTI CODE IS PRESENT! 
        // THIS IS ONLY TEST CODE (MY FIRST HELLO WORLD IN JAVA)
        // AND SPAGHETTI WILL ROAM AND TAUNT WEAKER PROGRAMMERS SOULS
        // PATRICK LANGE...
        
        // TODO code application logic here
        
        // Part I. "Print Hello World!"
            System.out.println("Hello World!");
        
        // Part II "Readline from keyboard & print it to the screen"
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader keyboard = new BufferedReader(input);

            String readString = null;

            try {
                readString = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(WorkshopBasicProgrammingI.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(readString);   
            
            WorkshopBasicProgrammingI main = new WorkshopBasicProgrammingI();
            main.stringToChars(readString);
                        
         
        // Part III & IX "Create and Instantiate a Java object"
            aircraft f16 = new aircraft();
            f16.setPassengers(1);
            f16.setCruiseSpeed(2410);
            f16.setFuelCapacity(3175);
            f16.setFuelBurnRate(16329);
            
        // Part XI "MySql Database Connection -> See DBConnect.java -
        //  For more info".
            DBConnect connect = new DBConnect();
            connect.getData();
        // DB test 2
           /* try{
                System.out.println("DB TEST RUNNING");
                // 1. Get a connection to database
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
                // 2. Create a statement
                Statement myStmt = myConn.createStatement();
                // 3. Execute SQL query
                ResultSet myRs = myStmt.executeQuery("select * from persons");
                // 4. Prcess the result set
                while(myRs.next()){
                    System.out.println(myRs.getString("name")+ ", "+ myRs.getString("age"));
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }*/
        // Part XII Threading
            ThreadDemo tryThreading = new ThreadDemo();
            tryThreading.RunThreadDemo();
            
    }
    
        // Part X "Methods & Loops & Arrays"
            public char[] stringToChars(String input){
                char characters;
                char[] charArray = new char[input.length()];
                
                // For loop
                for(int i=0; i < input.length(); i++){
                    characters = input.charAt(i);
                    charArray[i] = characters;
                    System.out.println(characters);
                    
                }
                return charArray;
            }
            
        
    
}

// Part III "Create a Java object"
class aircraft{
    private int passengers;         // number of people
    private int cruiseSpeed;        // kilometers per hour
    private double fuelCapacity;    // liters
    private double fuelBurnRate;    // liters per hour

    /**
     * @return the passengers
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * @param passengers the passengers to set
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * @return the cruiseSpeed
     */
    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    /**
     * @param cruiseSpeed the cruiseSpeed to set
     */
    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    /**
     * @return the fuelCapacity
     */
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * @param fuelCapacity the fuelCapacity to set
     */
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * @return the fuelBurnRate
     */
    public double getFuelBurnRate() {
        return fuelBurnRate;
    }

    /**
     * @param fuelBurnRate the fuelBurnRate to set
     */
    public void setFuelBurnRate(double fuelBurnRate) {
        this.fuelBurnRate = fuelBurnRate;
    }
    
}
