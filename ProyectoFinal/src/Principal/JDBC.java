package Principal;

import java.sql.*;

public class JDBC {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sisventa", "root", "");
            Statement flujo = conexion.createStatement();
            ResultSet data = flujo.executeQuery("SELECT idproveedor,ruc,nombre,telefono,direccion,indicador FROM proveedores WHERE indicador = 'S' ");
            while (data.next()) {
                System.out.println("-----------------------");
                System.out.println("ID PROVEEDORES           : " + data.getInt(1));
                System.out.println("RUC                      : " + data.getString(2));
                System.out.println("NOMBRE                   : " + data.getString(3));
                System.out.println("TELEFONO                 : " + data.getString(4));
                System.out.println("DIRECCION                : " + data.getString(5));
                System.out.println("INDICADOR                : " + data.getString(6));
            }
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error no se puede conectar a la BD"+ex);
        }
    }
    
}
    

