package DAO;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import Formato.Mensajes;
import Formato.ManejadorTablas;
import Modelo.MClientes;

public class CRUDClientes extends Conexion{
    
  
    public CRUDClientes (){
        
    }
    
    public void MostrarClientesEnTabla(JTable tabla,JLabel etiqueta){
        String titulos[]={"ID","Dni","Codigo","Nombres","Telefono","Direccion"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        int numeracion = 0;    
        try{
            rs = st.executeQuery("SELECT idclientes,dni,codigo,nombre,telefono,direccion,indicador FROM clientes WHERE indicador = 'S'");
            while(rs.next()){
                numeracion++;
                MClientes MClient = new MClientes();
                MClient.setIdcliente(rs.getInt(1));
                MClient.setDni(rs.getString(2));
                MClient.setCodigo(rs.getString(3));
                MClient.setNombre(rs.getString(4));
                MClient.setTelefono(rs.getString(5));
                MClient.setDireccion(rs.getString(6));
                MClient.setIndicador(rs.getString(7));
                modelo.addRow(MClient.RegistroClientes(numeracion));
            }
            
            etiqueta.setText("NUMERO DE CLIENTES REGISTRADOS: " +numeracion);
            
            ManejadorTablas.FormatoTablaClientes(tabla);
            
            conexion.close();
            
            }catch(Exception ex){
            Mensajes.M1("ERROR no se pueden mostrar los registros de la tabla clientes"+ex);
        }        
    }
    
    public void InsertarRegistroClientes(MClientes MClient){
        try{
        ps = conexion.prepareStatement("INSERT INTO clientes(dni,codigo,nombre,telefono,direccion,indicador) VALUES (?,?,?,?,?,'S');");
        ps.setString(1,MClient.getDni());
        ps.setString(2,MClient.getCodigo());
        ps.setString(3,MClient.getNombre());
        ps.setString(4,MClient.getTelefono());
        ps.setString(5,MClient.getDireccion());
        ps.executeUpdate();
        Mensajes.M1("Datos registrados correctamente");  
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede insertar el registro"+ex);
    }    
} 

    public MClientes ConsultarRegistroClientes(int dniclient){
        MClientes MClient = null;       
        try{
        rs = st.executeQuery("SELECT idclientes,dni,codigo,nombre,telefono,direccion,indicador FROM clientes WHERE indicador='S' AND dni="+dniclient);
        if(rs.next()){           
            MClient =  new MClientes();        
            MClient.setIdcliente(rs.getInt(1));
            MClient.setDni(rs.getString(2));
            MClient.setCodigo(rs.getString(3));
            MClient.setNombre(rs.getString(4));
            MClient.setTelefono(rs.getString(5));
            MClient.setDireccion(rs.getString(6));
            MClient.setIndicador(rs.getString(7));        
        }        
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede encontrar el registro en Clientes"+ex);
    }
    return MClient;    
}
    public void ActualizarRegistroClientes(MClientes MClient){
    try{
        ps = conexion.prepareStatement("UPDATE clientes SET dni = ? , codigo = ? , nombre = ? , telefono = ? , direccion = ? WHERE idclientes=?");
        ps.setString(1,MClient.getDni());
        ps.setString(2,MClient.getCodigo());
        ps.setString(3,MClient.getNombre());
        ps.setString(4,MClient.getTelefono());
        ps.setString(5,MClient.getDireccion()); 
        ps.setInt(6,MClient.getIdcliente());
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos actualizados correctamente");
    }catch(Exception ex){
    Mensajes.M1("ERROR no se puede actualizar el registro categorias "+ex);
    }
}
    public void InhabilitarRegistroClientes(int idclient){
    try{
        ps=conexion.prepareStatement("UPDATE clientes SET indicador = 'F' WHERE idclientes=?");
        ps.setInt(1,idclient);
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos eliminado de la tabla");
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede inhabilitar el registro de clientes"+ex);
    }
}
 
}
