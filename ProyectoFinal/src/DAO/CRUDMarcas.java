package DAO;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import Formato.Mensajes;
import Formato.ManejadorTablas;
import Modelo.MMarcas;

public class CRUDMarcas extends Conexion  {

    public CRUDMarcas() {
        
    }
    
    public void MostrarMarcasEnTabla(JTable tabla,JLabel etiqueta){
        String titulos[]={"ID","Codigo","Marca","Descripcion"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        int numeracion = 0;    
        try{
            rs = st.executeQuery("SELECT idmarca,codigo,nombre,descripcion,indicador FROM marcas WHERE indicador = 'S'");
            while(rs.next()){
                numeracion++;
                MMarcas MMarc = new MMarcas();
                MMarc.setIdmarca(rs.getInt(1));
                MMarc.setCodigo(rs.getString(2));
                MMarc.setNombre(rs.getString(3));
                MMarc.setDescripcion(rs.getString(4));
                MMarc.setIndicador(rs.getString(5));
                modelo.addRow(MMarc.RegistroMarcas());
            }
            
            etiqueta.setText("Número de registros : " +numeracion);
           
            ManejadorTablas.FormatoTablaMarcas(tabla);

            conexion.close();
            
            }catch(Exception ex){
            Mensajes.M1("ERROR no se pueden mostrar los registros de la tabla Marcas"+ex);
        }        
    }
    
    public void InsertarRegistroMarcas(MMarcas MMarc){
        try{
        ps = conexion.prepareStatement("INSERT INTO marcas (codigo,nombre,descripcion,indicador) VALUES (?,?,?,'S');");
        ps.setString(1,MMarc.getCodigo());
        ps.setString(2,MMarc.getNombre());
        ps.setString(3,MMarc.getDescripcion());
        ps.executeUpdate();
        Mensajes.M1("Datos registrados correctamente");  
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede insertar el registro"+ex);
    }  
        
}
 
    public MMarcas ConsultarRegistroMarcas(int idmarc){
        MMarcas MMarc = null;       
        try{
        rs = st.executeQuery("SELECT idmarca,codigo,nombre,descripcion,indicador FROM marcas WHERE indicador='S' AND idmarca="+idmarc);
        if(rs.next()){           
            MMarc =  new MMarcas();        
            MMarc.setIdmarca(rs.getInt(1));
            MMarc.setCodigo(rs.getString(2));
            MMarc.setNombre(rs.getString(3));
            MMarc.setDescripcion(rs.getString(4));
            MMarc.setIndicador(rs.getString(5));        
        }        
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede encontrar el registro en Marcas"+ex);
    }
    return MMarc;
}
    public void ActualizarRegistroMarcas(MMarcas MMarc){
    try{
        ps = conexion.prepareStatement("UPDATE marcas SET codigo = ? , nombre = ? , descripcion = ?WHERE idmarca=?");
        ps.setString(1,MMarc.getCodigo());
        ps.setString(2,MMarc.getNombre());
        ps.setString(3,MMarc.getDescripcion());
        ps.setInt(4,MMarc.getIdmarca());
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos actualizados correctamente");
    }catch(Exception ex){
    Mensajes.M1("ERROR no se puede actualizar el registro Marcas "+ex);
    }
}
    
    public void InhabilitarRegistroMarcas(int idmarc){
    try{
        ps=conexion.prepareStatement("UPDATE marcas SET indicador = 'F' WHERE idmarca=?");                              
        ps.setInt(1,idmarc);
        ps.executeUpdate();
        ps.close();
        Mensajes.M1("Datos eliminado de la tabla");
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede inhabilitar el registro de marcas"+ex);
    }
}
    
 
}
