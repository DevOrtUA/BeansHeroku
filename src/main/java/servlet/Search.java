package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Search {

    private String termine;
    private String sinonimo;
    private String contrario;

    public Search(){

    }

    public String getTermine() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_36d91ccb9e97f8f?user=bf4762acadbdf4&password=48baa9aa");
            Statement stmt = con.createStatement();
            ResultSet response = stmt.executeQuery("SELECT * FROM dizionario WHERE termine='" + this.termine + "'");

            while (response.next()){
                this.termine =response.getString("termine");
                this.sinonimo =response.getString("sinonimo");
                this.contrario =response.getString("contrario");
            }
            if (sinonimo == null && contrario == null){
                return "Termine non trovato";
            }else {
                return toString();
            }
        } catch (Exception e) {
            return "Internal error";
        }

    }

    public void setTermine(String termine) {
        this.termine = termine;
    }

    public String toString() {
        return "Termine:"+this.termine+"<br>Sinonimo:"+this.sinonimo+"<br>Contrario:"+this.contrario;
    }
}
