package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Search{

    private String termine;
    private String sinonimo;
    private String contrario;
    private String risultato;

    Search(){

    }

    public String getRisultato() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("");
            Statement stmt = con.createStatement();
            ResultSet response = stmt.executeQuery("SELECT termine, sinonimo, contrario FROM dizionario WHERE termine='" + termine + "'");

            termine= response.getString("termine");
            sinonimo= response.getString("sinonimo");
            contrario= response.getString("contrario");

            risultato = "termine:"+termine+", sinonimo:"+sinonimo+", contrario"+contrario;

            return risultato;

        } catch (Exception e) {
            return "errore";
        }
    }

    public String getTermine() {
        return termine;
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

}
