package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Search {

    private String ricerca;
    private String termine;
    private String sinonimo;
    private String contrario;

    public Search(){

    }

    public String getSearch() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_36d91ccb9e97f8f?user=bf4762acadbdf4&password=48baa9aa");
            Statement stmt = con.createStatement();
            ResultSet response = stmt.executeQuery("SELECT * FROM dizionario WHERE termine='" + this.ricerca + "'");

            while (response.next()){
                this.termine =response.getString("termine");
                this.sinonimo =response.getString("sinonimo");
                this.contrario =response.getString("contrario");
            }
            if (termine == null){
                return "Termine non trovato";
            }else {
                return toString();
            }
        } catch (Exception e) {
            return "Internal error";
        }

    }

    public void setSearch(String ricerca) {
        this.ricerca = ricerca;
    }

    public String toString() {
        return "Termine:"+this.termine+"<br>Sinonimo:"+this.sinonimo+"<br>Contrario:"+this.contrario;
    }
}
