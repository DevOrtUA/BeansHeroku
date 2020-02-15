package servlet;

import org.apache.catalina.filters.ExpiresFilter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Search implements java.io.Serializable{
    private static final long serialVersionUID = 1L;

    private String ricerca;
    private String termine;
    private String sinonimo;
    private String contrario;
    private ArrayList<String> parola = new ArrayList<String> ();

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

            return toString();
        } catch (Exception e) {
            return "Termine non trovato";
        }

    }

    public void setSearch(String ricerca) {
        this.ricerca = ricerca;
    }

    public void setTermine(String termine) {
        this.termine = termine;
    }

    public String getSinonimo() {
        return sinonimo;
    }

    public void setSinonimo(String sinonimo) {
        this.sinonimo = sinonimo;
    }

    public String getContrario() {
        return contrario;
    }

    public void setContrario(String contrario) {
        this.contrario = contrario;
    }


    public String toString() {
        return "Termine:"+this.termine+"<br>Sinonimo:"+this.sinonimo+"<br>Contrario:"+this.contrario;
    }
}
