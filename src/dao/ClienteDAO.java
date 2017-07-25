package dao;
import util.DataBase;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;

public class ClienteDAO {
  
    private DataBase db;
    
    public ClienteDAO(){
        db = new DataBase();
    }
    
    public void insert(Cliente cliente){
        String sql = "INSERT INTO TB_CLIENTES (CLI_NOME, CLI_FONE) VALUES (?, ?)";
        try{
        db.open();
        PreparedStatement ps = db.getConnetion().prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getFone());
        ps.executeUpdate();
        } catch(SQLException error) {
            System.out.println("ERRO:" + error);
        } finally {
            db.close();
        }       
    }
    
}
