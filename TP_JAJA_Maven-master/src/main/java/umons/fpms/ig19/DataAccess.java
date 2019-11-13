/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umons.fpms.ig19;

import org.apache.*;

import java.io.*;
import java.sql.*;

/**
 *
 * @author noffa
 */
public class DataAccess {
    public static final String DBNAME = "labonneDB";
    private static final String DBUSER = "user005";
    private static final String DBPASS = "user005";
    private static final String DBHOST = "localhost";
    private static final String DBSERVER = "mysql";
    private static final String DBPORT = "3306";
    private static final String DSN = "jdbc:" + DBSERVER + "://" + DBHOST + ":" + DBPORT + "/" + "?useUnicode=true" +
        "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" +
        "serverTimezone=UTC";
    
    private static boolean online = false;
    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // com.mysql.jdbc.Driver is drepracated.
            con = DriverManager.getConnection(DSN, DBUSER, DBPASS);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SHOW DATABASES LIKE '" + DBNAME + "';");  // Looking if the Schema is already created.
            if(!rs.next()) {
                try (Reader reader = new BufferedReader(new FileReader("./db.sql"))) {
                    System.out.println("Creating the Schema. '" + DBNAME + "'.");
                    ScriptRunner runner = new ScriptRunner(con);
                    runner.runScript(reader);
                }
            }
            con.setCatalog(DBNAME);  // Setting the DB of the used connection
            online = true;
        } catch(FileNotFoundException | ClassNotFoundException | SQLException  e) {
            System.out.println("exception: " + e.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException : " + ex);
        } finally {
            if(online) {
                System.out.println("Connection Established... ");
            } else {
                System.out.println("Connection Not Established");
            }
        }
        return con;
    }
}
