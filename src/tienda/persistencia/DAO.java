
package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void ConectarBase() throws Exception{
        
        try {
            
            Class.forName(DRIVER);
            String urlBasedeDatos = "jdbc:mysql://localhost:3306/"+DATABASE+"?useSSL=false";
            conexion = DriverManager.getConnection(urlBasedeDatos, USER, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException e) {
            
            throw e;
        }
    }
    
    protected void DesconectarBase() throws Exception{
        
        try {
            
            if (resultado != null) { 
                resultado.close(); 
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
            
        } catch (Exception e) {
            
            throw e;
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception{
        
        try {
            
            ConectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
        } catch (SQLException | ClassNotFoundException ex) {
            
            throw ex;
            
        }finally{
            
            DesconectarBase();
            
        }
        
    }
    
    protected void consultarBase(String sql) throws Exception{
        
        try {
            
            ConectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            
        } catch (Exception e) {
            
            throw e;
        }
    }
}
