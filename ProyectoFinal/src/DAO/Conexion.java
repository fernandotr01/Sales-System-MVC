package DAO;

import java.sql.*;
import Formato.Mensajes;


public class Conexion implements Parametros{
    public Connection conexion;
    public Statement st;
    public ResultSet rs;
    public ResultSetMetaData rsmeta;
    public PreparedStatement ps;
    
    public Conexion() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA,USUARIO,CLAVE);
            st = conexion.createStatement();
            
    }catch (Exception ex)   {
        Mensajes.M1("Error no se puede conectar a la BD..."+ex);
    }
        
  }
    
}