package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete { ;

    private String termine;

    public Delete(){

    }

    public String getDelete() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_36d91ccb9e97f8f?user=bf4762acadbdf4&password=48baa9aa");
            Statement stmt = con.createStatement();

            if(stmt.executeUpdate("DELETE FROM dizionario WHERE termine='"+this.termine+"'")==0){
                return "Termine:"+this.termine+" non trovato";
            }else{
                return "Eliminato";
            }

        } catch (Exception e) {
            return "Internal Error";
        }

    }

    public void setTermine(String termine) {
        this.termine = termine;
    }
}
