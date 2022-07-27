package DAO;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import Formato.Mensajes;
import Formato.ManejadorTablas;
import Modelo.MClientes;

public class CRUDVentas extends Conexion {

    public CRUDVentas() {
        
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
    
    
}
