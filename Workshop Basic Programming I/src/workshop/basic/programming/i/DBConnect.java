package workshop.basic.programming.i;

import java.sql.*;

/**
 *
 * @author patricklange
 */
public class DBConnect {
    
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        try{
            // Point to the driver.
            Class.forName("com.mysql.jdbc.Driver");
            
            // Connection to MySql DB, with location:port, username, password.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/WorkshopIDB","root","admin");
            
            // DB Statement
            st = conn.createStatement();
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error:"+ex);
            
        }
    }
    
    public void getData(){
        try{
            
            String query = "select * from airplane";
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while(rs.next()){
                int id = rs.getInt("id");
                String airplaneName = rs.getString("name");
                int passengers = rs.getInt("passengers");
                int cruiseSpeed = rs.getInt("cruisespeed");
                float fuelCapacity = rs.getFloat("fuelcapacity");
                float fuelBurnrate = rs.getFloat("fuelburnrate");
                System.out.println("ID: "+id+". Airplane: "+airplaneName+". passengers seats: "+passengers+". Cruise speed: "
                +cruiseSpeed+". Fuel capacity: "+fuelCapacity+". Fuel burn rate: "+fuelBurnrate);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
