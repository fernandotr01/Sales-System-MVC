package DAO;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import Formato.Mensajes;
import Formato.ManejadorTablas;
import Modelo.MProveedores;

public class CRUDProveedores extends Conexion {

    public CRUDProveedores() {
        
    }
    
    public void MostrarProveedoresEnTabla(JTable tabla,JLabel etiqueta){
        String titulos[]={"ID","Ruc","Codigo","Nombres","Telefono","Direccion"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        int numeracion = 0;    
        try{
            rs = st.executeQuery("SELECT idproveedor,ruc,codigo,nombre,telefono,direccion,indicador FROM proveedores WHERE indicador = 'S'");
            while(rs.next()){
                numeracion++;
                MProveedores MProveed = new MProveedores();
                MProveed.setIdproveedor(rs.getInt(1));
                MProveed.setRuc(rs.getString(2));
                MProveed.setCodigo(rs.getString(3));
                MProveed.setNombre(rs.getString(4));
                MProveed.setTelefono(rs.getString(5));
                MProveed.setDireccion(rs.getString(6));
                MProveed.setIndicador(rs.getString(7));
                modelo.addRow(MProveed.RegistroProveedores(numeracion));
            }
            
            etiqueta.setText("NUMERO DE PROVEEDORES REGISTRADOS: " +numeracion);
            
            ManejadorTablas.FormatoTablaProveedores(tabla);
            
            
            conexion.close();
            
            }catch(Exception ex){
            Mensajes.M1("ERROR no se pueden mostrar los registros de la tabla proveedores"+ex);
        }        
    }
    
    public void InsertarRegistroProveedores(MProveedores MProveed){
        try{
        ps = conexion.prepareStatement("INSERT INTO proveedores (ruc,codigo,nombre,telefono,direccion,indicador) VALUES (?,?,?,?,?,'S');");
        ps.setString(1,MProveed.getRuc());
        ps.setString(2,MProveed.getCodigo());
        ps.setString(3,MProveed.getNombre());
        ps.setString(4,MProveed.getTelefono());
        ps.setString(5,MProveed.getDireccion());
        ps.executeUpdate();
        Mensajes.M1("Datos registrados correctamente");  
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede insertar el registro"+ex);
    }
    
} 
    public MProveedores ConsultarRegistroProveedores(int idproveed){
        MProveedores MProveed = null;       
        try{
        rs = st.executeQuery("SELECT idproveedor,ruc,codigo,nombre,telefono,direccion,indicador FROM proveedores WHERE indicador='S' AND idproveedor="+idproveed);
        if(rs.next()){           
            MProveed =  new MProveedores();        
            MProveed.setIdproveedor(rs.getInt(1));
            MProveed.setRuc(rs.getString(2));
            MProveed.setCodigo(rs.getString(3));
            MProveed.setNombre(rs.getString(4));
            MProveed.setTelefono(rs.getString(5));
            MProveed.setDireccion(rs.getString(6));
            MProveed.setIndicador(rs.getString(7));        
        }        
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede encontrar el registro en Proveedores"+ex);
    }
    return MProveed;    
}
    public void ActualizarRegistroProveedores(MProveedores MProveed){
    try{
        ps = conexion.prepareStatement("UPDATE proveedores SET ruc = ? , codigo = ? , nombre = ? , telefono = ? , direccion = ? WHERE idproveedor=?");
        ps.setString(1,MProveed.getRuc());
        ps.setString(2,MProveed.getCodigo());
        ps.setString(3,MProveed.getNombre());
        ps.setString(4,MProveed.getTelefono());
        ps.setString(5,MProveed.getDireccion());
        ps.setInt(6,MProveed.getIdproveedor());
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos actualizados correctamente");
    }catch(Exception ex){
    Mensajes.M1("ERROR no se puede actualizar el registro categorias "+ex);
    }
}
    public void InhabilitarRegistroProveedores(int idproveed){
    try{
        ps=conexion.prepareStatement("UPDATE proveedores SET indicador = 'F' WHERE idproveedor=?");                              
        ps.setInt(1,idproveed);
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos eliminado de la tabla");
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede inhabilitar el registro de proveedores"+ex);
    }
}

    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
